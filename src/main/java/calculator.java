public class calculator {

    private String grade;
    private double gradeValue;
    private double neededGrade;

    public double calculateGpa(String letterGrade) {
        String grade;

        switch (letterGrade) {
            case "A":
                gradeValue = 4.0;
                break;
            case "B":
                gradeValue = 3.0;
                break;
            case "C":
                gradeValue = 2.0;
                break;
            case "D":
                gradeValue = 1.0;
                break;
            case "E":
                gradeValue = 0.0;
                break;
        }
        neededGrade = (3.0*2)-gradeValue;
        return neededGrade;
    }



}
