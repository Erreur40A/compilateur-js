package AST;

public class Plus extends ExpressionA_Binaire {

    public Plus(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}
        
    public String symbole() {return "plus";}

    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "AddiNb";

        return asb;
    }
}