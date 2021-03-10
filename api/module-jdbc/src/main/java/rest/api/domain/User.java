package rest.api.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String id;
    private String name;
    private String password;
    private String authorities;
}
