package AST;

public abstract class ExpressionA extends AST {
    public abstract String toAssembly();

    public ExpressionA(int size){
        super();
        this.size=size;
    }
}
