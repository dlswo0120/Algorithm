import java.util.Scanner;
//분할 계획을 이용해 장애물이 주어졌을 때 최단경로 구하기
public class ShortestPath {

    public static int cutMap_DC(int p[][], int map[][], int n, int m, int k) {
        map[0][k] = 1;
        map[1][2] = 1;
        map[3][1] = 1;

        if (n == 0 || m == 0) {
            if (map[n][m] == 1)
                p[n][m]= 0;
            else
                p[n][m] = 1;
            return p[n][m];
        }
        else {
            int value = 0;
           value = cutMap_DC(p, map, n-1, m, k) + cutMap_DC(p, map, n, m-1, k);
            if (map[n][m] == 1)
                value = 0;
            System.out.println("p[n: " + n + "] [m: " + m + "] ,value: " + value);
            p[n][m] = value;
        }
        return p[n][m];
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("행 입력: ");
        int n = stdIn.nextInt();
        System.out.println("열 입력: ");
        int m = stdIn.nextInt();
        int[][] p = new int[n+1][m+1];
        int[][] map = new int[n+1][m+1];
        System.out.println(cutMap_DC(p, map, n,m,m));
    }
}
