import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);
        arraylist.add(24);
        

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(50);
        arrayList2.add(35);

        List<Integer> list = Stream.concat(arraylist.stream(), arrayList2.stream()).collect((Collectors.toList()));
        ArrayList<Integer> abc = new ArrayList<>(list);
        for(int i=0; i<abc.size(); i++){
            if(abc.get(i) > 25){
                System.out.println(abc.get(i));
            }
        }

    }

}
