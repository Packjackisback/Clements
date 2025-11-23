import java.util.*;
import java.io.*;

public class Day{
    static Scanner sc;

    static class Pair{
        int first, second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void solve(){
        int k = 1000001;
        int dp[] = new int[k];
        Pair[] dist = new Pair[k];
        Queue<Pair> q = new LinkedList<>();

        for(int i = 1; i<k; ++i){
            
        }

        for(it )

        System.out.println(dp[k-1]);
    }
    public static void main(String[] args) throws IOException{
        sc = new Scanner(new File("day.in"));
        int t = sc.nextInt();
        while(t-- > 0) solve();
    }
}