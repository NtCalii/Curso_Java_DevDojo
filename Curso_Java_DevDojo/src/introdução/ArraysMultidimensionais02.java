package introdução;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        int[][] arrayInt = new int[][]{new int[2], array, {1, 2, 3, 4, 5, 6}};
        int[][] var3 = arrayInt;
        int var4 = arrayInt.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int[] arrayBase = var3[var5];
            System.out.println("\n-------");
            int[] var7 = arrayBase;
            int var8 = arrayBase.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                int num = var7[var9];
                System.out.print("" + num + " ");
            }
        }
    }
}
