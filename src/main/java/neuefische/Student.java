package neuefische;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {
    int id;
    String name;
    String address;
    int grade;
}
