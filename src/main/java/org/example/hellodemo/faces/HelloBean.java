package org.example.hellodemo.faces;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Named
@RequestScoped
@Getter
public class HelloBean {
    private final String hello = "Hello Jakarta Faces";
    @Setter
    private String name;
    private boolean validated = false;

    public String getHello() {
        return StringUtils.isBlank(name) ? "Hello Nobody" : "Hello " + name;
    }

    public void submit() {
        validated = !StringUtils.isBlank(name);
    }
}
