package abstractclass;
abstract class Course {
    //TODO 3: include instance variables for Course class and complete constructor code
    Subject subject;
    String instructor;
    int courseFee;
    int assignmentMarks;
    int quizMarks;

    Course(Subject subject, String instructor, int fee) {
        this.subject = subject;
        this.instructor = instructor;
        this.courseFee = fee;
    }
}
