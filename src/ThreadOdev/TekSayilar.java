package ThreadOdev;

import java.util.ArrayList;

public class TekSayilar extends Thread {
    private ArrayList<Integer> piece;
    private ArrayList<Integer> ortakTekSayilar;

    public TekSayilar(ArrayList<Integer> piece, ArrayList<Integer> ortakTekSayilar) {
        this.piece = piece;
        this.ortakTekSayilar = ortakTekSayilar;
    }

    @Override
    public void run() {
        synchronized (ortakTekSayilar) {
            for (int num : piece) {
                if (num % 2 == 1) {
                    ortakTekSayilar.add(num);
                }
            }
        }
    }
}
