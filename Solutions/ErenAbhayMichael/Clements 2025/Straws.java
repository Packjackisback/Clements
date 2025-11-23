import java.util.*;
import java.io.*;

public class Straws{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("straws.dat"));
        int T = sc.nextInt(), N = sc.nextInt();
        long a[] = new long[N];
        for(int i = 0; i<N; ++i){
            a[i] = sc.nextLong();
        }

        for(int t = 0; t<T; ++t){
            int n = sc.nextInt();
            long dp[] = new long[n+1];
            dp[0] = 0;
            for(int i = 1; i<=n; ++i){
                for(int j = 0; j<i; ++j){
                    if(i-j-1 >= N) continue;
                    dp[i] = Math.max(dp[j]+a[i-j-1], dp[i]);
                }
            }
            System.out.println(dp[n]);
        }
    }
}