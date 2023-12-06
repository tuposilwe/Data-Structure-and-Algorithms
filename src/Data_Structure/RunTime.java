package Data_Structure;

public class RunTime {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

        //------ program --------

        Thread.sleep(3000);

        //-----------------------
        long duration = (System.nanoTime() - start)/1000_000;
        System.out.println(duration + "ms");

    }
}








