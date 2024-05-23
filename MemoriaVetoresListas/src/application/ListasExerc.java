package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ListasExerc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employess will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i+1) + ":");
			System.out.print("id: ");		
			Integer id = sc.nextInt();
			while (hasid(list, id)) {
				System.out.println("Id already taken! Try again:");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name  = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		
		
		Employees pos = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null); //Tipo 2 de busca
		
		//Integer pos = position(list, idsalary); //Tipo 1 de busca
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			//list.get(pos).increaseSalary(percent); //Tipo 1 de busca
			pos.increaseSalary(percent);
		}
		
		System.err.println();
		System.out.println("List of employees: ");
		for (Employees emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	//Verificar se o ID já existe
	public static boolean hasid(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	//Tipo 1 de busca
	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}


