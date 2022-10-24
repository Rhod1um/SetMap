package HashMap;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HashMapExercise {
  private Map<String, Integer> nameAge;

  HashMapExercise(HashMap<String, Integer> nameAge){
    this.nameAge=nameAge;
  }

  public void print(){
    System.out.println(nameAge);
  }
  public void searchNameAndPrintAge(String name){
    if (nameAge.containsKey(name.toLowerCase(Locale.ROOT))){
      System.out.println("Age for " + name + ": " + nameAge.get(name));
    } else System.out.println("No name like that");
  }
}
