import java.util.*;
import java.io.*;

public class Honeymoon{
    public static Scanner sc;
    public static void solve(){
        long days[] = new long[]{1, 5, 10, 30}, cost[] = new long[4];
        long dp[] = new long[366];
        boolean vis[] = new boolean[366];
        String[] line = sc.nextLine().strip().split(" ");
        for(int i = 0; i<4; ++i){
            cost[i] = Long.parseLong(line[i]);
        }
        line = sc.nextLine().strip().split(" ");
        for(int i = 0; i<line.length; ++i){
            int idx = Integer.parseInt(line[i]);
            vis[idx] = true;
        }
        for(int i = 1; i<366; ++i){
            int idx = 0;
            if(!vis[i]){
                dp[i] = dp[i-1];
            }
            dp[i] = Long.MAX_VALUE;
            for(int j = i-1; j>=0; --j){
                if(i-j > days[idx]){
                    ++idx;
                    if(idx == 4) break;
                }

                //System.out.println(i-j + " " + idx);

                dp[i] = Math.min(dp[i], dp[j]+cost[idx]);
            }
        }
        System.out.println(dp[365]);
    }
    public static void main(String[] args) throws IOException{
        sc = new Scanner(new File("honeymoon.dat"));
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) solve();
    }
}