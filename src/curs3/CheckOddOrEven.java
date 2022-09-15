package curs3;

import java.util.Scanner;

// CamelCase 
// UpperCamelCase --> numele claselor
// lowerCamelCase --> metode, variabile

public class CheckOddOrEven {
	
	/*progam care intreaba userul un numar
	 * si verifica daca este par sau impar
	 * Printam inconsola rezultatul
	 */
	
	int number;
	public void askTheUserForNumber( ) {
		
		System.out.println("please enter a number :");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
						
	}

	public void checkIfNumberIsOddOrEven() {
		
		if(number % 2 == 0) {
			System.out.println(number + " : is even!");
			
		
		}else {
		
		System.out.println(number + " : is odd!");	
			
		}
		
		}
	}
	

