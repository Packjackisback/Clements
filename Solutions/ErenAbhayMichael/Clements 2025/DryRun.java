import java.util.*;
import java.io.*;

public class DryRun{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("dryrun.in"));
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<N; ++i){
            System.out.printf("Thank you for your hard work, %s!\n", sc.nextLine().strip());
        }

        System.out.println("Thank you for your hard work, Mrs. Lorena!");
        System.out.println("Thank you for your hard work, Mr. Fugel!");

    }
}