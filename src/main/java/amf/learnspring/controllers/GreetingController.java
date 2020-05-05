package amf.learnspring.controllers;

import amf.learnspring.services.HelloWorldService;
import amf.learnspring.services.HelloWorldServiceGermanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


//properties can be declare on Java file or xml
public class GreetingController {

  private HelloWorldService helloWorldService;

  private HelloWorldService helloWorldServiceGerman;

//  @Autowired
  public void setHelloWorldService(HelloWorldService helloWorldService) {
    this.helloWorldService = helloWorldService;
  }

//  @Autowired
//  @Qualifier("helloWorldServiceGerman")
  public void setHelloWorldServiceGerman (HelloWorldService helloWorldServiceGerman) {
    this.helloWorldServiceGerman = helloWorldServiceGerman;
  }

  public String sayHello() {
    String greeting = helloWorldService.getGreeting();

    System.out.println(greeting);
    System.out.println(helloWorldServiceGerman.getGreeting());

    return greeting;
  }
}
