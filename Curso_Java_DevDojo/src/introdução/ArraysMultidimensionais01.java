package introdução;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;
        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        int j;
        for(int i = 0; i < dias.length; ++i) {
            for(j = 0; j < dias[i].length; ++j) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------");
        int[][] var10 = dias;
        j = dias.length;

        for(int var4 = 0; var4 < j; ++var4) {
            int[] arrBase = var10[var4];
            int[] var6 = arrBase;
            int var7 = arrBase.length;

            for(int var8 = 0; var8 < var7; ++var8) {
                int num = var6[var8];
                System.out.println(num);
            }
        }
    }
}
