package AST;

public class Variable extends ExpressionA {
    String nom;

    public Variable(String nom) {
        super(1);
        this.nom = nom;
    }

    public String toString() {
        return String.format("var(%1$s)", nom);
    }

    public String toAssembly() {
        StringBuilder asb = new StringBuilder();

        asb.append("GetVar ").append(nom).append("\n");

        return asb.toString();
    }
}
