package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;
import case_study.utils.ReadAndWirteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
//    static {
//        employeeList.add(new Employee("1","Nguyễn Xuân Hải","24/10/1998","Nam","201354865","0955412548","abc@gmail.com","xyz","bds","1000000"));
//        employeeList.add(new Employee("2","Nguyễn Xuân Phúc","24/10/1998","Nam","201354865","0955412548","abc@gmail.com","xyz","bds","1000000"));
//        employeeList.add(new Employee("3","Nguyễn Xuân Sang","24/10/1998","Nam","201354865","0955412548","abc@gmail.com","xyz","bds","1000000"));
//
//    }
    @Override
    public void addService() {
        System.out.print("Enter employee's code:");
        String employeeCode = sc.nextLine();
        System.out.print("Enter employee's name:");
        String employeeName = sc.nextLine();
        System.out.print("Enter employee's birth day:");
        String employeeBirthDay = sc.nextLine();
        System.out.print("Enter employee's genders:");
        String employeeGenders = sc.nextLine();
        System.out.print("Enter employee's identity card:");
        String employeeIdentityCard = sc.nextLine();
        System.out.print("Enter employee's phone number:");
        String employeePhone = sc.nextLine();
        System.out.print("Enter employee's email:");
        String employeeEmail = sc.nextLine();
        System.out.print("Enter employee's standard:");
        String employeeStandard = sc.nextLine();
        System.out.print("Enter employee's position:");
        String employeePosition = sc.nextLine();
        System.out.print("Enter employee's wage:");
        String employeeWage = sc.nextLine();

        Employee employee = new Employee(employeeCode, employeeName, employeeBirthDay, employeeGenders, employeeIdentityCard, employeePhone, employeeEmail, employeeStandard, employeePosition, employeeWage);
        employeeList.add(employee);
        ReadAndWirteEmployee.write(employeeList,true);
        System.out.println("Added.");
    }

    @Override
    public void editService() {
        displayService();
        List<Employee> employeeList3 = ReadAndWirteEmployee.read();
        System.out.print("Input employee's code to edit:");
        String employeeCodeEdit = sc.nextLine();

        for(int i = 0 ; i<employeeList3.size(); i++){
            if (employeeCodeEdit.equals(employeeList3.get(i).getCode())){
                System.out.print("Enter again employee's name:");
                String employeeName = sc.nextLine();
                System.out.print("Enter again employee's birth day:");
                String employeeBirthDay = sc.nextLine();
                System.out.print("Enter again employee's genders:");
                String employeeGenders = sc.nextLine();
                System.out.print("Enter again employee's identity card:");
                String employeeIdentityCard = sc.nextLine();
                System.out.print("Enter again employee's phone number:");
                String employeePhone = sc.nextLine();
                System.out.print("Enter again employee's email:");
                String employeeEmail = sc.nextLine();
                System.out.print("Enter again employee's standard:");
                String employeeStandard = sc.nextLine();
                System.out.print("Enter again employee's position:");
                String employeePosition = sc.nextLine();
                System.out.print("Enter again employee's wage:");
                String employeeWage = sc.nextLine();
                employeeList3.get(i).setName(employeeName);
                employeeList3.get(i).setBirthDay(employeeBirthDay);
                employeeList3.get(i).setGenders(employeeGenders);
                employeeList3.get(i).setIdentityCard(employeeIdentityCard);
                employeeList3.get(i).setPhoneNumber(employeePhone);
                employeeList3.get(i).setEmail(employeeEmail);
                employeeList3.get(i).setStandard(employeeStandard);
                employeeList3.get(i).setPosition(employeePosition);
                employeeList3.get(i).setWage(employeeWage);

                ReadAndWirteEmployee.write(employeeList3,false);
                System.out.println("Edited.");
            }
        }
    }

    @Override
    public void deleteService() {
        displayService();
        List<Employee> employeeList2 = ReadAndWirteEmployee.read();
        System.out.print("Enter service's code to delete:");
        String serviceCodeDelete = sc.nextLine();
        for(int i = 0 ; i < employeeList2.size() ; i++){
            if (serviceCodeDelete.equals(employeeList2.get(i).getCode())){
                employeeList2.remove(i);
                ReadAndWirteEmployee.write(employeeList2,false);
            }
        }
        System.out.println("Deleted");
    }

    @Override
    public void displayService() {
        System.out.println("-----List of employee-----");
        List<Employee> employeeList1 = ReadAndWirteEmployee.read();
        for (Employee employee : employeeList1) {
            System.out.println(employee);
        }

    }
}
