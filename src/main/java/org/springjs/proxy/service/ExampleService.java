package org.springjs.proxy.service;

import org.springframework.stereotype.Service;
import org.springjs.proxy.entity.Hello;
import org.springjs.proxy.repository.ExampleRepository;

@Service
public class ExampleService {

  // Normally this won't be a repository, moreover a call to a backend service.
  private final ExampleRepository repository;

  public ExampleService(ExampleRepository repository) {
    this.repository = repository;
  }

  public Hello getHelloWorld() {
    return repository.loadHelloWorld();
  }
}
