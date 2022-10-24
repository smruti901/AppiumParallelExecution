package JAVAprograms;

import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter tray no:");
		int trayno = sc.nextInt();
		if(trayno==1) {
			System.out.println("Item:");
			System.out.println("BiscuitPrice");
			System.out.println(5);
		}
		else if(trayno==2) {
			System.out.println("Item:");
			System.out.println("ChocolatePrice");
			System.out.println(23);
		}
		else if(trayno==3) {
			System.out.println("Item:");
			System.out.println("ChipsPrice");
			System.out.println(25);
		}
		else if(trayno==4) {
			System.out.println("Item:");
			System.out.println("JuicePrice");
			System.out.println(66);
		}
		else if(trayno==5) {
			System.out.println("Item:");
			System.out.println("IceCreamPrice");
			System.out.println(100);
		}
		else if(trayno==6) {
			System.out.println("Item:");
			System.out.println("CoffePrice");
			System.out.println(51);
		}
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Proceed to payment:");
		String pay = sc1.nextLine();
		
		if(pay.equals("yes")) {
			
			Scanner sc2= new Scanner(System.in);
			System.out.println("Enter amount:");
			int amount = sc2.nextInt();
			System.out.println("Enter notes:");
			int notes = sc2.nextInt();
			
			int total = amount*notes;
			if(total==25) {
				System.out.println("yes");
				System.out.println("Thankyou for purchase");
			}
			else {
				System.out.println("Amount not matching:Please pay with exact change:");
				Scanner sc3= new Scanner(System.in);
				String payAgain = sc3.nextLine();
				if(payAgain.equals("yes")) {
					System.out.println("Thankyou for purchase");
				}
				else if(payAgain.equals("no")) {
					System.out.println("Transaction cancelled");
				}
			}
			
		}
	}

}
