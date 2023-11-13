package Calisan;

public class LabAsistance extends Asistance {
    public LabAsistance(String nameSurname, String phone, String email, String episode, String title, String ofisSaati) {
        super(nameSurname, phone, email, episode, title, ofisSaati);
    }

    public void lablaraGir() {
        System.out.println(this.getNameSurname() + " lab asistanı labaratuara giris yaptı.");
    }

    public void derseGir() {
        System.out.println(this.getNameSurname() + " lab asistanı derse giriş yaptı.");
    }

    @Override
    public void enterClass(String saat) {
        System.out.println(this.getNameSurname() + " lab asistanı " + saat + " giriş yaptı");
    }
}
