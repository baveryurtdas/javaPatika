import java.util.Scanner;

public class flightTicketCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, perKm = 0.10, flightFee, age, discountRate = 0, discountFee, discountedAmount, roundTripRate, total;
        String select;

        //Retrieving data from the user

        System.out.print("Enter the distance in KM : ");
        km = input.nextDouble();
        if (km <= 0) {
            System.out.println("The distance must be greater than 0");
        }

        //Determining discount rate according to age range

        System.out.print("Please enter your age : ");
        age = input.nextDouble();
        if (age < 0) {
            System.out.println("Age must be 0 or greater than 0.");
        } else if (age < 12) {
            discountRate = 0.5;
        } else if (age <= 24) {
            discountRate = 0.10;
        } else if (age > 65) {
            discountRate = 0.30;

        }

        //Price determination according to trip type

        System.out.print("Enter the trip type ('1' => One way, '2' => Round Trip) :  ");
        select = input.next();


        if (select.equals("2")) {
            //Set a discounted price for a round trip

            flightFee = km * perKm;
            discountFee = flightFee * discountRate;
            discountedAmount = flightFee - discountFee;
            roundTripRate = (discountedAmount * 0.20);
            total = (discountedAmount - roundTripRate) * 2;
            System.out.print("Total amount to be paid : " + total);


        } else if (select.equals("1")) {
            //Determining the price for one way

            flightFee = km * perKm;
            discountFee = flightFee * discountRate;
            discountedAmount = flightFee - discountFee;
            System.out.print("Total amount to be paid : " + discountedAmount);
        } else {
            System.out.println("You entered an invalid option");
        }
    }

}
