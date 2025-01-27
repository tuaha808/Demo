import java.util.ArrayList;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Taha");
        arraylist.add("Ahsan");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("John");
        arrayList2.add("Michael");
        arrayList2.add("Another Name");

        Stream<String> newStream = Stream.concat(arraylist.stream(), arrayList2.stream());
        boolean result = newStream.anyMatch(s->s.equalsIgnoreCase("Taha"));
        System.out.println(result);
        // if(result == true){
        //     System.out.println("The name matches");
        // }
        // else{
        //     System.out.println("The name doesn't match");
        // }
    }
}
