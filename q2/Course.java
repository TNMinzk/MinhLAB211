package q2;

public class Course implements Comparable<Course> {
    private String id;
    private String courseName;
    private int courseCredit;

    public Course() {
    }

    public Course(String id, String courseName, int courseCredit){
        this.id = id;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public int getCourseCredit(){
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public int compareTo(Course credit) {
        return credit.courseCredit >= courseCredit ? -1 : 0;
    }

    public void print() {
        System.out.printf("%-15s%-60s%-15d\n", id, courseName, courseCredit);
    }
    @Override
    public String toString() {
        return "id: " + id + " | course: " + courseName + " | credit: " + courseCredit;
    }
}
