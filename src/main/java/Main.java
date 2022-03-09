import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/andreasantos/IdeaProjects/studentportal/src/main/java/StudentInfo");
        Scanner studentFile = new Scanner(file);
        Scanner usrInput = new Scanner(System.in);
        List<studentInfo> studentInfoList = new ArrayList<studentInfo>();
        List<String> classes = new ArrayList<>();
        List<String> grades = new ArrayList<>();
        int i = 0;
        while(studentFile.hasNext()){
            System.out.println("This is where the loop starts");
            String studentID = studentFile.next();
            String lastName = studentFile.next();
            String firstName = studentFile.next();
            String email = studentFile.next();
            String password = studentFile.next();
            double currentGPA = studentFile.nextDouble();

            classes.add(0, studentFile.next());
            grades.add(0, studentFile.next());
            classes.add(1, studentFile.next());
            grades.add(1, studentFile.next());
            classes.add(2, studentFile.next());
            grades.add(2, studentFile.next());
            classes.add(3, studentFile.next());

            int tuition = studentFile.nextInt();

            studentInfoList.add(i, new studentInfo(studentID, email,password, lastName, firstName,
                                currentGPA, Collections.singletonList((classes.get(i))), Collections.singletonList((grades.get(i))), tuition));
            studentInfoList.get(i).printStudentInfo();
            i++;


        } studentFile.close();
        calculator myCalculator = new calculator();

        System.out.println("You need a : "  ) ;
    }
}//end Main
