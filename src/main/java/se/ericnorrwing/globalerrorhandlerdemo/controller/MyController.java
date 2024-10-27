package se.ericnorrwing.globalerrorhandlerdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.ericnorrwing.globalerrorhandlerdemo.exception.UserCouldntReadException;
import se.ericnorrwing.globalerrorhandlerdemo.exception.MyException;

@RestController
public class MyController {

    //New Version
    @GetMapping("/derp")
    public ResponseEntity<String> hello (@RequestParam int value) {
        if (value == 1) throw new MyException("Look at me im an exception haha");
        if (value == 2) throw new UserCouldntReadException("customer couldnt read");
        return ResponseEntity.ok("You did it!");
    }

    //OLD VERSION
    @GetMapping("/hurr")
    public ResponseEntity<String> goodbye(@RequestParam int value) throws MyException{
        try {
            return ResponseEntity.status(400).body("You did not fail to read");
        } catch (MyException e ) {
            throw new MyException("LMAO");
        }
    }
}
