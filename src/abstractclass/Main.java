package abstractclass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 18: Display course list
        System.out.println("Select a course:");
        System.out.println("1. Java");
        System.out.println("2. Java Online");
        System.out.println("3. JavaScript");
        System.out.println("4. JavaScript Online");
        System.out.print("Enter course code: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // TODO 19: Initialize the selected course object
        Course selectedCourse;
        switch (choice) {
            case 1:
                selectedCourse = new ClassroomCourse(new Subject("Java", 3.0), "John Doe", 500, "XYZ School", "Fall 2024");
                break;
            case 2:
                selectedCourse = new OnlineCourse(new Subject("Java Online", 3.0), "John Doe", 400, "20 lessons", 6);
                break;
            case 3:
                selectedCourse = new ClassroomCourse(new Subject("JavaScript", 3.0), "Jane Doe", 500, "ABC School", "Spring 2024");
                break;
            case 4:
                selectedCourse = new OnlineCourse(new Subject("JavaScript Online", 3.0), "Jane Doe", 400, "15 lessons", 5);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        // TODO 20: Accept user input for learner’s name
        System.out.print("Enter your name: ");
        String learnerName = scanner.nextLine();

        // Create learner object
        Learner learner = new Learner(learnerName, 0, selectedCourse, 0);

        // TODO 21: Accept assignment and quiz scores
        int maxAssignmentMarks = selectedCourse.subject.title.contains("Online") ? 30 : 100;
        int maxQuizMarks = selectedCourse.subject.title.contains("Online") ? 10 : 30;

        System.out.println("For " + selectedCourse.subject.title + ", maximum marks: Assignments = " + maxAssignmentMarks + ", Quizzes = " + maxQuizMarks);
        System.out.print("Enter assignment marks: ");
        int assignmentMarks = scanner.nextInt();
        System.out.print("Enter quiz marks: ");
        int quizMarks = scanner.nextInt();

        learner.assignmentScore(assignmentMarks);
        learner.quizScore(quizMarks);

        // TODO 22: Call calculateGrade() and display result
        double gradeScore = learner.calculateGrade();
        System.out.println("Final Grade Score: " + gradeScore);

        if (gradeScore >= 5) {
            System.out.println("Congratulations! You have successfully passed.");
        } else {
            System.out.println("Course completed. Better luck next time!");
        }

        scanner.close();
    }
}
