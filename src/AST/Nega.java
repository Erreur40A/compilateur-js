package AST;

public class Nega extends ExpressionA{
    public ExpressionA arg;

    public Nega(ExpressionA arg) {
        super(arg.size+1);
        this.arg = arg;
    }

    public String toString() {
        return String.format("not(%1$s)", arg.toString());
    }

    public String toAssembly(){
        String asb=arg.toAssembly() + "Not\n";

        return asb;
    }
}
