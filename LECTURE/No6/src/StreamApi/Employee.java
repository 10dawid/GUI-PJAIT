package LECTURE.No6.src.StreamApi;
import lombok.*;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Employee {

    private String firstName;
    private String lastName;
    int age;

    private List<String> skills;
}
