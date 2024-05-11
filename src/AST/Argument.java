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
        if(arg.size() == 0) return "";

        StringBuilder res = new StringBuilder();

        res.append(arg.get(0).toString());

        for (int i = 1; i < arg.size(); i++) {
            res.append(", ").append(arg.get(i).toString());
        }

        return res.toString();
    }

    public String toAssembly() {
        if(arg.size() == 0) return "";

        StringBuilder asb = new StringBuilder();

        for (ExpressionA e : arg) {
            asb.append(e.toAssembly());
            asb.append("SetArg\n");
        }

        return asb.toString();
    }
}
