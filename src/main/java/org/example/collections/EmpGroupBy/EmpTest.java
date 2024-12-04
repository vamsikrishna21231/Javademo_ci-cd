package org.example.collections.EmpGroupBy;

import org.example.collections.flatMap.EmpClass;

import java.util.*;
import java.util.stream.Collectors;

public class EmpTest {
    public  static void main(String[] args) {
        List<Employee> empTestList= new ArrayList<>();
        Employee first=new Employee();
        first.setEmpId("1");

        first.setSalary(4000.0);
        first.setDepartment("it");
        Employee second=new Employee();
        second.setEmpId("2");

        second.setSalary(50074.0);
        second.setDepartment("it");
        Employee third=new Employee();
        third.setEmpId("3");

        third.setSalary(2000.0);
        third.setDepartment("it");


        Employee firstCse=new Employee();
        firstCse.setEmpId("1");

        firstCse.setSalary(4000.0);
        firstCse.setDepartment("cse");

        Employee secondCse=new Employee();
        secondCse.setEmpId("2");

        secondCse.setSalary(5000.0);
        secondCse.setDepartment("cse");

        Employee thirdCse=new Employee();
        thirdCse.setEmpId("3");

        thirdCse.setSalary(2000.0);
        thirdCse.setDepartment("cse");

        Employee firstMech=new Employee();
        firstMech.setEmpId("1");

        firstMech.setSalary(4000.0);
        firstMech.setDepartment("mech");
        Employee secondMech=new Employee();
        secondMech.setEmpId("2");

        secondMech.setSalary(5000.0);
        secondMech.setDepartment("mech");

        Employee thirdMech=new Employee();
        thirdMech.setEmpId("3");

        thirdMech.setSalary(2000.0);
        thirdMech.setDepartment("mech");
        empTestList.add(first);
        empTestList.add(second);
        empTestList.add(third);

        empTestList.add(firstCse);
        empTestList.add(secondCse);
        empTestList.add(thirdCse);

        empTestList.add(firstMech);
        empTestList.add(secondMech);
        empTestList.add(thirdMech);


//        Map<String,Double> deptAvgSalary=new HashMap<>();
//
//        Iterator<Employee> itr= empTestList.iterator();
//        while (itr.hasNext()){
//            Employee emp=itr.next();
//            if (deptAvgSalary.containsKey(emp.getDepartment()))
//            {
//                Double d=deptAvgSalary.get(emp.getDepartment());
//                Double total= d+emp.getSalary();
//                deptAvgSalary.put(emp.getDepartment(), total);
//
//            }
//            else {
//                deptAvgSalary.put(emp.getDepartment(), emp.getSalary());
//
//            }
//
//        }

      Map<String,Double> deptAvgSalary=empTestList.stream()
                      .collect(Collectors.groupingBy(Employee::getDepartment
                              ,Collectors.averagingDouble(Employee::getSalary))
                      );
        System.out.println(deptAvgSalary);
    }
}
