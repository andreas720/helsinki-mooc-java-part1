import javafx.scene.web.WebHistory;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);


        // Asks for student information from the user until the user gives a student an empty name


        System.out.println("name: ");
        String name = sc.nextLine();
        if ((name.isEmpty())) {
        } else {

        }


        while (true) {
            System.out.println("name: ");
            name = sc.nextLine();

            if (name.equals("")) {
                System.out.println(list);
                if (!(list.size() == 0)) {
                    System.out.println("Give search term: ");
                    String searchTerm = sc.next();
                    System.out.println("Result:");
                    for (Student s : list) {
                        if (s.getName().contains(searchTerm)) {
                            System.out.println(s.getName() + " (" + s.getStudentNumber() + ")");
                        }
                    }
                }
                break;
            } else {
                System.out.println("number: ");
                String studentNo = sc.nextLine();

                list.add(new Student(name, studentNo));
            }
        }


    }
}
  