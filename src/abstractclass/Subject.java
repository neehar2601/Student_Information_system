package abstractclass;
class Subject {
    String title;
    double credits;

    Subject(String title, double credits) {
        // TODO 4 Include the instance variables -
        //  title(a string) and credits(double) and
        //  define the class constructor
        this.title = title;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                '}';
    }
}
