package com.recep.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DAO {

	SessionFactory sessionFactory;

	public DAO() {
		sessionFactory = new Configuration().configure("hibertane.cfg.xml").buildSessionFactory();
	}

	/**
	 * Bu obje sadece entity alýr.
	 * 
	 * @param ob
	 */
	public void add(Object ob) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			session.save(ob);

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}

	public void update(Object ob) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			session.merge(ob);

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}

	}

	public void deleteStudent(Object ob) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.delete(ob);

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}

	}

	/*public Secmen getSecmenId(int id) {
		Session session = sessionFactory.openSession();
		Secmen secmen = null;
		try {

			secmen = session.get(Secmen.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return secmen;
	}

	public List<Secmen> getSecmenList() {
		Session session = sessionFactory.openSession();
		List<Secmen> list = null;
		try {

			list = session.createCriteria(Secmen.class).list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
	}

	public Parti getPartiId(int id) {
		Session session = sessionFactory.openSession();
		Parti parti = null;
		try {

			parti = session.get(Parti.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return parti;
	}

	public List<Parti> getPartiList() {
		Session session = sessionFactory.openSession();
		List<Parti> list = null;
		try {

			list = session.createCriteria(Parti.class).list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
	}
	*/
	
	public void close(){
		sessionFactory.close();
	}
	

}
