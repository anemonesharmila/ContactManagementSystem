/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.persistProject.dao.impl;

import com.sharmila.persistProject.dao.ContactDao;
import com.sharmila.persistProject.entity.TblContacts;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author sharmila
 */
public class ContactDaoImpl implements ContactDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction transaction;

    public ContactDaoImpl() {
        emf = Persistence.createEntityManagerFactory("PersistProjectPU");
        em = emf.createEntityManager();
    }

    @Override
    public void insert(TblContacts contact) {
        transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        em.persist(contact);
        em.flush();
        transaction.commit();

    }

    @Override
    public void update(TblContacts contact) {
        transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }

        em.merge(contact);
        em.flush();
        transaction.commit();

    }

    @Override
    public void Delete(int id) {
        transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
        TblContacts ct = getById(id);
        if (ct != null) {
            em.remove(ct);
        }
        em.flush();
        transaction.commit();

    }

    @Override
    public List<TblContacts> getAll() {
        return em.createQuery("select c from TblContacts c").getResultList();
    }

    @Override
    public TblContacts getById(int id) {
        return em.find(TblContacts.class, id);
    }

}
