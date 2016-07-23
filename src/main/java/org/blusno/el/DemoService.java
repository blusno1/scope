package org.blusno.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by root on 16-7-20.
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String anothor;

    public String getAnothor() {
        return anothor;
    }

    public void setAnothor(String anothor) {
        this.anothor = anothor;
    }
}
