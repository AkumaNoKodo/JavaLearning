
public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(FlourPacker.canPack(2,10,18));


        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("\nRunning time: " + duration / 1000 + " microseconds.");
    }
}
