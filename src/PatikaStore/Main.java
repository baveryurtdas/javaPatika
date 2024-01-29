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
                listBrands();
                break;
            case 2:
                System.out.println("Ürün Listesi");
                System.out.println("-- Ürünler --");
                initializeCellPhone();
                initializeNotebook();
                listProducts();
                break;
            case 3:
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
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

    }

    private static void listBrands() {
        initializeBrands();
        Collections.sort(brands, (b1, b2) -> b1.name.compareToIgnoreCase(b2.name));
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }


    private static void initializeCellPhone() {
        initializeBrands();

        cellPhones.add(new CellPhone(1, 3199,
                10, 25, "Samsung GALAXY A51",
                brands.get(0), "128 GB", "6.5 Inc",
                4000, 6, "Siyah"));
        cellPhones.add(new CellPhone(2, 7379,
                10, 25, "IPhone 11 64 GB",
                brands.get(2), "64 GB", "6.1 Inc",
                3046, 6, "Mavi"));
        cellPhones.add(new CellPhone(3, 4012,
                10, 25, "Redmi Note 10 Pro 8 GB",
                brands.get(7), "64 GB", "6.5 Inc",
                4000, 12, "Beyaz"));

    }

    private static void initializeNotebook() {
        initializeBrands();

        notebooks.add(new Notebook(1, 7000, 10, 25,
                "HUAWEI Matebook 14", brands.get(3), 16, "HUAWEI", "14.0 Inc", 512));
        notebooks.add(new Notebook(2, 3699, 10, 25,
                "LENOVO V14 IGL", brands.get(1), 8, "LENOVO", "14.0 Inc", 1024));
        notebooks.add(new Notebook(3, 8199, 10, 25,
                "Asus TUF Gaming", brands.get(5), 32, "ASUS", "15.6 Inc", 2048));
    }


    private static void listProducts() {


        System.out.println("Cep Telefonu Listesi");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-5s | %-50s | %-10s | %-15s | %-20s | %-15s | %-15s | %-15s | %-5s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Pil", "RAM", "Renk");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (CellPhone phone : cellPhones) {
            System.out.format("| %-5d | %-50s | %-10.2f | %-15s | %-20s | %-15s | %-15s | %-15s | %-5s |%n",
                    phone.id, phone.getName(), phone.getUnitPrice(), phone.brand.getName(),
                    phone.getMemory(), phone.getScreenSize(), phone.getBatteryPower(), phone.getRam(), phone.getColor());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-5s | %-50s | %-10s | %-15s | %-20s | %-15s | %-5s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.format("| %-5d | %-50s | %-10.2f | %-15s | %-20s | %-15s | %-5s |%n",
                    notebook.id, notebook.getName(), notebook.getUnitPrice(), notebook.brand.getName(),
                    notebook.getMemory(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


    }


}
