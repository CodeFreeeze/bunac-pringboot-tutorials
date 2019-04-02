package gloffice.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "contact")
@Getter @Setter
public class UserInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "Last Name is required.")
    @Size(min = 2, message = "Last Name must be at least 2 characters.")
    private String lastName;
    @NotEmpty(message = "First Name is required.")
    @Size(min = 2, message = "First Name must be at least 2 characters.")
    private String firstName;
    @Column(name = "mobile_no")
    @Size(min = 11, max = 11, message = "Mobile no. must be 11 digits.")
    private String mobileNumber;
    @NotEmpty(message = "Address is required.")
    private String address;

}
