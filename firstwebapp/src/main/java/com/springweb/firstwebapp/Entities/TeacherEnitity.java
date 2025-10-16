package com.springweb.firstwebapp.Entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "teacher")
public class TeacherEnitity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private  String lastName;
    @Column(name="qualification")
    private String qualification;
    @Column(name="salary")
    private Integer salary;


}
