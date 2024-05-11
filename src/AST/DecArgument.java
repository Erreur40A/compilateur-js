package AST;

import java.util.ArrayList;

public class DecArgument extends ExpressionA {

    ArrayList<Variable> arg;

    public DecArgument() {
        super(0);
        arg = new ArrayList<Variable>();
    }

    public void add(Variable e) {
        arg.add(e);
        setSize(++size);
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

        for (int i = 0; i < arg.size(); i++) {
            asb.append("DecArg ").append(arg.get(i).nom).append("\n");
        }

        return asb.toString();
    }
}
