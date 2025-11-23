import java.util.*;
import java.io.*;

public class RSVPS{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("rsvps.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        int total = 0;
        int yes = 0;
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int cnt = sc.nextInt();
            String choice = sc.nextLine().trim();
            total += cnt;
            if (choice.equals("Yes")) yes += cnt;
        }
        System.out.printf(yes + " " + (total - yes) + " " + "%.2f%%", ((double)yes/total*100));

    }
}