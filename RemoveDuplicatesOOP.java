
package removeduplicatesoop;

import java.util.ArrayList;


public class RemoveDuplicatesOOP {

   
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        DuplicateRemover remover = new DuplicateRemover(list);
        remover.removeDuplicates();
        remover.displayNumbers();
    }
}
