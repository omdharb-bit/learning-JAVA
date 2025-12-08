import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Using ListIterator to update elements
        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            int val = it.next();
            if (val == 4) {
                it.set(10);   // replace 4 with 10
            }
        }
        System.out.println("After modification: " + list);
    }
}