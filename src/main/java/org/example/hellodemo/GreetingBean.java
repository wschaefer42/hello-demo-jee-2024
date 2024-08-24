package org.example.hellodemo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import java.util.Random;

@RequestScoped
public class GreetingBean {
    @Inject
    private GreetingRepository greetingRepository;

    public String getGreeting() {
        return greetingRepository.getGreetings().get(new Random().nextInt(greetingRepository.getGreetings().size()));
    }
}
