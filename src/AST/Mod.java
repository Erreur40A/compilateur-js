package AST;

public class Mod extends ExpressionA_Binaire {

        pubic Mod(ExpressionA gauche, ExpressionA droite) {
        super(gauche, droite);
    }

    public String symbole() {
        return "mod";
    }

    public String toAssembly() {
        String asb = gauche.toAssembly() +
                droite.toAssembly() +
                "ModuNb\n";
        return asb;
    }

     
        
    
}

        
    

    