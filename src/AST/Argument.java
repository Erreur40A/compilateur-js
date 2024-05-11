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

        res.append(arg.get(0).toString());

        for (int i = 1; i < arg.size(); i++) {
            res.append(", ").append(arg.get(i).toString());
        }

        return res.toString();
    }

    public String toAssembly() {
        StringBuilder asb = new StringBuilder();

        for (ExpressionA e : arg) {
            asb.append(e.toAssembly()).append("\n");
            asb.append("SetArg\n");
        }

        return asb.toString();
    }
}
