package AST;

public class IfThenElse extends ExpressionA{
    ExpressionA condition;
    ExpressionA blocIf;
    ExpressionA blocElse;

    public IfThenElse(ExpressionA condition, ExpressionA blocIf, ExpressionA blocElse){
        super(condition.size + blocIf.size + blocElse.size + 2);
        this.condition=condition;
        this.blocIf=blocIf;
        this.blocElse=blocElse;
    }

    public String toAssembly(){
        StringBuilder asb = new StringBuilder();

        asb.append(condition.toAssembly());
        asb.append("CondJmp ").append(blocIf.size + 1);
        asb.append("\nJump ").append(blocElse.size);
        asb.append("\n").append(blocElse.size);

        return asb.toString();
    }

    public String toString() {
        return String.format("\nif(%1$s)\nthen(%2$s)\nelse(%3$s)", condition.toString(), blocIf.toString(), blocElse.toString());
    }
}
