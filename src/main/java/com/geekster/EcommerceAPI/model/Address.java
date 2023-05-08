package com.geekster.EcommerceAPI.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String name;
    private String landmark;
    private String phNo;
    private String zipcode;
    private String state;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}
