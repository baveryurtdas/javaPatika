import java.util.Scanner;
public class daireAlanCevreHesaplama {
    public static void main(String[] args) {
        // The area of the entire apartment
        int r,a;
        double pi=3.14,area,environment,sliceArea;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the semi-diameter ");
        r=input.nextInt();
        area = pi*r*r;
        environment = 2*pi*r;
        System.out.println("The area of the apartment : " + area);
        System.out.println("The enviroment of the apartment : " + environment);
        // The area of the circle slice is
        System.out.print("Enter the angle measurement : ");
        a=input.nextInt();
        sliceArea = (pi*(r*r)*a)/360;
        System.out.println("the area of slice " + sliceArea);
    }
}