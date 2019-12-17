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
    int count = 0;
    String temp;
    Map<String, Integer> map = new HashMap<>();
    while(true){
      temp = (String)myStrings.get(count);
      map.put(temp,count);
      System.out.println(map.get(count));
      if(map.containsKey(count))
        System.out.println(myStrings.get(count));
      count++;
      if(count==myStrings.size())
        break;
    }
  }
}
