package AST;

public class Et extends ExpressionA_Binaire{
    public Et(ExpressionA d, ExpressionA g){
        super(d, g);
    }

    public String symbole() {return "&&";}

    public String toAssembly(){
        String asb=gauche.toAssembly() + "\n" +
                   "ConJmp "+ (droite.size + 1) + "\n" +
                   droite.toAssembly() + "\n" +
                   "Jump 1\n" +
                   "CsteBo False\n";

        return asb;
    }
}
