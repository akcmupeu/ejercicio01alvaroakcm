package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCTO")
public class PostEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6930476051200935794L;

	@Id
  	@Column(name = "ID_POST")
  	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPost")
    @SequenceGenerator(sequenceName = "SEQ_POST", allocationSize = 1, name = "seqPost")
	private Long id;
  
  	@Column(name = "NOMBRE")
  	private String nombre;
  	
  	@Column(name = "DESCRIPCION")
  	private String descripcion;

  	@Column(name = "PRECIO")
  	private Double precio;

  	@Column(name = "STOCK")
  	private Double stock;

  	@Column(name = "ESTADO")
  	private String estado;
}
