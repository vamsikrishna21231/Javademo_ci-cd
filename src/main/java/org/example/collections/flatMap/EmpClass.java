package org.example.collections.flatMap;

public class EmpClass {
    private String empName;
    private String empId;
    private double salary;

    public EmpClass(String empName, String empId, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                ", salary=" + salary +
                "\n";
    }
}
