package Data_Structure;

public class ArraysDynamic {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0,"X");
        dynamicArray.delete("A");
        dynamicArray.search(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);
        System.out.println("capacity: "+dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
