package Calisan;

public class Lecturer extends Academician {
    private int doorNo;

    public Lecturer(String nameSurname, String phone, String email, String episode, String title,int doorNo) {
        super(nameSurname, phone, email, episode, title);
        this.doorNo=doorNo;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getNameSurname()+" senato toplantisina katildi.");
    }
    public void sinavYap(){
        System.out.println(this.getNameSurname()+" öğrencileri sınav yaptı.");
    }

    @Override
    public void enter(){
        System.out.println(this.getNameSurname()+" öğretim görevlisi B kapısından giriş yaptı.");
    }
    @Override
    public void enterClass(String saat){
        System.out.println(this.getNameSurname() +" öğretim görevlisi " + saat  +" derse giriş yaptı.");
    }
}
