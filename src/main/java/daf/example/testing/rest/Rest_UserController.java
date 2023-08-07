package daf.example.testing.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Rest_UserController {

    @GetMapping("/users")
    public ResponseEntity<Object> getUsers() {
        HashMap<String, String> hMap = new HashMap<>();
        return new ResponseEntity<Object>(hMap, HttpStatus.OK);
    }
}
