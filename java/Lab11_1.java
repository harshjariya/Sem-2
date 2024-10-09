import java.io.*;
import java.util.Spliterator;

public class Lab11_1 {

    public static void main(String[] args) {

        String xyz = "abc.txt";

        try{
            PrintWriter pw = new PrintWriter("xyz.txt");

            BufferedWriter br = new BufferedWriter(new FileWriter(xyz));
            br.write("Harsh,18/n");
            br.write("abc,19/n");
            br.close();

        }
        catch(Exception e){
        }

        try{

            BufferedReader bw = new BufferedReader(new FileReader(xyz));

            String line;


            while ((line = bw.readLine())!=null) {

                String name_age [] = line.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student st = new Student(name, age);
                System.out.println(st);
            }
            bw.close();
        }
        catch(Exception e){

        }

    }
}

class Student{

String name;
int age;

    Student(String name,int age){

        this.name = name;
        this.age = age;



    }

    public String toString(){

        return "name:"+name+" age"+age;
    }

}