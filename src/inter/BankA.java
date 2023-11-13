package inter;

public class BankA implements IBANK, IDeneme {
    int x;

    public void hesapla(int item) {
        x = item * item;
    }
}
