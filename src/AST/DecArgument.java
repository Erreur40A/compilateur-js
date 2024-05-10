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
        StringBuilder res = new StringBuilder();

        res.append(arg.get(0).toString());

        for (int i = 1; i < arg.size(); i++) {
            res.append(", ").append(arg.get(i).toString());
        }

        return res.toString();
    }

    public String toAssembly() {
        StringBuilder asb = new StringBuilder();

        asb.append("DecArg ").append(arg.get(0).nom);

        for (int i = 1; i < arg.size(); i++) {
            asb.append("\nDecArg ").append(arg.get(i).nom);
        }

        return asb.toString();
    }
}
