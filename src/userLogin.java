import java.util.Scanner;
public class userLogin {
    public static void main(String[] args) {
        String userName,password,select,newPassword;

        Scanner inp = new Scanner(System.in);
        //Retrieving data from the user

        System.out.print("Your username : ");
        userName =inp.nextLine();
        System.out.print("Your password : ");
        password = inp.nextLine();

        //If all the information is correct, there is no error entry
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("You have logged in");

        //If all the information is wrong
        }else if(!userName.equals("patika") && !(password.equals("java123"))){
            System.out.println("Username or password is incorrect");

            //only if the username is incorrect
        }else if (!userName.equals("patika")){
            System.out.print("Username is wrong");
            //only if the password is correct and asking the user if he wants to change the password
        }else {
            System.out.println("Password is wrong");
            System.out.println("If you have forgotten your password, please follow the steps\nSelect to create a new password : 'Y'\nTo avoid making changes to your password : 'N'");
            System.out.print("Your choice : ");
            select = inp.nextLine();

            //orientation by choice
            if(select.equals("Y") || select.equals("y")) {
                System.out.println("Please enter your new password (Your new password should not be the same as your old password) : ");
                newPassword = inp.nextLine();
                if (!newPassword.equals("java123")) {
                    System.out.print("Your new password has been created successfully.");
                } else {
                    System.out.println("WRONG ! Your new password cannot be the same as your old password. Please try again. ");
                }
            }else if(select.equals("N") || select.equals("n")){
                System.out.print("You left the page.");
            }else{
                System.out.println("Please make the right choice. ");
            }
        }
    }
}
