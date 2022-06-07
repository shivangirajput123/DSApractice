import java.util.HashSet;

public class duplicate {
    static public void main(String [] args){
        String ar[]={"gi", "vi", "gi"};
        HashSet<String> data=new HashSet<>();
        for(String e:ar){
            if(data.add(e) == false)
            System.out.println(e);
        }
    }
    
}
