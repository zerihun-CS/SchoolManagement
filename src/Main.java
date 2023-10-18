import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        Department computerScience = new Department("computerScience");


        Professor professor = new Professor("david rights", computerScience);

        professor.CreateCourse("Math",1200);



        Student student = new Student( "hanna ", 1299);
        Student student2 = new Student( "sami ", 1295);
        Student student3 = new Student( "john  ", 1294);
        Student student4 = new Student( "david  ", 1293);




        System.out.println("please insert your student info ");

    }
}