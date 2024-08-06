package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component 
@Entity 
@Table (name= "contratacion_detalle")

public class ContratacionDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_contratacion_detalle")
	private int id_contratacion_detalle;
@Column(name="id_contratacion")
	private int id_contratacion;
	@Column(name="id_empleado")
	private int id_empleado;
	@Column(name="id_tipo_contrato")
	private int id_tipo_contrato;
	@Column(name="id_sucursal")
	private int id_sucursal;
	
	@Column(name="academia_titulo")
	private String academia_titulo;
	@Column(name="academia_pais")
	private String academia_pais;
	@Column(name="academia_nivel")
	private String academia_nivel;
	@Column(name="academia_area")
	private String academia_area;
	@Column(name="academia_institucion")
	private String academia_institucion;
	@Column(name="academia_nivel_estado")
	private String academia_nivel_estado;
	@Column(name="academia_certificado")
	private String academia_certificado;
	@Column(name="academia_nivel_idioma_ingles")
	private String academia_nivel_idioma_ingles;
	@Column(name="academia_nivel_idioma_otro")
	private String academia_nivel_idioma_otro;
	@Column(name="explab_nivel")
	private String explab_nivel;
	
	@Column(name="explab_tiempo_anios")
	private int explab_tiempo_anios;
	@Column(name="sueldo_estimado")
	private Double sueldo_estimado;
	@Column(name="sueldo_aprobado")
	private Double sueldo_aprobado;
	@Column(name="dias_vacaciones")
	private int dias_vacaciones;
	@Column(name="aprobado_contratacion")
	private String aprobado_contratacion;
	@Column(name="fecha_inicio_contratacion")
	private Date fecha_inicio_contratacion; // sn
	@Column(name="fecha_fin_contratacion")
	private Date fecha_fin_contratacion;
	@Column(name="hoja_vida")
	private String hoja_vida;
	@Column(name="foto")
	private String foto;

	public ContratacionDetalle(int id_contratacion_detalle, int id_contratacion, int id_empleado, int id_tipo_contrato, int id_sucursal, String academia_titulo, String academia_pais
			, String academia_nivel, String academia_area, String academia_institucion, String academia_nivel_estado, String academia_certificado, String academia_nivel_idioma_ingles
			, String academia_nivel_idioma_otro, String explab_nivel, int explab_tiempo_anios, Double sueldo_estimado, Double sueldo_aprobado, int dias_vacaciones, String aprobado_contratacion
			, Date fecha_inicio_contratacion, Date fecha_fin_contratacion, String hoja_vida,String foto ) {
		
	}
	

	

	
}
