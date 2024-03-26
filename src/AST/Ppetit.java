package AST;

public class Ppetit extends ExpressionA_Binaire{
    public Ppetit(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "pPetit";}
    
    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "LoStNb";

        return asb;
    }
}
