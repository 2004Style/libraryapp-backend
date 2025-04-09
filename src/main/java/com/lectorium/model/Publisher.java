package com.lectorium.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // representa a los getters y setters
@NoArgsConstructor // representa a los constructores sin argumentos
@AllArgsConstructor // representa a los constructores con argumentos

public class Publisher {
    private Integer idPublisher;
    private String name;
}
