package com.py.tecnopar.app.core.models;

import lombok.Data;
import lombok.ToString;
import java.math.BigDecimal;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class teacher extends Auditable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;

    @ToString.Include
    @Column(name = "email")
    private String email;
    
    @Column(name = "age")
    private int age;

    @Column(name = "description")
    private String description;

    @Column(name = "price_time")
    private BigDecimal price_time;

    @Column(name =   "profile_picture")
    private String profilePicture;

    @Column(name = "password")
    private String password;

}
