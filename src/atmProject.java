import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 2100;
        int select;

        //Actions to be taken if the number of login rights is more than 0
        while (right > 0) {
            System.out.print("Username : ");
            userName = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello,welcome to the bank we are coding");
                System.out.println("1-Deposit Money\n" +
                                    "2-Withdraw Money\n" +
                                    "3-Balance learning\n" +
                                    "4-Log out\n");

                System.out.print("Select the action you want to perform : ");
                select = scan.nextInt();
                switch (select){
                    case 1 :
                        System.out.print("Amount of money to be deposit : ");
                        int priceDeposit = scan.nextInt();
                        balance+=priceDeposit;
                        System.out.println("Your total balance : " + balance);
                        break;

                    case 2 :
                        System.out.print("Amount of money to be withdraw : ");
                        int priceWithdraw = scan.nextInt();
                        if(priceWithdraw>balance){
                            System.out.println("Insufficient balance");
                        }else{
                            balance-=priceWithdraw;
                            System.out.println("Your total balance : " + balance);
                        }
                        break;
                    case 3 :
                        System.out.println("Your balance : " + balance);
                        break;
                    case 4 :
                        System.out.println("See you later.");
                        break;
                    default:
                        System.out.println("You entered an invalid transaction number.");
                        break;


                }
                return;

            }else{
                right--;
                System.out.println("Username or password is wrong, please try again");
                if(right==0){
                    System.out.println("Your account has been blocked, please contact the bank.");
                }else{
                    System.out.println("Your remaining right : " + right);
                }
            }

        }
    }
}
