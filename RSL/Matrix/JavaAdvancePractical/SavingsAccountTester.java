package JavaAdvancePractical;
import java.util.*;
public class SavingsAccountTester{
	public static void main(String[] args){
		SavingsAccount vivekSavings = new SavingsAccount(1000, 0.0);
                
                while(true){
                    System.out.println("\n1.deposit\n2.withdraw\n3.CheckBalance");
                    
                    Scanner sc = new Scanner(System.in);
                    System.out.println("enter your choice!!");
                    int ch = sc.nextInt();
                    switch(ch){
                        
                        case 1:
                            System.out.println("enter the amount you want to deposite:");
                            int amount1 = sc .nextInt();
                            vivekSavings.deposit(amount1);
                            System.out.println("your balance is :"+vivekSavings.getBalance());
//                            System.exit(0);
                            break;
                        case 2:
                            System.out.println("enter the amount you want to withdraw:");
                            int amount2 = sc.nextInt();
                            vivekSavings.withdraw(amount2);
                            System.out.println("your balance is :"+vivekSavings.getBalance());
//                            System.exit(0);
                            break;
                        case 3:
                            System.out.println("your balance is :"+vivekSavings.getBalance());
                            System.out.println("Visit Again!!");
//                            System.exit(0);
                            break;
                        default :
                            System.out.println("Invalid choice!!");
                            System.exit(0);
                            break;
                    }
                }
	}
}