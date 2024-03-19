package AST;

public class Div extends ExpressionA_Binaire{

    public Div(ExpressionA gauche,ExpressionA droite){
        super(gauche, droite);
    }

    public String symbole(){
        return "diviser";
    }

    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "DivNb";

        return asb;
    }
}