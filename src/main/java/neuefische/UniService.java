package neuefische;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UniService {

    public static double getAverageGrade(Course course){
        long value  = course.getStudents().stream()
            .map(student -> student.grade)
            .reduce(0, Integer::sum);

        return (double) value / course.getStudents().size();
    }

    public static double getAverageGradePerUni(Uni uni){
        return uni.courses().stream()
            .map(course ->getAverageGrade(course))
            .reduce(0.0, Double::sum) / uni.courses().size();
    }

    public static List<Student> getAllStudentsWithGradeGood(Uni uni){
        return uni.courses().stream()
            .map(course -> course.getStudents())
            .map(students -> students.stream()
                .filter(student -> student.getGrade() == 2)
                .collect(Collectors.toList()))
            .collect(Collectors.toList()).stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

    }
}

