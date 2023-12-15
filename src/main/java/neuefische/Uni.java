package neuefische;

import java.util.List;

public record Uni(
    int id,
    String name,
    List<Course> courses
) {
}
