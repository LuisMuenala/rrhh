package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Capacitacion;
@Repository
public class CapacitacionDAOImpl implements CapacitacionDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Capacitacion> findAll(){
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Capacitacion ",Capacitacion.class).getResultList();
	}

	@Override
	@Transactional
	public Capacitacion findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Capacitacion.class,id);
	}
	
	@Override
	@Transactional
	public void add(Capacitacion capacitacion) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(capacitacion);
	
	}
	
	@Override
	@Transactional
	public void up(Capacitacion capacitacion) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(capacitacion);
		// TODO Auto-generated method stub

	}
	
	@Override
	@Transactional
	public void del(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		// TODO Auto-generated method stub

	}

}
