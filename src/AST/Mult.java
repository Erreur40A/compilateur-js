package AST;

public class Mult extends ExpressionA_Binaire {

    public Mult(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "fois";}
    
    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "MultNb";

        return asb;
    }

}
