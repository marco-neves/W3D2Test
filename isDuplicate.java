import java.util.*;
public class isDuplicate{
  public static void main(String[] args){
    List myStrings = new ArrayList<String>();
    myStrings.add("Hello");myStrings.add("Hello1");
    myStrings.add("Hello2");myStrings.add("Hello2");
    myStrings.add("Hello3");myStrings.add("Hello3");
    myStrings.add("Hello4");myStrings.add("Hello5");
    findDuplicates(myStrings);
  }
  public static void findDuplicates(List<String> myStrings){
    Map<String, Integer> map = new HashMap<>();
    for(String str: myStrings){
      if(map.containsKey(str))
        System.out.println(str);
      map.put(str, str.length());
    }
  }
}
