import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){

        
            for(int j=0; j<5; j++){

                if ( j ==2 || i ==2) {
                    System.out.print("*");

                    
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
