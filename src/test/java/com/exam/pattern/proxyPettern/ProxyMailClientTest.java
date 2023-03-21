package com.exam.pattern.proxyPettern;

import com.exam.pattern.proxyPettern.source.MailCachingProxy;
import com.exam.pattern.proxyPettern.source.RealMail;
import org.junit.jupiter.api.Test;

public class ProxyMailClientTest {

    @Test
    void noProxyTest(){
        RealMail realMail = new RealMail();
        ProxyMailClient proxyMailClient = new ProxyMailClient(realMail);
        proxyMailClient.execute();
        proxyMailClient.execute();
        proxyMailClient.execute();
    }

    @Test
    void proxyCacheTest(){
        RealMail realMail = new RealMail();
        MailCachingProxy mailCachingProxy = new MailCachingProxy(realMail);
        ProxyMailClient proxyMailClient = new ProxyMailClient(mailCachingProxy);
        proxyMailClient.execute();
        proxyMailClient.execute();
        proxyMailClient.execute();
    }


}
