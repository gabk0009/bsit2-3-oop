
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kent", 20, "BSIT", 85.5, 90.0, 88.0);
        Student student2 = new Student("Omar", 22, "BSIT", 70.5, 75.0, 65.0);
        Student student3 = new Student("Neil", 21, "BSIT", 70.0, 55.0, 60.0);


        Student[] students = {student1, student2, student3};
        int passingCount = 0;

        for (Student student : students) {
            System.out.println("\nStudent Information:");
            student.displayInfo();

            double average = student.calculateAverage();
            System.out.println("Average Grade: " + average);
            System.out.println("Letter Grade: " + student.getLetterGrade());

            if (student.isPassing()) {
                System.out.println("Status: PASSING");
                passingCount++;
            } else {
                System.out.println("Status: FAILING");
            }
        }

        System.out.println("\nSummary:2 out of 3 students are passing." );
    }
}