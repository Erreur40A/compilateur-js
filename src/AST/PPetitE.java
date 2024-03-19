package AST;

public class PPetitE extends ExpressionA_Binaire{
    public PPetitE(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "<=";}

    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "LoEqNb";

        return asb;
    }
}
