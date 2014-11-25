package com.mmv.deliverymmv.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Mary
 */
@Entity
//Видите, я не указывал аннотацию @Table
//Hibernate все поймет за меня.
public class Product implements Serializable {

    private Integer id;
    private String nameProduct;
    private Integer availableProduct;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//Я описал Id над геттером, значит, и с остальными полями работа будет идти через геттеры.
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getAvailableProduct() {
        return availableProduct;
    }

    public void setAvailableProduct(Integer availableProduct) {
        this.availableProduct = availableProduct;
    }
}
