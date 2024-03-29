package AST;

public class NotEq extends ExpressionA_Binaire{
    public NotEq(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "différent";}
    
    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "NotEql";

        return asb;
    }
}
