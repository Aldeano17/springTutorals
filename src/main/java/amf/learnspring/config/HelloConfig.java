package amf.learnspring.config;

import amf.learnspring.services.HelloWorldFactory;
import amf.learnspring.services.HelloWorldService;
import amf.learnspring.services.HelloWorldServiceEnglishImpl;
import amf.learnspring.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

//  Beans Declaration on Java File \/

//  @Bean
//  @Profile({"english"})
//  @Primary
//  public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
//    return factory.createHelloWorldService("en");
//  }

//  @Bean
//  @Profile("spanish")
//  @Primary
//  public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
//    return factory.createHelloWorldService("es");
//  }

//  @Bean(name = "german")
//  public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
//    return factory.createHelloWorldService("de");
//  }
}
