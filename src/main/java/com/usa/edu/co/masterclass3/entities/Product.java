package com.usa.edu.co.masterclass3.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")

public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer year;

    //El serializable lo que hace es que mandauna instancia y la manda como 1 y 0 lo usa JPA
    //lo bajo a 1 y 0 y al otro lado creo una instanica

    @ManyToOne //Muchos productos tendran una categoria
    @JoinColumn(name = "categoryId")
    private Category category;





}
