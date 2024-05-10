package AST;

public class Variable extends ExpressionA {
    String nom;
    ExpressionA contenu;

    public Variable(String nom) {
        super(0);
        this.nom = nom;
        this.contenu = null;
    }

    public void setContenu(ExpressionA contenu) {
        this.contenu = contenu;
    }

    public String toString() {
        if (contenu == null)
            return String.format("var(%1$s)", nom);

        return String.format("var(%1$s, %2$s)", nom, contenu.toString());
    }

    public String toAssembly() {
        StringBuilder asb = new StringBuilder();

        asb.append("DecVar ").append(nom).append("\n");
        asb.append(contenu.toAssembly());
        asb.append("\nSetVar");

        return asb.toString();
    }
}
