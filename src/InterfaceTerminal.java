import java.util.Scanner;

public class InterfaceTerminal {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        University  university = new University("minnesota state university");
        university.AddDepartment(new Department("Computer Science "));
        university.AddDepartment(new Department("Software  Engineering "));
        System.out.println("please press 1 if you're professor ");
        System.out.println("please press 2 if you're Student ");
        int option = scanner.nextInt();
        if(option ==1){
            infoProfessor( university);


        }


    }

    static void infoProfessor(University university){

        System.out.println("please Select your Department ");


        for (int i = 0; i < university.getDepartmentList().size(); i++) {

            System.out.println("press "+i +"for"+university.getDepartmentList().get(i));


        }

        int choice  = scanner.nextInt();


        System.out.println("please insert your name ?");

        String fullName  = scanner.nextLine();

       var professor =  new Professor(fullName,university.getDepartmentList().get(choice));





       options(professor);







    }



    static void options(Professor professor){


        System.out.println("create a course ?");




        System.out.println("Grade a course ?");
    }


    static void createCourse(){



    }



    static void gradeCourse(){



    }


}
