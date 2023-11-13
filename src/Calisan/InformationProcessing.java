package Calisan;

public class InformationProcessing extends Officer{
    private String gorev;
    public InformationProcessing(String nameSurname, String phone, String email, String department, String work,String gorev) {
        super(nameSurname, phone, email, department, work);
        this.gorev=gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulum(){
        System.out.println(this.getNameSurname()+" bilgi işlem görevlisi network kurulumunu tamamladi.");
    }
    @Override
    public void working(String saat){
        System.out.println(this.getNameSurname()+" bilgi işlem görevlisi saat " + saat + " çalışmaya başladı.");
    }
}
