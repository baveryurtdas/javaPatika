package Thread;

public class CounterRunnable implements Runnable {
    private String name;
    private int id;
    private boolean isRun = true;

    public CounterRunnable(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " sayacı başladı");
       int i = 0;
        while (isRun) {


                try {
                    Thread.sleep(1000L * this.id);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.name + " : " + i++);
            }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop() {
        this.isRun = false;
    }
}
