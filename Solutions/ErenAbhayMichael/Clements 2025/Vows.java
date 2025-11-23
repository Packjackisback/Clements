import java.util.*;
import java.io.*;

public class Vows{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("vows.dat"));
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            arr.add(sc.nextLine().trim());
        }
        if (arr.get(arr.size()-1).isEmpty())
            arr.remove(arr.size()-1);
        String name = arr.get(arr.size()-1);
        for (int i = 0; i < arr.size()-1; i++) {
            //arr.get(i).replaceAll("BLANK", name);
            System.out.println(arr.get(i).replaceAll("BLANK", name) + "");
        }

    }
}