package table.practice.table.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Test {
    @GetMapping("/testing")
    List<String> test(){
        return List.of("Working on Server Port: 5.000");
    }
}
