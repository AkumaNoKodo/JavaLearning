/**
 * Converts and prints the given kilobytes into megabytes and remaining kilobytes.
 * This method accepts an int parameter named kiloBytes. It calculates the megabytes (MB)
 * and the remaining kilobytes (KB) from the kilobytes parameter. The result is then printed
 * in the format: "XX KB = YY MB and ZZ KB".
 * - XX represents the original kilobytes value.
 * - YY represents the calculated megabytes.
 * - ZZ represents the remaining kilobytes after converting to megabytes.
 * If the parameter kiloBytes is less than 0, the method prints "Invalid Value".
 * Example input/output:
 * printMegaBytesAndKiloBytes(2500) prints "2500 KB = 2 MB and 452 KB"
 * printMegaBytesAndKiloBytes(-1024) prints "Invalid Value"
 * printMegaBytesAndKiloBytes(5000) prints "5000 KB = 4 MB and 904 KB"
 * Notes:
 * - 1 MB = 1024 KB.
 */

public class MegabytesConverter {
    public static void printMegaBytesAndKiloBytes(int inKilobytes) {
        if (inKilobytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int outMegabytes = inKilobytes / 1024;
        int outKilobytes = inKilobytes % 1024;

        System.out.printf("%d KB = %d MB and %d KB \n", inKilobytes, outMegabytes, outKilobytes);
    }
}
