package com.github.nibiroo.trn_web_bft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tag")
    private String tag;

    @Column(name = "type")
    private String type;

    @ManyToMany
    @JoinColumn(name = "id_company")
    private Company company;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "description")
    private String description;

    @Column(name = "date_purchase")
    private Date purchaseDate;

    @Column(name = "used")
    private boolean used;
}