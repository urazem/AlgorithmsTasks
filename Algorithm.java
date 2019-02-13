import java.util.Random;

public class Algorithm {
    static public int count=0;
   /* static public int[][] matrixA =  {
            { 0, 1, 1, 0 },
            { 1, 0, 0, 0 },
            { 1, 0, 0, 1 },
            { 0, 0, 1, 0 }
    };*/

    public static void main(String[] args) {
        Random ran = new Random();
        int n =5;
        int[][] matrixA = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)//если столбец = строчке
                {
                    matrixA[i][j] = 0;// инициализируем этот элемент матрицы нулем
                } else {
                    matrixA[i][j] = ran.nextInt(2);//заполнение матрицы рандомными значениями 0 - 1
                    System.out.println(matrixA[i][j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrixA[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println("Количество смежных дорог в городе N: " + count/2);
    }
}
