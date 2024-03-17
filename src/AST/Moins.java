package AST;

public class Moins extends ExpressionA_Binaire {

    public Moins(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "moins";}

    public String toAssembly(){
        String asb=droite.toAssembly() + "\n" +
                   gauche.toAssembly() + "\n" +
                   "SubiNb";

        return asb;
    }
}
