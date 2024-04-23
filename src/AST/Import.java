package AST;

public class Import extends ExpressionA{
    String commande;
    String argument;

    //A FAIRE
    public Import(String com, String arg){
        super(0);//0 pour l'instant mais a modifié
        commande=com;
        argument=arg;
    }

    public String toAssembly(){
        //lire le fichier arg et retourner son contenu
        String asb=null;

        return asb;
    }
}
