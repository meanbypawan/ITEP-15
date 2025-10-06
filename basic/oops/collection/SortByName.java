import java.util.Comparator;
class SortByName implements Comparator<Employee>{
   public int compare(Employee o1, Employee o2){
      String o1KaNaam = o1.getName();
      String o2KaNaam = o2.getName();
      int diff = o1KaNaam.compareTo(o2KaNaam);
      if(diff == 0)
        return 1;
      return diff;   
   }
}