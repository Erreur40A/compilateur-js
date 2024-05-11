package AST;

/*Appel de fonction*/
public class CallFonction extends ExpressionA {
    public String nom;
    public ExpressionA arg;

    public CallFonction(String nom, ExpressionA arg) {
        super(3);
        this.nom = nom;
        this.arg = arg;
        if (arg != null)
            size = arg.size + 3;
    }

    public String toString() {
        if (arg != null)
            return String.format("callFonc(%1$s, %2$s)", nom, arg.toString());
        return String.format("callFonc(%1$s, null)", nom);
    }

    public String toAssembly() {
        StringBuilder asb = new StringBuilder();

        asb.append("GetVar ").append(nom).append("\n");
        asb.append("StCall\n");
        asb.append(arg.toAssembly());
        asb.append("Call\n");

        return asb.toString();
    }
}
