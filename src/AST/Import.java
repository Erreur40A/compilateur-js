package AST;

public class Import extends ExpressionA{
    String commande;
    String argument;

    Import(String com, String arg){
        super();
        commande=com;
        argument=arg;
    }

    public String toAssembly(){
        //lire le fichier arg et retourner son contenu
        String asb=null;

        return asb;
    }
}
