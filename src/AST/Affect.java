package AST;

public lass Affect extends ExpressionA {

	public String ident;
	public ExpressionA val;

	public Affect(String ident, ExpressionA val) {
		super(val.size + 1);
		this.ident = ident;
		this.val = val;
	}

	public String toString() {
		return String.format("affect(%1$s, %2$s)", ident, val.toString());
	}

	public String toAssembly() {
		String asb = val.toAssembly() +
				"SetVar " + ident + "\n";

		return asb;
	}
}
