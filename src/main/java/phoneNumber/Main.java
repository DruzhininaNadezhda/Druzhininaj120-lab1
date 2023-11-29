package phoneNumber;
import java.util.HashMap;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> associativeArray  = new HashMap<>();
        associativeArray .put(1, new Number(444, 1234).toString());
        associativeArray .put(2, new Number(424, 12000).toString());
        System.out.println(associativeArray );
        HashSet <String> setArray = new HashSet<>();
        setArray.add(new Number(333, 56789).toString());
        setArray.add(new Number(338, 56789).toString());
        System.out.println(setArray);
    }
}
