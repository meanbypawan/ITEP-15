import java.util.Comparator;
class SortBySalary implements Comparator<Employee>{
   public int compare(Employee o1, Employee o2){
    int diff =  o1.getSalary() - o2.getSalary();
    if(diff == 0)
      return 1;
    return diff;
   }
}