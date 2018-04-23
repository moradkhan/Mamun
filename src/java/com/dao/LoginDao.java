/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Login;
import com.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author l2pc214e
 */
public class LoginDao {

    public void doSave(Login l) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(l);
        s.getTransaction().commit();
        s.close();
    }

    public List<Login> allInfo(String email, String password) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Login where email=:a and password=:b");
        q.setString("a", email);
        q.setString("b", password);
        List<Login> list = q.list();
        return list;
    }

    public boolean doQuery(String email, String password) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("from Login where email=:a and password=:b");
        q.setString("a", email);
        q.setString("b", password);
        List<Login> list = q.list();
        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
