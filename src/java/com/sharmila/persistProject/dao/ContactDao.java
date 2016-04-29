/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.persistProject.dao;

import com.sharmila.persistProject.entity.TblContacts;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface ContactDao {

    void insert(TblContacts contact);

    void update(TblContacts contact);

    void Delete(int id);

    List<TblContacts> getAll();

    TblContacts getById(int id);
}
