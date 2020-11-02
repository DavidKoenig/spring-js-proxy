package org.springjs.proxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UiController {

  @RequestMapping({"/"})
  public String loadUI() {
    return "forward:/index.html";
  }
}
