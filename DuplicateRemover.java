
package removeduplicatesoop;


import java.util.ArrayList;

class DuplicateRemover {
    private ArrayList<Integer> numbers;

    public DuplicateRemover(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public void removeDuplicates() {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer num : numbers) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Update original list to contain only unique elements
        numbers.clear();
        numbers.addAll(uniqueList);
    }

    public void displayNumbers() {
        System.out.println("List after removing duplicates: " + numbers);
    }
}
