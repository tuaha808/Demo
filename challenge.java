import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class challenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        String n = sc.nextLine();
        int t = Integer.parseInt(n);
        String s = "I can program in java";
        List<String> mylist = new ArrayList<String>(Arrays.asList(s.split(" ")));
      //  System.out.println(mylist);
        
        try {
            System.out.println(mylist.get(t-1));
        }
        catch(Exception e){
            System.out.println("Please enter the correct value of n, minimum value is 1, and maximum value is the total number of words in the string");
        }
    }

}
