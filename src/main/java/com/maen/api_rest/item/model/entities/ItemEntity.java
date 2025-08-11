package com.maen.api_rest.item.model.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity // Indica que esta clase es una entidad JPA
@Table(name = "item") // Especifica el nombre de la tabla en la base de datos
public class ItemEntity {

    /*
     * Atributos de la entidad(clase Item)
     * GeneratedValue indica que la base de datos se encargará de generar el identificador único para cada entidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private String sku;

    // Constructor con todos los atributos para crear objetos de la clase Item con los valores valores iniciales
    public ItemEntity(Long id, String name, String description, BigDecimal price, String sku) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.sku = sku;
    }

    // Constructor sin parámetros para crear objetos de la clase Item sin inicializar atributos
    public ItemEntity() {
    }

    // Getters y Setters para acceder y modificar los atributos de la entidad
    // Estos métodos son necesarios para que JPA pueda acceder a los atributos de la entidad
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}