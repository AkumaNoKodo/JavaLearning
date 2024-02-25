public class FlourPacker {
    public static boolean canPack(int big, int small, int goal) {
        return (big >= 0 && small >= 0 && goal >= 0) &&
               (small >= goal - Math.min(goal / 5, big) * 5);
    }

}
