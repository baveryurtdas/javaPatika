package ThreadOdev;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        //ArrayList Oluşturup sayılar ile doldurma.
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        //Çift Sayılar için boş ArrayList oluşturma
        ArrayList<Integer> ortakCiftSayilar = new ArrayList<>();
        //Tek Sayılar için boş ArrayList oluşturma.
        ArrayList<Integer> ortakTekSayilar = new ArrayList<>();

        //Thread Pool Oluşturma
        ExecutorService executor = Executors.newFixedThreadPool(4);

        //ArrayList'i 4 ayrı parçaya ayırma
        int pieceLong = numbers.size() / 4;
        ArrayList<Integer> piece1 = new ArrayList<>(numbers.subList(0, pieceLong));
        ArrayList<Integer> piece2 = new ArrayList<>(numbers.subList(pieceLong, 2 * pieceLong));
        ArrayList<Integer> piece3 = new ArrayList<>(numbers.subList(2 * pieceLong, 3 * pieceLong));
        ArrayList<Integer> piece4 = new ArrayList<>(numbers.subList(3 * pieceLong, numbers.size()));

        //Çift sayılar için Runnable Oluşturup ve Thread Pool'a ekleme.
        executor.execute(new CiftSayilar(piece1, ortakCiftSayilar));
        executor.execute(new CiftSayilar(piece2, ortakCiftSayilar));
        executor.execute(new CiftSayilar(piece3, ortakCiftSayilar));
        executor.execute(new CiftSayilar(piece4, ortakCiftSayilar));

        //Tek sayılar için Runnable Oluşturup ve Thread Pool'a ekleme.

        executor.execute(new TekSayilar(piece1, ortakTekSayilar));
        executor.execute(new TekSayilar(piece2, ortakTekSayilar));
        executor.execute(new TekSayilar(piece3, ortakTekSayilar));
        executor.execute(new TekSayilar(piece4, ortakTekSayilar));

        //Thread pool kapatma.
        executor.shutdown();

        //Thread pool tamamlanmasını bekleme.
        while (!executor.isTerminated()) {
        }

        //Ortak Çift sayıları yazdırma.
        for (int num : ortakCiftSayilar) {
            System.out.println("Ortak Çift Sayılar : " + num);
        }
        //Ortak Tek Sayıları yazdırma.
        for (int num : ortakTekSayilar) {
            System.out.println("Ortak Tek Sayılar : " + num);
        }


    }
}
