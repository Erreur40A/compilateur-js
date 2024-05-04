package AST;

public class While extends ExpressionA{
    ExpressionA condition;
    ExpressionA bloc;

    public While(ExpressionA condition, ExpressionA bloc){
        super(condition.size + bloc.size + 2);
        this.condition=condition;
        this.bloc=bloc;
    }

    public String toAssembly(){
        StringBuilder asb = new StringBuilder();

        return asb.toString();
    }

    public String toString() {
        return String.format("while(%1$s) then(%2$s)", condition.toString(), bloc.toString());
    }
}
