package com.exam.pattern.jdkdynamic;

import com.exam.pattern.jdkdynamic.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    void dynamicProxyTestV1(){
        Ainterface target1 = new Aimpl();
        TimeInvocationHandler handler = new TimeInvocationHandler(target1);
        Ainterface proxy = (Ainterface)Proxy.newProxyInstance(Ainterface.class.getClassLoader(),
                new Class[]{Ainterface.class},
                handler);
        proxy.call();

        Binterface target2 = new Bimpl();
        TimeInvocationHandler handler2 = new TimeInvocationHandler(target2);
        Binterface proxy2 = (Binterface) Proxy.newProxyInstance(Binterface.class.getClassLoader(),
                new Class[]{Binterface.class},
                handler2);
        proxy2.call();
    }


}
