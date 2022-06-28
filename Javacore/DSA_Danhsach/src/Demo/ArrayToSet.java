package Demo;
import java.util.*;
public class ArrayToSet {
    public static void main(String[] args) {

        String[] vowels = {"a","e","i","o","u"};

        Set<String> vowelsSet = new HashSet<>(Arrays.asList(vowels));
        System.out.println(vowelsSet);


        vowelsSet.remove("e");
        System.out.println(vowelsSet);
        vowelsSet.clear();
        System.out.println(vowelsSet);
    }
}
