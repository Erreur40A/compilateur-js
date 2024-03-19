package AST;

abstract class ExpressionB_Binaire extends ExpressionB{
    ExpressionB gauche;
    ExpressionB droite;

    ExpressionB_Binaire (ExpressionB gauche,ExpressionB droite) {
        this.gauche = gauche;
        this.droite = droite;
      }
    
      abstract String symbole(); 
    
      public String toString() {
        return String.format("%1$s(%2$s,%3$s)", symbole(), gauche.toString(), droite.toString());
      }
}
