package Calisan;

public abstract class Officer extends Employee {

    private String department;
    private String work;
    public Officer(String nameSurname, String phone, String email,String department,String work) {
        super(nameSurname, phone, email);
        this.department=department;
        this.work=work;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public abstract void working(String saat);

    @Override
    public void enter(){
        System.out.println(this.getNameSurname()+" memuru C kapısından giriş yaptı.");
    }
}
