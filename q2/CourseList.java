package q2;

import java.util.ArrayList;
import java.util.Collections;

public class CourseList {
    private ArrayList<Course> ls = new ArrayList<Course>();

    public CourseList() {
        ls.add(new Course("CEA201", "Computer Architecture and Organization", 4));
        ls.add(new Course("MAD201", "Discrete Mathematics", 3));
    }

    public void createCourse() {
        while (true) {
            System.out.println("Enter id: ");
            String id = Validation.checkInputString();
            if (Validation.checkIdExist(ls, id) != -1) {
                System.err.println("Id exist.");
            } else {
                System.out.println("Enter course's name: ");
                String name = Validation.checkInputString();
                if (Validation.checkNameExist(ls, name) != -1) {
                    System.err.println("Name exist.");
                } else {

                    System.out.println("Enter course's credit: ");
                    int credit = Validation.checkInputIntLimit(1, 5);
                    ls.add(new Course(id, name, credit));
                    System.out.println("Course added.");
                    System.out.print("Do you want to continue? y/n: ");
                    if (!Validation.checkInputYN()) {
                        return;
                    }
                }
            }
        }
    }

    public void findCourse() {

        if (ls.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        ArrayList<Course> listCourseFindByID = new ArrayList<>();
        System.out.print("Enter id to search: ");
        String id = Validation.checkInputString();
        for (Course course : ls) {
            if (course.getId().contains(id)) {
                listCourseFindByID.add(course);
            }
        }
        if (listCourseFindByID.isEmpty()) {
            System.err.println("Not exist.");
        } else {
            System.out.printf("%-15s%-60s%-15s\n", "id", "course name", "course credit");

            for (Course course : listCourseFindByID) {
                course.print();
            }
        }
    }

    public void updateCourse() {
        if (ls.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.print("Enter id to update: ");
        String id = Validation.checkInputString();
        int index = Validation.checkIdExist(ls, id);
        if (index == -1) {
            System.err.println("Course not found.");
            return;
        } else {
            System.out.println("Enter course's name: ");
            String name = Validation.checkInputString();
            if (Validation.checkNameExist(ls, name) != -1) {
                System.err.println("Name exist.");
            } else {

                System.out.println("Enter course's credit: ");
                int credit = Validation.checkInputIntLimit(1, 5);
                ls.get(index).setCourseName(name);
                ls.get(index).setCourseCredit(credit);
                System.out.println("Course updated.");
            }
        }
    }

    public void sortCourse() {
        ArrayList<Course> courseSortList = new ArrayList<>();
        for (Course course : ls) {
            courseSortList.add(course);
        }
        if (ls.isEmpty()) {
            System.err.println("List empty.");
            return;
        } else {
            Collections.sort(courseSortList);
            System.out.printf("%-15s%-60s%-15s\n", "id", "course name", "course credit");

            for (Course course : courseSortList) {
                course.print();
            }
        }
    }

    public void listCourses() {
        Collections.sort(ls);
        for (Course l : ls) {
            System.out.println(l);
        }
    }
}
