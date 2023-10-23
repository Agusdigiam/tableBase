package table.practice.table.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import table.practice.table.Repository.IRepository;

@RestController
public class Controller {
    @Autowired
    private IRepository irepository;

    @GetMapping("/users")
    public
}
