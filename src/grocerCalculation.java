import  java.util.Scanner;
public class grocerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pear,apple,tomato,banana,eggplant,pearBuy,appleBuy,tomatoBuy,bananaBuy,eggplantBuy,pay
        ;
        // Product information
        pear = 2.14;
        apple = 3.67;
        tomato = 1.11;
        banana = 0.95;
        eggplant = 5.00;

        System.out.print("How many kg of pears ? ");
        pearBuy = input.nextDouble();
        System.out.print("How many kg of apples ? ");
        appleBuy = input.nextDouble();
        System.out.print("How many kg of tomatos ? ");
        tomatoBuy = input.nextDouble();
        System.out.print("How many kg of bananas ? ");
        bananaBuy = input.nextDouble();
        System.out.print("How many kg of eggplants ? ");
        eggplantBuy = input.nextDouble();

        pay=(pear*pearBuy)+(apple*appleBuy)+(tomato*tomatoBuy)+(banana*bananaBuy)+(eggplant*eggplantBuy);
        System.out.print("Amount payable : " + pay);

    }
}
