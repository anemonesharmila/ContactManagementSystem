/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CMS.helper;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author sharmila
 */
public class Email {

    private String to, from, host, subject, body;

    public Email() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void sendEmail() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        //session,get default session

        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            //set from;header field of the header

            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("sweet.anemone@gmail.com"));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(body);

            //send message
            Transport.send(mimeMessage);
            System.out.println("Email send successfully");
        } catch (MessagingException me) {
            System.out.println(me.getMessage());
        }
    }

}
