package ThreadOdev;

import java.util.ArrayList;

public class CiftSayilar extends Thread {
    private ArrayList<Integer> piece;
    private ArrayList<Integer> ortakCiftSayilar;

    public CiftSayilar(ArrayList<Integer> piece, ArrayList<Integer> ortakCiftSayilar) {
        this.piece = piece;
        this.ortakCiftSayilar = ortakCiftSayilar;
    }

    @Override
    public void run() {
        synchronized (ortakCiftSayilar) {
            for (int num : piece) {
                if (num % 2 == 0) {
                    ortakCiftSayilar.add(num);
                }
            }
        }
    }

}
