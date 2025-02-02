package abstractclass;
class OnlineCourse extends Course  {
    //TODO 15: include videoLessons and weeks attributes
    String videoLessons;
    int weeks;
    OnlineCourse(Subject subject, String instructor, int fee, String videoLessons, int weeks) {

        super(subject, instructor, fee);
        //TODO 16: initialize other attributes
        this.videoLessons = videoLessons;
        this.weeks = weeks;
    }
}
