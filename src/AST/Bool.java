package AST;

public class Bool extends ExpressionA{
    boolean b;

    public Bool(boolean b){
        super(1);
        this.b=b;
    }

    public String toString() {
        return Boolean.toString(b);
    }

    public String toAssembly(){
        return "CsteBo " + b + "\n";
    }
}
