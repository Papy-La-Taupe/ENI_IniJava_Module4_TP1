package cookingTimer;

import java.util.Scanner;

public class cookingTimer {
		//déclarations des constantes
	public static final int beefRef = 500;
	public static final int porkRef = 400;
	public static final int beefBlueRef = 10;
	public static final int beefCookRef = 17;
	public static final int beefDoneRef = 25;
	public static final int porkBlueRef = 15;
	public static final int porkCookRef = 25;
	public static final int porkDoneRef = 40;
		//déclaration des variables stockant les réponses utilisateur
	public static String meatChoice;
	public static String cookingChoice;
	public static int weightChoice;
	public static int timer;
		//fonction principale du calcul
	public static int calculatingTimer(String meat, String cooking, int weight) {
	
		if ("beef".equals(meat)) {
			switch (cooking) {
			case "blue" :
				timer = (weight*beefBlueRef)/beefRef;
				timer *=60;
				break;
			case "cooked" :
				timer = (weight*beefCookRef)/beefRef;
				timer *=60;
				break;
			case "done" :
				timer = (weight*beefDoneRef)/beefRef;
				timer *=60;
				break;
			default :
				System.out.println("Well that's not ok mate...");
				break;
			}
		}
		else if("pork".equals(meat)) {
			switch (cooking) {
			case "blue" :
				timer = (weight*porkBlueRef)/porkRef;
				timer *=60;
				break;
			case "cooked" :
				timer = (weight*porkCookRef)/porkRef;
				timer *=60;
				break;
			case "done" :
				timer = (weight*porkDoneRef)/porkRef;
				timer *=60;
				break;
			default :
				System.out.println("Well that's not ok mate...");
				break;
			}
		}
		return timer;
	}

	public static void main(String[] args) {
		System.out.println("Veuillez choisir en minuscule une viande, une cuisson, et un poids à cuire.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("choisissez beef ou pork :");
		meatChoice = scanner.nextLine();
		System.out.println("choisissez blue, cooked ou done :");
		cookingChoice = scanner.nextLine();
		System.out.println("indiquez un poids en grammes");
		weightChoice = scanner.nextInt();
		timer = calculatingTimer(meatChoice, cookingChoice, weightChoice);
		System.out.println("");
		System.out.println("Pour cuire " + cookingChoice + " " + weightChoice + "g of " + meatChoice + ", il vous faudra " + timer + " secondes.");
		
		
		
		
		

	}

}
