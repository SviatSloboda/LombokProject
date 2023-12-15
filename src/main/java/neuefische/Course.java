package neuefische;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;
}
