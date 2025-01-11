package dev.yashshekhar.spring_jpa_hibernate.models.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_order")
public class Order implements Serializable {

    @EmbeddedId
    private OrderId id;

    private String orderInfo;

    private String anotherField;

    @Embedded
    private Address address;
}
