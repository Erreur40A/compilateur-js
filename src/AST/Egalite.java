package AST;

public class Egalite extends ExpressionA_Binaire{
    public Egalite(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}
    
    public String symbole() {return "egale";}

    public String toAssembly(){
        String asb=gauche.toAssembly() +
                   droite.toAssembly() +
                   "Equals\n";

        return asb;
    }
}
