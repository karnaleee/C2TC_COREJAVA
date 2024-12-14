package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.employees.Developer;
public class AssignmentMain {
public static void main(String[] args) {
Manager manager = new Manager("John", 101, 90000, "Sales");
Developer developer = new Developer("Alice", 102, 80000, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}

