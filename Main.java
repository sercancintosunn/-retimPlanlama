
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 3;

        int m = 3;

        int[][] islemSuresi = {
                {},
                {0, 5, 8, 6},
                {0, 7, 4, 3},
                {0, 6, 5, 2}
        };


        int[][] gecisSuresi = {
                {},
                {0, 1, 4, 6},
                {0, 4, 2, 8},
                {0, 5, 9, 3}
        };


        int[][] toplamSure = new int[n + 1][m + 1];


        for (int j = 1; j <= m; j++) {
            toplamSure[1][j] = islemSuresi[1][j];

        }

        for (int i = 2; i <= n; i++) {
            for (int k = 1; k <= m; k++) {

                int enAzSure = Integer.MAX_VALUE;


                for (int j = 1; j <= m; j++) {
                    int temp = toplamSure[i - 1][j] + gecisSuresi[j][k] + islemSuresi[i][k];
                    if (temp < enAzSure) {
                        enAzSure = temp;

                    }
                }

                toplamSure[i][k] = enAzSure;

            }
        }

        int minToplamSure = Integer.MAX_VALUE;


        for (int j = 1; j <= m; j++) {
            if (toplamSure[n][j] < minToplamSure) {
                minToplamSure = toplamSure[n][j];

            }
        }


        System.out.println("\nMinimum toplam süre: " + minToplamSure);


    }
}