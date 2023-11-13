package Calisan;

public abstract class Academician extends Employee {

    private String episode;
    private String title;


    public Academician(String nameSurname, String phone, String email,String episode,String title) {
        super(nameSurname, phone, email);
        this.episode=episode;
        this.title=title;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract  void enterClass(String dersSaati);

    @Override
    public void enter(){
        System.out.println(this.getNameSurname()+ " xx akademisyeni A kapısından giriş yaptı. ");
    }
}
