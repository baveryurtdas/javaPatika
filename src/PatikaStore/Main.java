package PatikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    final private static List<Brand> brands = new ArrayList<>();
    final private static List<CellPhone> cellPhones = new ArrayList<>();
    final private static List<Notebook> notebooks = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Patika Stora'a Hoşgeldiniz");
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Markaları Listele");
        System.out.println("2 - Ürünleri Listele");
        System.out.println("3 - Cep Telefonu İşlemleri");
        System.out.println("4 - Notebook İşlemleri");
        System.out.println("0 - Çıkış yap");
        System.out.print(" Lütfen seçim yapın : ");

        int choice = scan.nextInt();
        scan.nextLine();


        switch (choice) {
            case 1:
                System.out.println("-- Markalar --");
                initializeBrands();
                break;
            case 2:
                System.out.println("Ürün Listesi");
                listProducts();
                initializeCellPhone();
                break;
            case 3 :
                System.out.println("Çıkış yapılıyor.");
                System.exit(0);
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz.");
                break;
        }


    }

    private static void initializeBrands() {
        //Statik marka listesi
        brands.add(new Brand(1, "- Samsung"));
        brands.add(new Brand(2, "- Lenovo"));
        brands.add(new Brand(3, "- Apple"));
        brands.add(new Brand(4, "- Huawei"));
        brands.add(new Brand(5, "- Casper"));
        brands.add(new Brand(6, "- Asus"));
        brands.add(new Brand(7, "- HP"));
        brands.add(new Brand(8, "- Xiaomi"));
        brands.add(new Brand(9, "- Monster"));

        Collections.sort(brands, (b1, b2) -> b1.name.compareToIgnoreCase(b2.name));
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }

    }

    private static void initializeCellPhone() {
        if(brands.isEmpty()){
            System.out.println("Hata : Marka listesi boş");
        }


        cellPhones.add(new CellPhone(1, 3199,
                10, 25, "GALAXY A51",
                brands.get(0), "128 GB", "6.5 Inc",
                4000, 6, "Siyah"));

    }


    private static void listProducts() {
        System.out.println("Cep Telefonu Listesi");

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| ID\t| Ürün Adı\t| Fiyat\t| Marka\t| Depolama \t| Ekran\t| Pil\t| RAM\t| Renk |");
        System.out.println("-------------------------------------------------------------------------------");
        for (CellPhone phone : cellPhones) {
            System.out.format("%d\t%s\t%.2f\t%s\t%.2f\t%.2f\t%.2f\t%.2f\t%s%n", phone.id, phone.getName(), phone.getUnitPrice(), phone.brand.getName(), phone.getMemory(), phone.getScreenSize(), phone.getBatteryPower(), phone.getRam(), phone.getColor());
        }

    }


}
