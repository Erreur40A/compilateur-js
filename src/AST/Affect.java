package AST;

public class Affect extends ExpressionA{
	
	public String ident;
	public ExpressionA val;
	
	public Affect(String ident,ExpressionA val){
		this.ident=ident;
		this.val=val;
	}
	
	public string toAssembly{
		String asb = val.toAssembly + "\n" + "SetVar " + ident;
		
		return asb;
	}
}
