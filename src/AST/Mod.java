package AST;

public class Mod extends ExpressionA_Binaire {

    public Mod(ExpressionA gauche,ExpressionA droite) {super(gauche, droite);}

    public String symbole() {return "pourcent";}
    
    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   droite.toAssembly() + "\n" +
                   "ModuNb";
        return asb;
    }

}
