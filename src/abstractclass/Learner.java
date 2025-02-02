package abstractclass;
//TODO 12: make Learner class implement Assessment interface
public class Learner implements Assessments {
    //TODO 1: declare instance variables
    String name;
    double grade;
    Course course;
    double gradeScore;



    Learner(String name, double grade, Course course, double gradeScore) {
        //TODO 2: complete constructor
        this.name = name;
        this.grade = grade;
        this.course = course;
        this.gradeScore = gradeScore;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }
    //TODO 13: override assignmentScore() method
    @Override
    public void assignmentScore(int marks) {
        //set the assignmentMarks attribute of the Course object.
        course.assignmentMarks = marks;

    }
    //TODO 14: override quizScore() method
    @Override
    public void quizScore(int marks) {
    //set the quizMarks attribute of the Course object.
        course.quizMarks = marks;
    }
    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;
        //TODO 17: calculate gradeScore as per the instructions above
        // Check if course title contains "Online"
        if (course.subject.title.contains("Online")) {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;
        } else {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
        }

        // Convert marks to a score out of 10
        double assignmentScoreOutOf10 = (double) course.assignmentMarks / maxAssignmentMarks * 10;
        double quizScoreOutOf10 = (double) course.quizMarks / maxQuizMarks * 10;

        // Calculate the average
        this.gradeScore = (assignmentScoreOutOf10 + quizScoreOutOf10) / 2;
        return this.gradeScore;
    }
}
