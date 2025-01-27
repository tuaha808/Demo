import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        int a [] = {4,5,5,3,4,6,6,6,4};

        HashMap<Integer, Integer> hm = new HashMap<>();
       
       
        for(int i=0; i<a.length; i++){
            
            if(!hm.containsKey(a[i])){
                hm.put(a[i], 1);
            }
            else{
                hm.put(a[i], hm.get(a[i])+1);
            }
            
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()){

            if(entry.getValue()==1){
                
            System.out.println(entry.getKey());
        }

    }
        
            
        }
        }

       

