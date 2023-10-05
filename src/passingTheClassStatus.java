import java.util.Scanner;
public class passingTheClassStatus {
    public static void main(String[] args) {
        double mat,physic,turkish,chemistry,music,avarage,total, invalidLesson = 0 ,totalLesson = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Your math grade : ");
        mat = input.nextDouble();
        if(mat<0 || mat>100){
            mat=0;
            invalidLesson++;
        }

        System.out.print("Your physic grade : ");
        physic = input.nextDouble();
        if(physic<0 || physic>100){
            physic=0;
            invalidLesson++;
        }
        System.out.print("Your turkish grade : ");
        turkish = input.nextDouble();
        if(turkish<0 || turkish>100){
            turkish=0;
            invalidLesson++;
        }
        System.out.print("Your chemistry grade : ");
        chemistry = input.nextDouble();
        if(chemistry<0 || chemistry>100){
            chemistry=0;
            invalidLesson++;
        }
        System.out.print("Your music grade : ");
        music = input.nextDouble();
        if(music<0 || music>100){
            music=0;
            invalidLesson++;
        }
        total = mat+physic+turkish+chemistry+music ;
        avarage = total / (totalLesson - invalidLesson);
        if(avarage<=55){
            System.out.println("You failed the class.");
        }else{
            System.out.println("You passed the class. ");
        }
        System.out.println("Your avarage : " + avarage);
    }
}