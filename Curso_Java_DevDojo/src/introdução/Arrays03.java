package introdução;

public class Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = new int[]{5, 4, 3, 2, 1};
        int[] var3 = numeros2;
        int var4 = numeros2.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int num = var3[var5];
            System.out.println(num);
        }
    }
}
