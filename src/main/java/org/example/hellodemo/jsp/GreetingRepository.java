package org.example.hellodemo.jsp;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class GreetingRepository {
    public List<String> getGreetings() {
        return List.of("Hello World", "Hallo Welt", "Bonjour Monde");
    }
}
