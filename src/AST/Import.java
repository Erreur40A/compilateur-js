package AST;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
	StringBuilder asb = new StringBuilder();
	String line;

	try{
		FileReader fich = new FileReader(argument+".jsm");
        BufferedReader r = new BufferedReader(fich);
        	
		while((line = r.readLine()) != null) {
			asb.append(line).append("\n");
		}        		

		r.close();
	}catch(IOException e) {
		System.out.println("readLine: " + e.getMessage());
	}
	
    return asb.toString();
    }
    
    public static int lineNo(String arg){
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
