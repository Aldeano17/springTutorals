package amf.learnspring.services;

import org.springframework.stereotype.Component;
//import sun.jvm.hotspot.HelloWorld;

@Component
public class HelloWorldServiceEnglishImpl implements HelloWorldService {

  @Override
  public String getGreeting() {
    return "Hello World";
  }
}
