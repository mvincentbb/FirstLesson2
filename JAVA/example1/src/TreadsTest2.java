import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class TreadsTest2 implements Runnable {
    private String name;
    public TreadsTest2(String name){
        this.name = name;
    }
    public static void main(String[] args) {

        TreadsTest2 t1 = new TreadsTest2("t1");
        TreadsTest2 t2 = new TreadsTest2("t2");
        TreadsTest2 t3 = new TreadsTest2("t3");
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }

    @Override
    public void run() {

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i + " " + this.name);

        }
    }
    /*
     * // anteater
     */

// bear
// // cat

    // /* doghhh */

    /* elephant */
    /*
     * /* ferret */
*/

}
