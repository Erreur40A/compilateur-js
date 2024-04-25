package AST;

public class Import extends ExpressionA{
    String commande;
    String argument;

    //A FAIRE
    public Import(String com, String arg){
        super(lineNo(arg));
        commande=com;
        argument=arg;
    }

    public String toAssembly(){
        //lire le fichier arg et retourner son contenu
	String asb=null;
	StringBuilder res = new StringBuilder();
	try{
		FileReader fich = new FileReader(argument+".jsm");
        	BufferedReader r = new BufferedReader(fich);
        	
		while((line = r.readline()) != null) {
			res.append(line).append("\n");
		}        		
	}catch(IOException e) {
		System.out.println("readLine: " + e.getMessage());
	}
	asb = res.toString();
        return asb;
    }
    
    public int lineNo(String arg){
    	int count = 0;
    	try{
    		File fich = new File(arg+".jsm");
    		Scanner sc = new Scanner(fich);
    		
    		while(sc.hasNextLine()){
    			sc.nextLine();
    			count++;
    		}
    		sc.close();
    	}catch(Exception e){
    		e.getStackTrace();
    	}
    	return count;
    }
}
