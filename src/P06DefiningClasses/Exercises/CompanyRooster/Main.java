package P06DefiningClasses.Exercises.CompanyRooster;

import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            Employee employee ;

            String[] employeeInformationArr = scanner.nextLine().split(" ");
            if (employeeInformationArr.length == 6){
                
                String name = employeeInformationArr[0];
                double salary = Double.parseDouble(employeeInformationArr[1]);
                String position = employeeInformationArr[2];
                String department = employeeInformationArr[3];
                String email = employeeInformationArr[4];
                int age = Integer.parseInt(employeeInformationArr[5]);
                
                employee = new Employee(name,salary,position,department,email,age);
                employeeList.add(employee);
            } else if (employeeInformationArr.length == 4) {

                String name = employeeInformationArr[0];
                double salary = Double.parseDouble(employeeInformationArr[1]);
                String position = employeeInformationArr[2];
                String department = employeeInformationArr[3];

                employee = new Employee(name,salary,position,department);
                employeeList.add(employee);
            } else if (employeeInformationArr.length == 5) {
                String questionField = employeeInformationArr[4];
                if (questionField.contains("@")){
                    String name = employeeInformationArr[0];
                    double salary = Double.parseDouble(employeeInformationArr[1]);
                    String position = employeeInformationArr[2];
                    String department = employeeInformationArr[3];
                    String email = questionField;

                    employee = new Employee(name,salary,position,department,email);
                    employeeList.add(employee);
                }else {
                    String name = employeeInformationArr[0];
                    double salary = Double.parseDouble(employeeInformationArr[1]);
                    String position = employeeInformationArr[2];
                    String department = employeeInformationArr[3];
                    int age = Integer.parseInt(questionField);

                    employee = new Employee(name,salary,position,department,age);
                    employeeList.add(employee);
                }

            }


        }
        Map<String,List<Employee>> departmentsMap =new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);

            String department = employee.getDepartment();
            if (!departmentsMap.containsKey(department)){
                departmentsMap.put(department,new ArrayList<>());
                departmentsMap.get(department).add(employee);
            }else {
                departmentsMap.get(department).add(employee);
            }
        }

        double maxAverage = 0;
        String bestDepartment = "";
        for (Map.Entry<String, List<Employee>> entry : departmentsMap.entrySet()) {
            String department = entry.getKey();
            double totalDepartmentSum = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                Employee employee = entry.getValue().get(i);
              double currentSalary = employee.getSalary();
                totalDepartmentSum+=currentSalary;
            }
            double averageSalary = totalDepartmentSum / entry.getValue().size();
            if (averageSalary > maxAverage ){
                maxAverage = averageSalary;
                bestDepartment = department;
            }
        }
        System.out.printf("Highest Average Salary: %s%n",bestDepartment);

        employeeList.sort(Comparator.comparing(employee -> employee.getSalary()));
        Collections.reverse(employeeList);
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            String department = employee.getDepartment();
             if (department.equals(bestDepartment)){

                 System.out.printf("%s %.2f %s %d%n",employee.getName(),employee.getSalary(),employee.getEmail(),employee.getAge());

             }
        }


    }
}
