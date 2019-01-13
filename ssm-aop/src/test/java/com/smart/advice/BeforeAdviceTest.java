package com.smart.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import static org.testng.Assert.*;
import org.testng.annotations.*;

/**
 * proxyfactory 代理工厂通过GDK或者CGLIB生成target目标的代理，对target进行advice增强，GreetingBeforeAdvice被织入目标类中。
 *
 */
public class BeforeAdviceTest {

    @Test
	public void before() {
        Waiter target = new NaiveWaiter();
        BeforeAdvice  advice = new GreetingBeforeAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setInterfaces(target.getClass().getInterfaces());
        pf.setOptimize(true);
        pf.setTarget(target);
        pf.addAdvice(advice);

        Waiter proxy = (Waiter)pf.getProxy(); 
        proxy.greetTo("John");
        proxy.serveTo("Tom");
	}
}
