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

        asb.append(condition.toAssembly());
        asb.append("CondJmp ").append(bloc.size+1).append("\n");
        asb.append(bloc.toAssembly());
        asb.append("Jump ").append(-condition.size - bloc.size - 2).append("\n");

        return asb.toString();
    }

    public String toString() {
        return String.format("while(%1$s) then(%2$s)", condition.toString(), bloc.toString());
    }
}
