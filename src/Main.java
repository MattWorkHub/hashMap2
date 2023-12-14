import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        ArrayList<String> studentName = new ArrayList<>();

        students.put(0, "Gianni");
        students.put(1, "Giannino");
        students.put(2, "Giannone");
        students.put(3, "Gianna");
        students.put(4, "Gian");

        for (Integer i : students.keySet()) {

            studentName.add(i, students.get(i));
        }

        System.out.println(studentName);

        Collections.sort(studentName);

        System.out.println(studentName);
        
    }
}