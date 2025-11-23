package threads_practise;

public class Tintro {
    public static void main(String[] args){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Im R1 Runnable");
            }
        };

        Runnable r2 = () -> System.out.println("Im R2 Runnable");

       Thread T1 = new Thread(r1,"R1");
       T1.start();
       String Tname = T1.currentThread().getName();
       System.out.println(Tname);
    }
}
