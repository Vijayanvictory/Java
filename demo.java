import java.util.Scanner;
	class Atm{
			Scanner s = new Scanner(System.in);
			int Totalamount = 10000;

	 void UserInput()
		{
			
		
			String userName = "vijayan";
			int password = 12345;
		
			System.out.print("enter your user name:");
			String name = s.next();//nextLine();
			System.out.print("enter your password:");
			int pass = s.nextInt();
			
			
			if(userName.equals(name) && password==pass)
			{
			System.out.println("Welcome back to your account");
			System.out.println("1) Withdraw");
			System.out.println("2) Deposit");
			System.out.println("3) CheckBalance");
			System.out.println("4) Exit");
			System.out.print("Enter your Choice:");
			String option = s.next();
			switch(option)
			{
				case "W":
					Withdraw();
					break;
				case "D":
					Deposit();
					break;
				case "C":
					CheckBalance();
					break;				

				default:
					System.out.println("Choose anyone option:");
			}
			
			}
			else{
				System.out.println("Enter your correct user name and password");
				}		

  
		}

			void Withdraw(){

				System.out.print("Enter your Amount:");
				int amount = s.nextInt();
				if(Totalamount!=0 && amount<Totalamount)
				{
		                Totalamount = Totalamount-amount;
				System.out.print("You received amount:" + amount);
				}
				
				else{
					System.out.println("Enter the valid amount:");
					}
					
			}

			void Deposit(){
				System.out.print("Enter your Deposit amount:");
				int amount = s.nextInt();
				Totalamount = Totalamount + amount;
				System.out.println("Your current balance:" + Totalamount);		
			}
			

			void CheckBalance(){
				System.out.println("Your Current Balance:" + Totalamount);
				System.out.println("Have a nice day ");
			}
			
			
			
		
		
		public static void main(String args[]){
		
		Atm a = new Atm();
		a.UserInput();

		}


		
}