package AST;

public class Egalite extends ExpressionB_Binaire{
    public Egalite(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}
    
    public String symbole() {return "==";}

    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "Equals";

        return asb;
    }
}
