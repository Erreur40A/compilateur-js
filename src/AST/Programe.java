package AST;

import java.util.ArrayList;

public class Programe extends ExpressionA {
    ArrayList<ExpressionA> commande;

    public Programe() {
        super(0);
        commande = new ArrayList<ExpressionA>();
    }

    public boolean add(ExpressionA eA) {
        size += eA.size;
        return commande.add(eA);
    }

    public String symbole() {
        return "programme";
    }

    public String toAssembly() {
        String asb = "";

        for (ExpressionA eA : commande) {
            asb += eA.toAssembly();
        }

        asb += "\n";

        return asb;
    }

    public String toString() {
        StringBuilder res = new StringBuilder();

        res.append(symbole()).append("(");
        res.append(commande.get(0).toString());

        for (int i = 1; i < commande.size(); i++) {
            res.append(", ").append(commande.get(i).toString());
        }
        res.append(")");

        return res.toString();
    }
}
