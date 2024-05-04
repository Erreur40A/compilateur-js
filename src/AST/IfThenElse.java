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
        asb.append("\nCondJmp ").append(blocIf.size + 1).append("\n");
        asb.append(blocIf.toAssembly());
        asb.append("\nJump ").append(blocElse.size).append("\n");
        asb.append(blocElse.toAssembly());

        return asb.toString();
    }

    public String toString() {
        return String.format("if(%1$s) then(%2$s) else(%3$s)", condition.toString(), blocIf.toString(), blocElse.toString());
    }
}
