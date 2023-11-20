package generic;

public class Nullable <T extends B>{
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isNull(){
       return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu değişkene değer atanmamıştır : " + this.getValue());
        }else{
            System.out.println("Bu değişkene değer atanmıştır : " + this.getValue());
        }
    }
}