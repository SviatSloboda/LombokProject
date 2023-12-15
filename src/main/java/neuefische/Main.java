package neuefische;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Jack", "32432", 1);
        Student student2 = new Student(2, "John", "3423", 2);
        Student student3 = new Student(3, "Anna", "01234", 3);
        Student student4 = new Student(4, "Jane", "3124", 1);

        Teacher teacher = new Teacher(1, "Ben", "Biology");

        Course course = new Course(1, "Biology Basics", teacher,
                new ArrayList<>(Arrays.asList(student1, student2, student3, student4)));

        System.out.println(course);

        student1.setGrade(5);
        System.out.println(student1.getGrade());


        System.out.println(course.getName());

        Student specialStudent = Student.builder()
                .id(43)
                .name("Liza")
                .address("32423")
                .grade(4).build();

        Student specialStudent2 = Student.builder()
                .id(123)
                .name("Muhammed")
                .address("23423")
                .grade(2).build();

        System.out.println(specialStudent);
        System.out.println(specialStudent2);

        Teacher specialTeacher = Teacher.builder()
                .id(100)
                .name("Alex")
                .subject("Chemistry")
                .build();

        System.out.println(specialTeacher);

        Course course1 = Course.builder()
                .id(101)
                .name("Chemistry advanced")
                .teacher(specialTeacher)
                .students(new ArrayList<>(Arrays.asList(specialStudent, specialStudent2)))
                .build();

        System.out.println(course1);

        Teacher specialTeacher2 = specialTeacher.withName("Erick");
        System.out.println(specialTeacher2);



        Uni uni = new Uni(1, "Humbolt Uni",new ArrayList<>(Arrays.asList(course, course1)));
        System.out.println(uni);

        System.out.println(UniService.getAverageGrade(course));

        System.out.println(UniService.getAverageGradePerUni(uni));

        System.out.println(UniService.getAllStudentsWithGradeGood(uni));
    }
}