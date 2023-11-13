package Calisan;

import javax.sound.midi.Soundbank;

public class SecurityGuard extends Officer{
    private String belge;
    public SecurityGuard(String nameSurname, String phone, String email, String department, String work,String belge) {
        super(nameSurname, phone, email, department, work);
        this.belge=belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(this.getNameSurname()+" güvenlik görevlisi gece nöbetini tutmuştur.");
    }
    @Override
    public void working(String saat){
        System.out.println(this.getNameSurname()+"  güvenlik görevlisi saat "+ saat+" işe başladı.");
    }
}
