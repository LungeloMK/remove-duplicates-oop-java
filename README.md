# Remove Duplicates from ArrayList (OOP in Java)

##  Overview
This Java program removes duplicate elements from an `ArrayList<Integer>` **without using built-in Set classes**.  
It demonstrates **Object-Oriented Programming (OOP)** principles with manual duplicate removal logic.

---

##  Features
- Manual duplicate removal using loops and `.contains()`.
- Preserves the original insertion order.
- Encapsulation of data and logic inside a class.

---

##  Technologies Used
- **Java** (JDK 8 or higher)

---

##  Code

### DuplicateRemover.java
```java
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

        numbers.clear();
        numbers.addAll(uniqueList);
    }

    public void displayNumbers() {
        System.out.println("List after removing duplicates: " + numbers);
    }
}
