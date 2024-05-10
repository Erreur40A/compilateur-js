package AST;

/*Appel de fonction*/
public class CallFonction extends ExpressionA {
    public String nom;
    public ExpressionA arg;

    public CallFonction(String nom, ExpressionA arg) {
        super(1);
        this.nom = nom;
        this.arg = arg;
        if (arg != null)
            size = arg.size + 1;
    }

    public String toString() {
        if (arg != null)
            return String.format("%1$s(%2$s)", nom, arg.toString());
        return String.format("%1$s()", nom);
    }

    public String toAssembly() {
        StringBuilder asb = new StringBuilder();

        asb.append("DecVar ").append(nom).append("\n");
        asb.append("StCall\n");
        asb.append(arg.toAssembly());
        asb.append("Call");

        return asb.toString();
    }
}
