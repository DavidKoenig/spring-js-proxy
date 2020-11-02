package org.springjs.proxy.repository;

import org.springframework.stereotype.Repository;
import org.springjs.proxy.entity.Hello;

@Repository
public class ExampleRepository {

  public Hello loadHelloWorld() {
    return new Hello("Hello World");
  }
}
