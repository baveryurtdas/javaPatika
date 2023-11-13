package Calisan;

public abstract class Employee {
    private String nameSurname;
    private String phone;
    private String email;

    public Employee(String nameSurname, String phone, String email) {
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void enter() {
        System.out.println(this.nameSurname + " üniversiteye giriş yaptı.");
    }



    public void leave() {
        System.out.println(this.getNameSurname() + " üniversiteden çıkış yaptı.");
    }

    public void diningHouseHolds() {
        System.out.println(this.getNameSurname() + " yemekhaneye giriş yaptı");
    }

    public static void loginUsers(Employee[] loginUsers){
        for(Employee e : loginUsers){
            e.enter();
        }
    }
}
