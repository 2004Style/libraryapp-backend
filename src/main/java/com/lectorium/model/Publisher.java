package com.lectorium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // representa a los getters y setters
@NoArgsConstructor // representa a los constructores sin argumentos
@AllArgsConstructor // representa a los constructores con argumentos
@Entity
public class Publisher {
    @Id
    private Integer idPublisher;
    private String name;
}
