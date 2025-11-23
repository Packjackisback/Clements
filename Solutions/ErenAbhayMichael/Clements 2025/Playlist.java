import java.util.*;
import java.io.*;

public class Playlist{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("playlist.dat"));
        ArrayList<song> songs = new ArrayList<>();
        ArrayList<String> bannl = new ArrayList<>(), bangl = new ArrayList<>(), banal = new ArrayList<>();
        int s = sc.nextInt();
        int r = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < s; i++) {
            songs.add(new song(sc.nextLine()));
        }
        for (int i = 0; i < r; i++) {
            int x = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < x; j++) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                switch (parts[0]) {
                    case "ROTATE":
                        Collections.rotate(songs, Integer.parseInt(parts[1]));
                        break;
                    case "REMOVEN":
                        removen(songs, parts[1]);
                        break;
                    case "REMOVEA":
                        removea(songs, parts[1]);
                        break;
                    case "REMOVEG":
                        removeg(songs, parts[1]);
                        break;
                    case "BANN":
                        bann(songs, bannl, parts[1]);
                        break;
                    case "BANG":
                        bang(songs, bangl, parts[1]);
                        break;
                    case "BANA":
                        bana(songs, banal, parts[1]);
                        break;
                    case "ADD":
                        add(s, songs, bannl, bangl, banal, new song(parts[1].trim(), parts[2].trim(), parts[3].trim()));
                        break;
                }
            }
            System.out.println((songs).toString().substring(1, songs.toString().length()-1));
        }
    }
    public static class song {
        public final String n, a, g;
        public song (String line) {
            String[] parts = line.split(" ");
            this.n = parts[0].substring(0, parts[0].length()-1);
            this.a = parts[1].trim();
            this.g = parts[2].trim();
        }
        public song(String name, String author, String genre) {
            this.n = name;
            this.a = author;
            this.g = genre;
        }
        public String toString() {
            return n;
        }
    }

    public static void removen(ArrayList<song> songs, String name) {
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (songs.get(i).n.equals(name)) songs.remove(i);
        }
    }
    
    public static void removea(ArrayList<song> songs, String a) {
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (songs.get(i).a.equals(a)) songs.remove(i);
        }
    }

    public static void removeg(ArrayList<song> songs, String g) {
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (songs.get(i).g.equals(g)) songs.remove(i);
        }
    }

    public static void bann(ArrayList<song> songs, ArrayList<String> bannl, String name) {
        bannl.add(name);
        removen(songs, name);
    }

    public static void bang(ArrayList<song> songs, ArrayList<String> bangl, String g) {
        bangl.add(g);
        removeg(songs, g);
    }

    public static void bana(ArrayList<song> songs, ArrayList<String> banal, String a) {
        banal.add(a);
        removea(songs, a);
    }

    public static void add(int l, ArrayList<song> songs, ArrayList<String> bann, ArrayList<String> bang, ArrayList<String> bana, song s) {
        if (bann.contains(s.n) || bang.contains(s.g) || bana.contains(s.a)) return;
        songs.add(0, s);
        while (songs.size() > l) {
            songs.remove(songs.size() - 1);
        }
    }
}