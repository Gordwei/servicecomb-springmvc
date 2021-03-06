package com.service.springmvc;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class SpringmvcApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringmvcApplication.class, args);
  }
}
