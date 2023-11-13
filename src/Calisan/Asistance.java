package Calisan;

public class Asistance extends Academician {

    private String ofisSaati;

    public Asistance(String nameSurname, String phone, String email, String episode, String title,String ofisSaati) {
        super(nameSurname, phone, email, episode, title);
        this.ofisSaati=ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getNameSurname()+" asistanı öğrencileri quiz yaptı.");
    }

    @Override
    public void enterClass(String saat){
        System.out.println(this.getNameSurname()+" asistanı saat " + saat + " derse giriş yaptı." );
    }
}
