package AST;

public class PPetitE extends ExpressionB_Binaire{
    public PPetitE(ExpressionB gauche,ExpressionB droite) {super(gauche, droite);}
        
    public String symbole() {return "<=";}

    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "LoEqNb";

        return asb;
    }
}
