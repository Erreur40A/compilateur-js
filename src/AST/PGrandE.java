package AST;

public class PGrandE extends ExpressionA_Binaire{
    public PGrandE(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "pGrandE";}

    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "GrEqNb";

        return asb;
    }
}
