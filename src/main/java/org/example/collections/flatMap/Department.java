package org.example.collections.flatMap;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String department;
    private List<EmpClass> empClass;

    @Override
    public String toString() {
        return "Department{" +
                "department='" + department + '\'' +
                ", empClass=" + empClass +
                '}';
    }

    public List<EmpClass> getEmpClass() {
        return empClass;
    }

    public void setEmpClass(List<EmpClass> empClass) {
        this.empClass = empClass;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Department(String department, List<EmpClass> empClass) {
        this.department = department;
        this.empClass =empClass ;
    }
}
