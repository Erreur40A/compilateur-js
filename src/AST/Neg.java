package AST;

public class Neg extends ExpressionA {

    public ExpressionA arg;

    public Neg(ExpressionA arg) {
        super(arg.size+1);
        this.arg = arg;
    }

    public String toString() {
        return String.format("neg(%1$s)", arg.toString());
    }

    public String toAssembly(){
        String asb=arg.toAssembly() + "NegaNb\n";

        return asb;
    }
}	
