public class ArrayAvarage {
    public static void main(String[] args) {
        int[] list = {15, 58, 24, 48, 21, 78, 99};
        double sum = 0;
        double sumOfHarmonic =0.0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        for(int numbers : list){
            sumOfHarmonic+=1.0/numbers;
        }

        double harmonicAvarage=list.length/sumOfHarmonic;

        System.out.println("Dizide ki elemanların ortalaması : " + sum / list.length);
        System.out.println("Dizide ki elemanların harmonik ortalaması : " + harmonicAvarage );

    }


}
