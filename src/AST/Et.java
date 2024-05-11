package AST;

public class Et extends ExpressionA_Binaire{
    public Et(ExpressionA g, ExpressionA d){
        super(g, d);
    }

    public String symbole() {return "&&";}

    public String toAssembly(){
        String asb=gauche.toAssembly() +
                   "ConJmp "+ (droite.size + 1) + "\n" +
                   droite.toAssembly() +
                   "Jump 1\n" +
                   "CsteBo False\n";

        return asb;
    }
}
