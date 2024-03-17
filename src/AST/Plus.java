package AST;

public class Plus extends ExpressionA_Binaire {

    public Plus(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}
        
    public String symbole() {return "plus";}

    public String toAssembly(){
        String asb=droite.toAssembly() + "\n" +
                   gauche.toAssembly() + "\n" +
                   "PlusNb";

        return asb;
    }

}
