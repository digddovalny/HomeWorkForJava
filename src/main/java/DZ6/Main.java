package DZ6;



import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook MsiTitanGT77 = new Notebook("MSI", "Titan GT77", "Black", 17.3, "IPS", 32, 2000, "SSD");
        Notebook SamsungS101 = new Notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD");
        Notebook SamsungS150 = new Notebook("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "SSD");
        Notebook AsusTUF504 = new Notebook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        Notebook AsusTUF555 = new Notebook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD");
        Notebook AsusRogM16 = new Notebook("ASUS", "ROG Zeohyrus M16", "Blue", 16.0, "IPS", 16, 1000, "SSD");
        Notebook AppleMackBookPro = new Notebook("Apple", "MackBook Pro", "Grey", 16.2, "mini-LED", 16, 1024, "SSD");
        Notebook HuaweiMateBook16s = new Notebook("HUAWEI", "MateBook 16s", "Grey", 16.0, "IPS", 16, 1000, "SSD");

        List<Notebook> notebookList = List.of(MsiTitanGT77, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555,AsusRogM16,AppleMackBookPro,HuaweiMateBook16s);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();

    }
}
