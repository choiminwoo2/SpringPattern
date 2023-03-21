package com.exam.pattern.proxyPettern;

import com.exam.pattern.proxyPettern.source.Mail;


public class ProxyMailClient{

    private Mail mail;

    public ProxyMailClient(Mail mail) {
        this.mail = mail;
    }

    public void execute(){
        mail.send();
    }
}
