package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> myEmployee = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee: #" + i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			myEmployee.add(new Employee(id, name, salary));
		}
		System.out.println("List of employees: ");
		System.out.println(myEmployee);
		
		System.out.println("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		
		
		System.out.println("This id does not exist!");
		sc.close();
	}

}
