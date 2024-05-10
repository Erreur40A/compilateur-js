package AST;

public class Return extends ExpressionA {
    ExpressionA e;

    public Return(ExpressionA e) {
        super(e.size + 1);
        this.e = e;
    }

    public String symbole() {
        return "return";
    }

    public String toString() {
        return String.format("return(%1$s)", e.toString());
    }

    public String toAssembly() {
        String asb = e.toAssembly() + "\nReturn";

        return asb;
    }
}
