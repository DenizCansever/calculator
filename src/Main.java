import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		int perm1,perm2;
		double perm3,perm4;
		char checkPerm;
		int selection;
		
		
		
		boolean check = true;
		while(check) {
			calculator.printChoices();
			selection= scan.nextInt();
			int flag = 1;
			
			switch(selection) {
			
			case 1:
				System.out.println("Would you give me the first number?");
				perm1= scan.nextInt();
				System.out.println("Would you give me the second number?");
				perm2=scan.nextInt();
				System.out.println(calculator.add(perm1,perm2));
				
				while(flag == 1) {
					System.out.println("Do you  want to continue to use calculator? Y/N");
					checkPerm= scan.next().charAt(0);
					if(checkPerm=='y' || checkPerm=='Y') {
						check = true;
						flag=0;
					}
					
					else if(checkPerm =='n' || checkPerm=='N') {
						flag=0;
						check = false;
						
					}
					else{
						System.out.println("Please enter a given input as Y or N");
						
					}
					}
						break;
				
				
				
				
			case 2:
				System.out.println("Would you give me the first number?");
				perm1= scan.nextInt();
				System.out.println("Would you give me the second number?");
				perm2=scan.nextInt();
				System.out.println(calculator.sub(perm1,perm2));
				
				while(flag == 1) {
				System.out.println("Do you  want to continue to use calculator? Y/N");
				checkPerm= scan.next().charAt(0);
				if(checkPerm=='y' || checkPerm=='Y') {
					check = true;
					flag=0;
				}
				
				else if(checkPerm =='n' || checkPerm=='N') {
					flag=0;
					check = false;
					
				}
				else{
					System.out.println("Please enter a given input as Y or N");
					
				}
				}
					break;
				
			
			case 3:
				System.out.println("Would you give me the first number?");
				perm3= scan.nextDouble();
				System.out.println("Would you give me the second number?");
				perm4=scan.nextDouble();
				System.out.println(calculator.div(perm3,perm4));
				
				while(flag == 1) {
					System.out.println("Do you  want to continue to use calculator? Y/N");
					checkPerm= scan.next().charAt(0);
					if(checkPerm=='y' || checkPerm=='Y') {
						check = true;
						flag=0;
					}
					
					else if(checkPerm =='n' || checkPerm=='N') {
						flag=0;
						check = false;
						
					}
					else{
						System.out.println("Please enter a given input as Y or N");
						
					}
					}
						break;
				
			case 4:
				System.out.println("Would you give me the first number?");
				perm1= scan.nextInt();
				System.out.println("Would you give me the second number?");
				perm2=scan.nextInt();
				System.out.println(calculator.mul(perm1,perm2));
				
				while(flag == 1) {
					System.out.println("Do you  want to continue to use calculator? Y/N");
					checkPerm= scan.next().charAt(0);
					if(checkPerm=='y' || checkPerm=='Y') {
						check = true;
						flag=0;
					}
					
					else if(checkPerm =='n' || checkPerm=='N') {
						flag=0;
						check = false;
						
					}
					else{
						System.out.println("Please enter a given input as Y or N");
						
					}
					}
						break;
				
			default:
				System.out.println("Please enter a number between 1 and 4 next time.");
				//check=false;
			}
		}
		
		
			}
				}