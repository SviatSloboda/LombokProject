package neuefische;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Value
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;
}
