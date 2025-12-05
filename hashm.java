import java.util.*;

class HashCode {
    private int size = 10;
    private ArrayList<LinkedList<Integer>> table;

    HashCode() {
        table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            table.add(new LinkedList<>());
        }
    }

    public int hashmap(int data) {
        return data % size;  // hash function
    }

    public void insert(int data) {
        int index = hashmap(data);
        table.get(index).add(data);
    }

    public String search(int key) {
        int index = hashmap(key);
        if (table.get(index).contains(key)) {
            return "Data " + key + " is present in the hash table.";
        } else {
            return "Data " + key + " is NOT found in the hash table.";
        }
    }

    public void delete(int data) {
        int index = hashmap(data);
        table.get(index).remove((Integer) data); // remove object, not index
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + table.get(i));
        }
    }
}

public class hashm {
    public static void main(String[] args) {
        HashCode h = new HashCode();
        h.insert(10);
        h.insert(20);
        h.insert(50);

        h.display();

        System.out.println(h.search(20));  // search example
        System.out.println(h.search(30));  // search example

        h.delete(20);
        h.display();
    }
}
