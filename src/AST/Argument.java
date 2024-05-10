package AST;

import java.util.ArrayList;

public class Argument extends ExpressionA {
    ArrayList<ExpressionA> arg;

    public Argument() {
        super(0);
        arg = new ArrayList<ExpressionA>();
    }

    public void add(ExpressionA e) {
        arg.add(e);
    }

    public String toString() {
        StringBuilder res = new StringBuilder();

        for (ExpressionA e : arg) {
            res.append(e.toString());
        }

        return res.toString();
    }

    public String toAssembly() {
        return "";
    }
}
