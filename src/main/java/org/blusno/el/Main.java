package org.blusno.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by root on 16-7-21.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig
                .class);

        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputResource();

        context.close();
    }
}
