package com.tjoeun.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping("/main")
  public String main() {
  	return "main";
  }
  @GetMapping("/login")
  public String login() {
  	return "login";
  }
  @GetMapping("/register")
  public String register() {
  	return "register";
  }
  @GetMapping("/logout")
  public String logout() {
  	return "logout";
  }
}
