package AST;

import java.util.ArrayList;

public class Programe extends ExpressionA{
    ArrayList<ExpressionA> commande;

    public Programe(){
        super(0);
        commande = new ArrayList<ExpressionA>();
    }

    public Programe(ExpressionA eA){
        super(0);
        commande = new ArrayList<ExpressionA>();
        commande.add(eA);
    }

    public boolean add(ExpressionA eA){
        size += eA.size;
        return commande.add(eA);
    }

    public String symbole() {return "programme";}

    public String toAssembly(){
        String asb = "";

        for (ExpressionA eA : commande) {
            asb += eA.toAssembly() + "\n";
        }

        return asb;
    }

    public String toString(){
        String res=symbole() + "(";

        res += commande.get(0);

        for (int i = 1; i < commande.size(); i++) {
            res += "," + commande.get(i).toString();
        }

        res+=")";

        return res;
    }
}
