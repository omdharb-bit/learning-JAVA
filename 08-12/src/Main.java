import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int st = 0;
        int end = list.size() - 1;
        int mid = st + (end - st) / 2;

        ListIterator<Integer> it = list.listIterator();
        int index = 0;

        while (it.hasNext() && it.nextIndex() <= mid) {
            int val = it.next();
            System.out.println(val);
        }

        while(it.hasPrevious()){
            int val1 =  it.previous();
            System.out.println(val1);
        }

        System.out.println("After modification: " + list);
    }
}