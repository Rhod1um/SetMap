package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> nameAge = new HashMap<>();
    nameAge.put("veronica", 25);
    nameAge.put("camilla", 23);
    nameAge.put("felina", 22);
    HashMapExercise hashMapExercise = new HashMapExercise(nameAge);
    hashMapExercise.print();
    hashMapExercise.searchNameAndPrintAge("Veronica");
  }
}
