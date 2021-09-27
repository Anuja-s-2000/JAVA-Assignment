import java.util.*;

public class CollectionsQuestion2 {
    public static void main(String[] args) {
        List<String> ls=Arrays.asList("Tree","cat","apple","Dog","Dog","Apple","Ball");
        SortedSet<String> sortedSet = new TreeSet<String>((str1, str2) -> str1.compareToIgnoreCase(str2));
        sortedSet.addAll(ls);
        System.out.println(ls);
        System.out.println("Sorted set: " + sortedSet);
    }
}