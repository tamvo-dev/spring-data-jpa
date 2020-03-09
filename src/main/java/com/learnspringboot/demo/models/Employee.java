package com.learnspringboot.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author tamvo
 * @created 09/03/2020 - 9:50 AM
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Long owner_id;
    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Phone> phones;
}
