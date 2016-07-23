package org.blusno.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by root on 16-7-23.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("Hello application event");

        context.close();
    }
}
