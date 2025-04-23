package com.lectorium.model;

<<<<<<< HEAD
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
>>>>>>> 15f02cf9a023d1f24aff24c3bb7bb25c46fb2ea3
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "publishers") // , schema="sistemas")
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // para comparar objetos
public class Publisher {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Integer idPublisher;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 150)//, name="direccion")
	private String address;
=======
@Data // representa a los getters y setters
@NoArgsConstructor // representa a los constructores sin argumentos
@AllArgsConstructor // representa a los constructores con argumentos
@Entity
public class Publisher {
    @Id
    private Integer idPublisher;
    private String name;
>>>>>>> 15f02cf9a023d1f24aff24c3bb7bb25c46fb2ea3
}
