package PatikaStore;

import java.util.*;


public class Main {
    private static List<Brand> brands = new ArrayList<>();
    private static List<CellPhone> cellPhones = new ArrayList<>();
    private static List<Notebook> notebooks = new ArrayList<>();
    private static int productIdCounter = 1;


    public static void main(String[] args) {

        System.out.println("Patika Stora'a Hoşgeldiniz");
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("1 - Markaları Listele");
            System.out.println("2 - Ürünleri Listele");
            System.out.println("3 - Ürünleri Fitrele");
            System.out.println("4 - Ürün Ekle");
            System.out.println("5 - Ürün Sil");
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
                    System.out.println("-- Ürün Listesi -- ");
                    listProducts();
                    break;
                case 3:
//                    handleCellPhoneOperations(scan);
                    break;

                case 4:
                    addProduct(scan);
                    break;
                case 5 :
                    deleteProduct(scan);
                    break;
                default:
                    System.out.println("Geçersiz bir değer girdiniz.");
                    break;
            }
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
        Collections.sort(brands, Comparator.comparing(brand -> brand.name));


    }

    private static void listBrands() {
        initializeBrands();
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
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
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("| %-5s | %-50s | %-10s | %-15s | %-20s | %-15s | %-5s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.format("| %-5d | %-50s | %-10.2f | %-15s | %-20s | %-15s | %-5s |%n",
                    notebook.id, notebook.getName(), notebook.getUnitPrice(), notebook.brand.getName(),
                    notebook.getMemory(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");


    }

    private static void addProduct(Scanner scan) {
        System.out.print("Ürün grubunu seçin (1 : Cep Telefonu 2 : Notebook) : ");
        int ProductNumber = scan.nextInt();

        System.out.print("Ürün Adı : ");
        String productName = scan.next();

        System.out.print("Marka Seçin : ");
        listBrands();
        int brandID = scan.nextInt();
        Brand selectedBrand = getBrandByID(brandID);

        System.out.print("Ürünün Fiyat Giriniz :");
        double unitPrice = scan.nextDouble();

        System.out.print("İndirim oranı : ");
        double discountRate = scan.nextDouble();

        System.out.print("Stok Miktarı : ");
        int stockQuantity = scan.nextInt();

        if (ProductNumber == 1) {
            System.out.print("Hafıza bilgisi girin (GB) : ");
            String memory = scan.next();
            System.out.print("Ekran Boyutu (Inc) : ");
            String screenSize = scan.next();
            System.out.print("Pil Gücü : ");
            int batteryPower = scan.nextInt();
            System.out.print("RAM  : ");
            int ram = scan.nextInt();
            System.out.print("Renk : ");
            String color = scan.next();

            CellPhone newCellPhone = new CellPhone(productIdCounter++, unitPrice, discountRate, stockQuantity, productName, selectedBrand, memory, screenSize, batteryPower, ram, color);
            cellPhones.add(newCellPhone);
        } else if (ProductNumber == 2) {
            System.out.print("RAM : ");
            int ram = scan.nextInt();

            System.out.print("Depolama : ");
            String memory = scan.next();

            System.out.print("Ekran Boyutu (Inc) : ");
            String screenSize = scan.next();

            Notebook newNotebook = new Notebook(productIdCounter++, unitPrice, discountRate, stockQuantity, productName, selectedBrand, ram, screenSize, memory);
            notebooks.add(newNotebook);
        } else {
            System.out.println("Geçersiz ürün numarası.");
        }
        System.out.println("Ürün başarıyla eklendi.");

    }



    private static void deleteProduct(Scanner scan) {
        System.out.print("Silmek istediğiniz ürünün grubunu seçin (1 : Cep Telefonu, 2 Notebook : ");
        int productID = scan.nextInt();
        CellPhone cellPhoneToDelete = getCellPhoneID(productID);
        Notebook notebookToDelete = getNotebookID(productID);

        if (productID == 1) {
            System.out.print("Silmek istediğiniz cep telefonu id'sini seçin :  ");
            int deleteID = scan.nextInt();
            if (cellPhoneToDelete != null) {
                cellPhones.remove(deleteID);
                System.out.println("Ürün Başarıyla Silindi.");
            } else {
                System.out.println("Belirtilen ID'ye sahip bir ürün bulunamadı.");
            }
        } else if (productID == 2) {
            System.out.println("Silmek istediğiniz notebook id'sini seçin : ");
            int deleteID = scan.nextInt();
            if(notebookToDelete != null){
                notebooks.remove(deleteID);
                System.out.println("Ürün başarıyla silindi.");
            }else{
                System.out.println("Belirtilen ID'ye sahip bir ürün bulunamadı.");
            }
        }else{
            System.out.println("Lütfen geçerli numaraya sahip bir ürün grup numarası giriniz.");
        }
    }



    private static Brand getBrandByID(int brandId) {
        for (Brand brand : brands) {
            if (brand.id == brandId) {
                return brand;
            }
        }
        return null;
    }

    private static CellPhone getCellPhoneID(int cellPhoneID) {
        for (CellPhone cellPhone : cellPhones) {
            if (cellPhone.id == cellPhoneID) {
                return cellPhone;
            }
        }
        return null;
    }

    private static Notebook getNotebookID(int notebookID) {
        for (Notebook notebook : notebooks) {
            if (notebook.id == notebookID) {
                return notebook;
            }
        }
        return null;
    }
}
