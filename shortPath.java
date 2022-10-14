import java.util.Scanner;
//동적 계획을 이용해 방해물이 주어졌을 때 최단경로 구하기
public class shortPath {

    public static int cutMap_DP(int p[][], int n, int m){
        int[][] map = new int[n][m];
        p[0][0] = 1;
        map[0][m-1] = 1;
        map[1][2] = 1;
        map[3][1] = 1;

        for(int i = 0; i < n; i++){
            p[i][0] = 1;
            System.out.println("p["+i+"]["+0+"] :" + p[i][0]);
        }
        for(int j = 0; j < m; j++){
            p[0][j] = 1;
            System.out.println("p["+0+"]["+j+"] :" + p[0][j]);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(map[i][j] == 1)
                    p[i][j] = 0;
                System.out.println("p["+i+"]["+j+"] :" + p[i][j]);
            }
        }
        //배열 값 확인
        System.out.println(map[0][m-1] + " " + map[1][2] + " " + map[3][1]);
        System.out.println(p[0][m-1] + " " + p[1][2] + " " + p[3][1]);

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){

                p[i][j] = p[i][j-1] + p[i-1][j];
                if(map[i][j] == 1)
                    p[i][j] = 0;
                System.out.println("p["+i+"]["+j+"] :" + p[i][j]);
            }
        }
        return p[n-1][m-1];
}
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("행 입력: ");
        int n = stdIn.nextInt();
        System.out.println("열 입력: ");
        int m = stdIn.nextInt();
        int[][] map = new int[n+1][m+1];
        System.out.println(cutMap_DP(map, n+1, m+1));
    }


}
