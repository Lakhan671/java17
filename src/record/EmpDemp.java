package record;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDemp {
    public static void main(String[] args) {
        List<Employee> listEmp=new ArrayList<>();
        listEmp.add(new Employee("KK",1));
        listEmp.add(new Employee("jone",2));
        listEmp.add(new Employee("Singh",4));
        listEmp.add(new Employee("Kunal",5));
        listEmp.stream().sorted((o1, o2) -> {
            if(o1.getName().equals(o2.getName())){
               return  o1.getId()-o2.getId();
            }else {
             return    o1.getName().compareTo(o2.getName())  ;
            }

        }).collect(Collectors.toList())
        .forEach(o->{
            System.out.println(o);
        });
    }

}
