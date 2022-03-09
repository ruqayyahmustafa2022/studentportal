package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/ruqayyahmustafa/IdeaProjects/Zoo/src/com/company/StudentInfo");
        Scanner studentFile = new Scanner(file);
        Scanner usrInput = new Scanner(System.in);
        List<studentInfo> studentInfoList = new ArrayList<studentInfo>();
        List<String> classes = new ArrayList<>();
        List<String> grades = new ArrayList<>();
        int i = 0;
        while(studentFile.hasNext()){
            System.out.println("This is where the loop starts");
            String studentID = studentFile.next();
            String email = studentFile.next();
            String password = studentFile.next();
            String lastName = studentFile.next();
            String firstName = studentFile.next();
            double currentGPA = studentFile.nextDouble();
            for(int j = 0; j<3; j++) {
                classes.add(j, studentFile.next());
                grades.add(j, studentFile.next());
            }//end for i
            double tuition = studentFile.nextInt();

            studentInfoList.add(i, new studentInfo(studentID, email,password, lastName, firstName,
                                currentGPA, Collections.singletonList(classes.get(i)),
                                Collections.singletonList(grades.get(i)), tuition));
            studentInfoList.get(i).printStudentInfo();
            i++;


        }

    }//end main
}//end Main
