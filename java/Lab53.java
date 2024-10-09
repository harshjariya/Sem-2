import java.util.Scanner;
public class Lab53{
	
	void Result(){
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int Aco=0,Eco=0,Ico=0,Oco=0,Uco=0;
	while(!st.equals("quit")){
		
		for(int i=0;i<st.length()-1;i++){
			char ch = st.charAt(i);
			if(ch=='a'||ch=='A'){
				Aco++;
			}
			if(ch=='e'||ch=='E'){
				Eco++;
			}
			if(ch=='i'||ch=='I'){
				Ico++;
			}
			if(ch=='o'||ch=='O'){
				Oco++;
			}
			if(ch=='u'||ch=='U'){
				Uco++;
			}
		}
		st = sc.next();
	}
		 
		  System.out.println("count of A :"+Aco);
	      System.out.println("count of E :"+Eco);
	 	  System.out.println("count of I :"+Ico);
		  System.out.println("count of O :"+Oco);
	 	  System.out.println("count of U :"+Uco);
	

	
	}	

	public static void main(String[] args) {
		Lab53 l1 = new Lab53();
		l1.Result();
	 

	}
}	
