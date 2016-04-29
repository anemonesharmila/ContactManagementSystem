package com.sharmila.persistProject.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-29T21:41:43")
@StaticMetamodel(TblContacts.class)
public class TblContacts_ { 

    public static volatile SingularAttribute<TblContacts, String> firstName;
    public static volatile SingularAttribute<TblContacts, String> lastName;
    public static volatile SingularAttribute<TblContacts, String> address;
    public static volatile SingularAttribute<TblContacts, Long> phoneNumber;
    public static volatile SingularAttribute<TblContacts, Date> addedDate;
    public static volatile SingularAttribute<TblContacts, Date> modifiedDate;
    public static volatile SingularAttribute<TblContacts, Integer> id;
    public static volatile SingularAttribute<TblContacts, String> email;
    public static volatile SingularAttribute<TblContacts, Boolean> status;

}