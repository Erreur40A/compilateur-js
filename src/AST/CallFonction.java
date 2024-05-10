package AST;

public class CallFonction extends ExpressionA {
    public String nom;
    public ExpressionA arg;

    public CallFonction(String nom, ExpressionA arg) {
        super(arg.size + 1);
        this.nom = nom;
        this.arg = arg;
    }

    public String toString() {
        return String.format("%1$s(%2$s)", nom, arg.toString());
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
