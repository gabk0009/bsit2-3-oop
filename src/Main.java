import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Student ID: ");
       String studentId = scanner.nextLine();
        System.out.print("First Name: ");
       String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
       String lastName = scanner.nextLine();
        System.out.print("Course: ");
       String course  = scanner.nextLine();
        System.out.print("Section: ");
       String section  = scanner.nextLine();
       
       System.out.println("\n STUDENT INFORMATION");
        System.out.println("\tStudent ID: " + studentId);
        System.out.println("\tStudent Name: " + firstName + lastName);
        System.out.println("\tCourse: " + course);
        System.out.println("\tSection: " + section);

       
       System.out.print("\nEnter Midterm Exam Score: ");
        int midTerm = scanner.nextInt();
        System.out.print("Enter Final Exam Score: ");
        int finalExam = scanner.nextInt();
        System.out.print("Enter Project Score: ");
        int project = scanner.nextInt();
        System.out.print("Enter Attendance Score: ");
        int attendance = scanner.nextInt();
        
        int total = midTerm + finalExam + project + attendance;
        int average = total / 4;
        
        String remarks;
        if(average < 75){
            remarks = "FAILED";
        } else {
            remarks = "PASSED";
        }
          
        System.out.println("\n STUDENT SCORE");
        System.out.println("\tMidterm Exam : " + midTerm);
        System.out.println("\tFinal Exam : " + finalExam);
        System.out.println("\tProject : " + project);
        System.out.println("\tAttendance : " + attendance);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
        
       
       
    }
}
