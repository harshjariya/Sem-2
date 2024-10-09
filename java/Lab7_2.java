public class Lab7_2{
	public static void main(String[] args) {
	B b1 = new B();
	b1.A();
	b1.A1();	
	b1.A2();
	b1.A12();
	}
}
interface A{
	int dhoni = 7;
	public void A();
}
interface A1 extends A{
	int virat = 18;
	public void A1();

}
interface A2 extends A{
	int rohit = 45;
	public void A2();
}
interface A12 extends A1,A2{
	int gill = 77;
	public void A12();
}
 class B implements A12{
 	public void A(){
 		System.out.println("MS Dhoni : "+dhoni);
 	}
 	public void A1(){
 		System.out.println("Virat kohli : "+virat);
 	}
 	public void A2(){
 		System.out.println("Rohit Sharma : "+rohit);
 	}
 	public void A12(){
 		System.out.println("Shubhman Gill : "+gill);
 	}
 }