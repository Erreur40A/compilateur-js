package AST;

public class Bool extends ExpressionA{
    public boolean b;

    public Bool(boolean b){
        this.b=b;
    }

    public String toString() {
        return Boolean.toString(b);
    }

    public String toAssembly(){
        return "CsteBo " + b;
    }
}
