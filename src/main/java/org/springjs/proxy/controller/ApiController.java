package org.springjs.proxy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springjs.proxy.service.ExampleService;

@RestController
@RequestMapping("/api/")
public class ApiController {

  private final ExampleService service;

  public ApiController(ExampleService service) {
    this.service = service;
  }

  @GetMapping(path = "/hello")
  public ResponseEntity<?> helloWorld() {
    return ResponseEntity.ok(service.getHelloWorld());
  }
}
