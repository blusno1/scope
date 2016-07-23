package org.blusno.prepost;

/**
 * Created by root on 16-7-22.
 */
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-int-method");
    }
    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
