import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] A = new int[4][2];

        Random rand = new Random();

        // Заповнення матриці випадковими числами (-10 до 10)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = rand.nextInt(21) - 10;
            }
        }

        System.out.println("Matrix A:");

        // Вивід матриці
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int count = 0;

        // Пошук елементів |x| <= 7
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (Math.abs(A[i][j]) <= 7) {
                    count++;
                }
            }
        }

        System.out.println("Count of elements |x| <= 7 = " + count);
    }
}
