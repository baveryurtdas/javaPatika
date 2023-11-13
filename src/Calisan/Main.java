package Calisan;

public class Main {
    public static void main(String[] args) {
        //Employee c1 = new Employee("Baver Yurtdas", "0513216546", "baveryurtdas@gmail.com");

        //Academician a1 = new Academician("Patika Dev","055555555","patikadev@info.com","CENG","Doçent");
        //Officer o1 = new Officer("Baver Yurtdas","054564654","theolmeca21@gmail.com","Bilgi İslem","AA");
        Lecturer l1 = new Lecturer("Baver Yurtdaş","0545554665","yurtdas@gmail.com","CENG","Ogretim Gorevlisi",317);
        l1.enterClass("10.00");

        //Abstraction (Soyutlama)

        InformationProcessing i1 = new InformationProcessing("Baver Yurtdaş","0555654654","baveryurtdas@gmail.com","Bilgi İslem","Bilgi İslem","Network Kurulum");
        i1.working("10.00");
        SecurityGuard s1 = new SecurityGuard("Baver Yurtdaş","0555654654","baveryurtdas@gmail.com","Güvenlik Görevlisi","Bilgi İslem","Ziyaretçi Defteri");
        s1.working("08.00");
        LabAsistance la1 = new LabAsistance("Baver Yurtdaş","554654654","baveryurtdas@gmail.com","Security","LabAsistance","10.00");
        la1.enterClass("10.00");
    }
}
