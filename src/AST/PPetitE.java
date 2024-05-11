package AST;

public class PPetitE extends ExpressionA_Binaire{
    public PPetitE(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "pPetitE";}

    public String toAssembly(){
        String asb=gauche.toAssembly() +
                   droite.toAssembly() +
                   "LoEqNb\n";

        return asb;
    }
}
