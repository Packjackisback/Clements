import java.util.*;
import java.io.*;

public class Servers{
    public static Scanner sc;
    public static void solve(){
        int N = sc.nextInt(), M = sc.nextInt();

        long grid[][] = new long[N][M];
        for(int i = 0; i<N; ++i){
            for(int j = 0; j<M; ++j){
                grid[i][j] = sc.nextLong();
            }
        }

        long dp[][] = new long[N][M];
        dp[0][0] = grid[0][0];
        for(int i = 0; i<N; ++i){
            for(int j = 0; j<M; ++j){
                if(i == 0 && j == 0) continue;
                long x = (i > 0 ? dp[i-1][j] : Integer.MAX_VALUE);
                long y = (j > 0 ? dp[i][j-1] : Integer.MAX_VALUE);
                dp[i][j] = Math.min(x, y) + grid[i][j];
            }
        }

        System.out.println(dp[N-1][M-1]);
    }
    public static void main(String[] args) throws IOException{
        sc = new Scanner(new File("servers.dat"));
        int t = sc.nextInt();
        while(t-- > 0) solve();   
    }
}