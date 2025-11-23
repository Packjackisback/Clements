import java.util.*;
import java.io.*;

public class Vendors{
    public static class v implements Comparable<v> {
        private final String n;
        private final double cost, ranking;
        public v(String name, double cost, double ranking) {
            this.n = name;
            this.cost = cost;
            this.ranking = ranking;
        }

        @Override
        public int compareTo(v other) {
            if (other.ranking < this.ranking) return -1;
            else if (other.ranking > this.ranking) return 1;
            else if (other.cost < this.cost) return 1;
            else if (other.cost > this.cost) return -1;
            else return (other.n.compareTo(this.n));
        }

        public String toString() {
            return String.format("%s %.2f %.1f", n, cost, ranking);
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("vendors.dat"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            // get instructions for a category
            String category = sc.next();
            int m = sc.nextInt();
            String date = sc.next();
            double c = sc.nextDouble();
            sc.nextLine();
            ArrayList<v> curr = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                String name = sc.next();
                double cost = sc.nextDouble();
                double ranking = sc.nextDouble();
                ArrayList<String> dates = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));

                if (!dates.contains(date) && cost <= c) {
                    curr.add(new v(name, cost, ranking));
                }
            }    
            Collections.sort(curr);
            System.out.println(category + ":");
            for (int x = 1; x < curr.size()+1; x++) {
                v now = curr.get(x-1);
                System.out.println(x + ": " + now);
            }      
        }
    }
}