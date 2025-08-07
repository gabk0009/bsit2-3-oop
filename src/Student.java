class  Student {
String name;
int age;
String course;
double grade1;
double grade2;
double grade3;

public Student(String myName, int Age, String Course, double Grade1, double Grade2, double Grade3) {
    name = myName;
    age = Age;
    course = Course;
    grade1 = Grade1;
    grade2 = Grade2;
    grade3 = Grade3;

}

public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Course: " + course);
    System.out.println("Grade 1: " + grade1 + ", " + "Grade 2: " + grade2 + ", " + "Grade 3: " + grade3);

}

public double calculateAverage() {
    return (grade1 + grade2 + grade3) / 3;
}

public String getLetterGrade() {
    double average = calculateAverage();
    if (average >= 90) {
        return "A";
    } else if (average >= 80) {
        return "B";
    } else if (average >= 70) {
        return "C";
    } else if (average >= 60) {
        return "D";
    } else {
        return "F";
    }
}

public boolean isPassing() {
    return calculateAverage() >= 70;
}
}