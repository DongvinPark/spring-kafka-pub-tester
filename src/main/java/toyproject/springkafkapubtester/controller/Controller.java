package toyproject.springkafkapubtester.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import toyproject.springkafkapubtester.service.Service;

@RestController
@RequiredArgsConstructor
public class Controller {

  private final Service service;

  @PostMapping("/pub/{studentId}")
  public void pub(@PathVariable String studentId) {
    service.sendMessage(studentId);
  }

}
