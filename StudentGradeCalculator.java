import java.util.Scanner;

class Grade{
    public String grade(int avgp){
        switch (avgp / 10) {
            case 10:
                return "Grade Obtained : A+";
            case 9:
                return "Grade Obtained : A";
            case 8:
                return "Grade Obtained : B+";
            case 7:
                return "Grade Obtained : B";
            case 6:
                return "Grade Obtained : C";
            case 5:
                return "Grade Obtained : D";
            default:
                return "Grade Obtained : F";
        }
    }
}

public class StudentGradeCalculator{
    public static void main(String[] args){
        Grade grade = new Grade();
        Scanner in = new Scanner(System.in);
        System.out.println("\n\nHello !! Let's go\n");
        System.out.println("Task:02 Student Grade Calculation\n");
        System.out.println("Enter the amount of subjects\n");
        int totalsubs = in.nextInt();
        int totalmarks = 0;

        
        for (int i = 0; i < totalsubs; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int marks = in.nextInt();
            totalmarks += marks;
        }

        
        int avgpercentage = totalmarks / totalsubs;

        
        String Grade = grade.grade(avgpercentage);

        
        System.out.println("Total marks obtained :- " + totalmarks+"\n");
        System.out.println("Percentage obtained :- " + avgpercentage+"%\n");
        System.out.println("Grade obtained :- " + Grade+"\n");
        System.out.println("Hope this was useful to you!! \n\nThank you :)\n\n");

        in.close();
        
    }
}