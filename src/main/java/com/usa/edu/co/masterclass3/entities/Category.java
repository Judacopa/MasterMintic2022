package com.usa.edu.co.masterclass3.entities;

import jdk.jfr.Name;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")

public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")

    private List <Product> products;
}
