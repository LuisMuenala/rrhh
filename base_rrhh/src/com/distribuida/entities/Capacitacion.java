package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity  
@Table(name = "capacitaciones")
public class Capacitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "capacitacion_id")
	private int id_capacitacion;
	
	@Column(name="empleado_id")
	private int empleado_id;
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	@Column(name = "fecha_fin")
	private Date fecha_fin;
	@Column(name = "descripcion")
	private String descripcion;
	//forK empleado_id class empleado 
	//@JoinColumn(name ="empleado_id")
	//@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})																			//refressh marge
	//private Empleado empleado;
	
	
	public Capacitacion() {}
	public Capacitacion(int id_capacitacion,int empleado_id,String nombre,Date fecha_inicio,Date fecha_fin,String descripcion
			) {
		this.id_capacitacion = id_capacitacion;
		this.empleado_id = empleado_id;
		this.nombre = nombre;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.descripcion = descripcion;

	}
	public int getId_capacitacion() {
		return id_capacitacion;
	}
	public void setId_capacitacion(int id_capacitacion) {
		this.id_capacitacion = id_capacitacion;
	}
	
	
	
	public int getEmpleado_id() {
		return empleado_id;
	}
	public void setEmpleado_id(int empleado_id) {
		this.empleado_id = empleado_id;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Capacitacion [id_capacitacion=" + id_capacitacion + ", empleado_id=" + empleado_id + ", nombre="
				+ nombre + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", descripcion="
				+ descripcion + "]";
	}
	
	
	
}
