package demo_msg;

import org.springframework.stereotype.Component;

@Component
public class Helloworld {
    public String welcomeMessage(){
        return "Hello World";
    }
}
