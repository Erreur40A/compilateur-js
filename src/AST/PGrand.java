package AST;

public class PGrand extends ExpressionA_Binaire{
    public PGrand(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "pGrand";}

    public String toAssembly(){
        String asb=gauche.toAssembly() +
                   droite.toAssembly() +
                   "GrStNb\n";

        return asb;
    }
}
