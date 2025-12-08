import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args){

        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            int val= it.next();
//            System.out.println(it.next());
            if(val == 6){
                it.remove();
            }
        }
        System.out.println("After removal: "+list);
    }
}