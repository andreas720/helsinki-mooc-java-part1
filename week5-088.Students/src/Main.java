import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);


        // Asks for student information from the user until the user gives a student an empty name

        while (true) {
            System.out.println("name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("")) {
                break;
            }

                System.out.println("number: ");
                String studentNo = sc.nextLine();

                list.add(new Student(name, studentNo));
            }

        if (list.size() > 0) {
            System.out.println(list);
            System.out.println("Give search term: ");
            String searchTerm = sc.next();
            System.out.println("Result:");
            for (Student s : list) {
                if (s.getName().contains(searchTerm)) {
                    System.out.println(s.getName() + " (" + s.getStudentNumber() + ")");
                }
            }
        }


    }
}
  