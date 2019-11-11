public class TreadsTest extends Thread {

    public TreadsTest(String s){
        super(s);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " "+getName());
            
        }


    }

    public static void main(String[] args) {
        Thread t1 =new TreadsTest("t1");
        Thread t2 =new TreadsTest("t2");
        Thread t3 =new TreadsTest("t3");
        t1.start();
        t2.start();
        t3.start();

    }
}
