package q1;

public class Driver {
    public static void main(String[] args) {

        StudentList sl = new StudentList();
        while (true) {

            Manager.menu();
            int choice = Validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    sl.createStudent();
                    break;
                case 2:
                    sl.findAndSort();
                    break;
                case 3:
                    sl.updateOrDelete();
                    break;
                case 4:
                    sl.report();
                    break;
                case 5:
                    return;
            }
        }
    }
}