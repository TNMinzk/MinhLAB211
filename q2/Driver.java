package q2;

public class Driver {
    public static void main(String[] args) {

        CourseList l = new CourseList();
        while (true) {

            Manager.menu();
            int choice = Validation.checkInputIntLimit(1, 6);
            switch (choice) {
                case 1:
                    l.listCourses();
                    break;
                case 2:
                    l.findCourse();
                    break;
                case 3:
                    l.createCourse();
                    break;
                case 4:
                    l.sortCourse();
                    break;
                case 5:
                    l.updateCourse();
                    break;
                case 6:
                    return;
            }
        }
    }
}