package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Capacitacion;

public interface CapacitacionDAO {
	public List<Capacitacion> findAll();
	public Capacitacion findOne(int id);
	public void add(Capacitacion capacitacion);
	public void up(Capacitacion capacitacion);
	public void del(int id);
}
