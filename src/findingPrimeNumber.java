public class findingPrimeNumber {
    public static void main(String[] args) {
        System.out.println("prime numbers between 1 and 100 : ");

        int i = 1;
        while (i <= 100) {
            boolean isPrime=true;
            int j=2;
            while(j<=i/2){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
                j++;
            }
            if(isPrime){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
