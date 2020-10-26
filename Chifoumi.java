package fr.ibformation.chifoumi;
import java.util.Random;
import java.util.Scanner;
public class Chifoumi {

	public static void main(String[] args) {
		
		String[] myStringArray = {"Caillou", "Ciseaux", "Papier"};
		String pcChoise = "";
		String playerChoise = "";
		int winNumPc = 0;
		int winNumPlayer = 0;
		int playerIndexChoise;
	
		while (winNumPc < 3 && winNumPlayer < 3 ) {
			// Generate random integers in range 0  to 3
			Random rand = new Random(); 
	        int randomIndex = rand.nextInt(3); 
	        
	        //user choice
	        System.out.print("Rentrez 0 pour choisir Caillou, 1 pour choisir Ciseaux et 2 pour choisir Papier");
	        Scanner scannerUser = new Scanner(System.in);
	        playerIndexChoise = scannerUser.nextInt();
	        while (playerIndexChoise > 2 || playerIndexChoise < 0) {
	        	System.out.println("SVP 0,1 ou 2!!");
	        	playerIndexChoise = scannerUser.nextInt();
	        }
	        playerChoise = myStringArray[playerIndexChoise];
	        System.out.print("tu as choisi:" + playerChoise + "\n");
	        
	        //pc choice0
	        pcChoise = myStringArray[randomIndex];
	        System.out.print("	PC a choisi:" + pcChoise + "\n" );
	        
            
            // win or loose
            if (playerChoise == pcChoise){
                System.out.print("It is a tie" + "\n");
            } else {
            switch (playerChoise) {
	            case "Caillou":
	            		if (pcChoise == "Ciseaux") {
		            		System.out.println("Tu as gagné!");
		            		winNumPlayer++;
		            	} else {
		            		System.out.println("PC gagne!"+ "\n");
		            		winNumPc++;
		            	}
	            		break;
	            case "Ciseaux":
	            		if (pcChoise == "Papier") {
		            		System.out.println("Tu as gagné!" + "\n");
		            		winNumPlayer++;         		
		            	} else {
		            		System.out.println("PC wins!"+ "\n");
		            		winNumPc++;
		            		}
	            		break;
	            case "Papier":
		            	if (pcChoise == "Caillou") {
		            		System.out.println("Tu as gagné!"+ "\n");
		            		winNumPlayer++;
		            	} else {
		            		System.out.println("PC wins !"+ "\n");
		            		winNumPc++;
		            	}
		            	break;
	            default:
	                System.out.println("What??");
            	}
            }//fin else
        System.out.println("le PC a gagné :" + winNumPc + " fois");
        System.out.println("Tu as gagné :" + winNumPlayer + " fois");
		}//fin while
		if (winNumPlayer == 3) {
			System.out.println("Tu as gagné la partie,  bravo!");
		} else if (winNumPc == 3) {
			System.out.println("Le pc a gagné la partie,  :(");
		}
		
	}
}
