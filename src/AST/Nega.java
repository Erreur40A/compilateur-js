package AST;

public class Nega extends ExpressionA{
    public ExpressionA arg;

    public Nega(ExpressionA arg) {
        this.arg = arg;
    }

    public String toString() {
        return String.format("not(%1$s)", arg.toString());
    }

    public String toAssembly(){
        String asb=arg.toAssembly() + "\n" +
                   "Not";

        return asb;
    }
}
