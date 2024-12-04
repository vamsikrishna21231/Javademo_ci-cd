package org.example.collections.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpTest {
    public static void main(String[] args) {
        List<EmpClass> emplistIt = Arrays.asList(new EmpClass("vamsi","ed1",30000),
                                                    new EmpClass("krishna","ed2",50000),
                                                    new EmpClass("bhavi","ed3",6000),
                                                     new EmpClass("navi","ed4",30000));
        List<EmpClass> emplistMech = Arrays.asList(new EmpClass("vikas","ed1",30000),
                new EmpClass("krish","ed2",50000),
                new EmpClass("bhavani","ed3",6000),
                new EmpClass("navya","ed4",30000));
        List<EmpClass> emplistCivil = Arrays.asList(new EmpClass("vikram","ed1",30000),
                new EmpClass("kartik","ed2",50000),
                new EmpClass("bhanu","ed3",6000),
                new EmpClass("navi","ed4",30000));
        List<Department> departments=Arrays.asList(new Department("IT",emplistIt),
                                                 new Department("MECH",emplistMech),
                                               new Department("CIVIL",emplistCivil));

        Map<String,List<EmpClass>> salarySorting= departments.stream()
                .collect(Collectors.toMap(
                        Department::getDepartment,
                        department -> department.getEmpClass().stream()
                                .flatMap(emp -> Arrays.asList(emp).stream())
                                .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                                .collect(Collectors.toList())
                ));
        salarySorting.entrySet().stream().forEach(System.out::println);


    }
}
