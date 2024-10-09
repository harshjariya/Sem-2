import java.util.Scanner;
public class Lab6b{
	public static void main(String[] args) {
		Manager m1 = new Manager("Harsh",18,"9054300940","sfffewf",50000);
		Employee e1 = new Employee("kalp",18,"7845458600","fdsfffff",40000);
		m1.printDetails();
		e1.printDetails();


	}
}
class Member{
 	String name;
 	int age;
 	String phonenum;
 	String add;
 	double salary;
 	Member(String name,int age,String phonenum,String add,double salary){
 		this.name = name;
 		this.age = age;
 		this.phonenum = phonenum;
 		this.add = add;
 		this.salary = salary;

 		 }
 	void printDetails(){

 		System.out.println("Name :"+this.name);
 		System.out.println("Age :"+this.age);
 		System.out.println("Phonenum :"+this.phonenum);
 		System.out.println("Address :"+this.add);
 		System.out.println("Salary :"+this.salary);
 	}
}
class Manager extends Member{
	 	String department;
	Manager(String name,int age,String phonenum,String add,double salary){
		super(name,age,phonenum,add,salary);
		this.department = department;

	}
	void printDetails(){
		super.printDetails();
		System.out.println("Department"+this.department);
	}

 }
 class Employee extends Member{
 	
 	String specialization;
 	Employee(String name,int age,String phonenum,String add,double salary){
		super(name,age,phonenum,add,salary);
		this.specialization = specialization;
	}
	void printDetails(){
		super.printDetails();
		System.out.println("Specialization"+this.specialization);
	}
 }
