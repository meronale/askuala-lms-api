package et.edu.askuala.askualalmsapi.domains;


import jdk.jfr.DataAmount;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class TeacherAccount {


    @Id
    @GeneratedValue(strategy = GenerationType .IDENTITY  )
    private Long id;

    @NotBlank(message = "first name is mandatory.")
    @Column(nullable = false)
    @Size(max =15)
    private String firstName;

    @NotBlank(message = "middle name is mandatory.")
    @Column(nullable = false)
    @Size(max =15)
    private String middleName;

    @NotBlank(message = "last name is mandatory.")
    @Column(nullable = false)
    @Size(max =15)
    private String lastName;

    @NotBlank(message = "email is mandatory.")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "phonenumber is mandatory.")
    @Column(nullable = false, unique = true )
    private String phoneNumber;

    @NotNull(message = "Dob is mandatory.")
    @Column(nullable = false)
    //@Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;


    @NotNull(message = "password is mandatory.")
    @Column(nullable = false)
    private Integer password;

    private Boolean isVerified= Boolean.FALSE;



}
