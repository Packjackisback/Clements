import java.util.*;
import java.io.*;

public class Venue{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("venue.dat"));
        int m = sc.nextInt();
        int h = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String name = sc.next();
            double cost = sc.nextDouble();
            int l = sc.nextInt();
            int w = sc.nextInt();
            sc.nextLine();
            System.out.printf(name + " " + "%.6f%n", (cost/h/l/w));
        }
    }
}