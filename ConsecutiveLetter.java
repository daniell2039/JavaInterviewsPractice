

public class ConsecutiveLetter {
    static int getSmallest(int[] A) {

        int n = A.length;
        int N = 100000000;

        // Crear la condicional boolean en un array para que corrobore si un numero esta presente
        boolean[] present = new boolean[N];
        int minval = Integer.MIN_VALUE;

        // Crear un bucle para iterar en el Array
        for (int i = 0; i < n; i++) {

            if (A[i] > 0 && A[i] <= n) {
                present[A[i]] = true;

                minval = Math.max(minval, A[i]);
            }
        }

        for (int i = 1; i < N; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return minval + 1;
    }

    public static void main(String[] args) {
        int A[] = {0, 10, 2, -10, -20};
        System.out.println(getSmallest(A));
    }
}