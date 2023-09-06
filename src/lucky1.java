import java.util.Scanner;

import java.util.Random;

public class lucky1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		
		String vastaus = "";
		int raha = 0;
//		raha = Integer.parseInt(in.nextLine);
		
		System.out.println("*******\n\nTervetuloa pelaamaan Lucky7!\n\n*******");
		vastaus = in.nextLine();
		
//		System.out.println("Syötä summa jolla haluat pelata.");
//		System.out.println("");
//		vastaus = in.nextLine();
//		raha = Integer.parseInt(in.nextLine);

		
		do{	
			
		int random1 = random.nextInt(10)+1; //Add 1 to have the random numbers between 1 and 10.
		int random2 = random.nextInt(10)+1;
		int random3 = random.nextInt(10)+1;
		
		
		
			System.out.print(" Numerosi ovat " + (random1) + ", " + random2 + " ja " + random3);
			//This gives three random numbers to the player.
			raha = raha - 1; //The cost of playing one round.
			
				if(random1 == 7 || (random2) == 7 || (random3) == 7)
				{
					System.out.println("\n\nOnnea voittajalle! \n");
					if((random1 == 7 && random2 != 7 && random3 != 7) || (random1 != 7 && random2 == 7 && random3 != 7) || (random1 != 7 && random2 != 7 && random3 == 7))
						//If one of the numbers is seven and other two are not.
					{
						System.out.println("Voitit 3 €! Pelikassa " + (raha + 3) + " €\n");
						raha = raha + 3; //The prize money is added to the players funds.
					}
					
					//If one of the numbers is 7, the player gets three more euros.
					else if((random1 == 7 && random2 == 7 && random3 != 7) || (random1 != 7 && random2 == 7 && random2 == 7) || (random1 == 7 && random2 != 7 && random3 == 7))
					{
						System.out.println("Voitit 5 €! Pelikassa " + (raha + 5) + " €\n");
						raha = raha + 5;
					}
					//if two of the numbers are seven, the player gets five more euros.
					else if(random1 == 7 && random2 == 7 && random3 == 7)
					{
						System.out.println("Päävoitto! Voitit 10 €! Pelikassa " + (raha + 10) + " €\n");
						raha = raha + 10;
					}
					
				else if(random1 != 7 && random2 != 7 && random3 != 7)
				{
					System.out.println("Ei voittoa."); //This does nothing, but I am too afraid to remove it. It could be a load bearing line.
				}
					
				}
				
				if(vastaus.equals("") && raha > 0)
				{
				System.out.println("\n\nPelaa uusi kierros painamalla enter\nPelikassan saldo: " + raha + " €");
				vastaus = in.nextLine();
				if(raha == 0)
					System.out.println("\nPeli päättyy.");
				}
				
		
		
		}while(!vastaus.equals("e") && raha > 0); //The game ends when the player runs out of money or decides to stop playing.
		System.out.println("Kiitos pelaamisesta, pelitilin saldo: " + raha + (" €"));
				{
					
					
				}
		

			
		

	}

}
