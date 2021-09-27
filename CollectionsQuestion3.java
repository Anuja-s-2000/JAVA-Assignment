import java.util.*;
public class CollectionsQuestion3 { 

    static void trimStringList(List<String> l){
        ListIterator<String> it=l.listIterator();
        while(it.hasNext()){
            it.set(it.next().trim());
        }
    }

    public static void main(String[] args) {

        List<String> stringList=Arrays.asList("   aaa ", "bbb    ", "  ccc      ");
        System.out.println("List of Strings:");
        for (String s:stringList) {
            System.out.printf("%s \n",s);
        }

        trimStringList(stringList);

        System.out.println("Trimmed List of Strings:");
        for (String s:stringList) {
            System.out.printf("%s \n",s);
        }

    }
}
