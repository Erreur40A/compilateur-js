package AST;

import java.util.ArrayList;

/*Déclaration de la fonction*/
public class Fonction extends ExpressionA {
    String nom;
    ExpressionA codeFonction;
    ExpressionA arg;

    public Fonction() {
        super(0);
    }

    public Fonction(String nom, ExpressionA arg, ExpressionA codeFonction) {
        super(codeFonction.size + arg.size + 3);
        this.nom = nom;
        this.arg = arg;
        this.codeFonction = codeFonction;
    }

    public String toString() {
        return String.format("Fonc(%1$s, (%2$s), %3$s)", nom, arg.toString(), codeFonction.toString());
    }

    public String toAssembly() {
        StringBuilder asb = new StringBuilder();

        asb.append("#début déclaration fonction\n");
        asb.append("DecVar ").append(nom);
        asb.append("\nNewClo ").append(arg.size + 1).append("\n");
        asb.append(arg.toAssembly());
        asb.append("SetVar ").append(nom).append("\n");
        asb.append("#fin déclaration fonction\n");
        asb.append("#début code fonction\n");
        asb.append(codeFonction.toAssembly());
        asb.append("#fin code fonction\n");

        return asb.toString();
    }
}
