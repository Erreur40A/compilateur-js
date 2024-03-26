package AST;

public class Num extends ExpressionA {
  public float num;
    
  public Num(float num) {
    this.num = num;
  }
  
  public String toString() {
    return Float.toString(num);
  }

  public String toAssembly(){
    return "CsteNb " + num;
  }
}
