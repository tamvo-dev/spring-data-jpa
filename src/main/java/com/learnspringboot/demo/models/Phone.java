package com.learnspringboot.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author tamvo
 * @created 09/03/2020 - 9:46 AM
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String number;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "owner_id")
    private Employee owner;
}
