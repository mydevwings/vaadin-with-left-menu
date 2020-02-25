package my.devwings.contactpolicy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PersonInfo {
    String name;
    Integer age;
}
