package org.blusno.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by root on 16-7-23.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    public void onApplicationEvent(DemoEvent demoEvent) {

        String msg = demoEvent.getMsg();
        System.out.println("我{bean-demoListener}接收到了{bean-demopublisher}发布的消息：" + msg);
    }
}
