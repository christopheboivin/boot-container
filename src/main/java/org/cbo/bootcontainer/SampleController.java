package org.cbo.bootcontainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class SampleController {

    @GetMapping
    public String test() {
        return "Hello World!";
    }
}
