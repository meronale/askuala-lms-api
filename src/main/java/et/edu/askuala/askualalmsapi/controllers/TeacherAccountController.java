package et.edu.askuala.askualalmsapi.controllers;




import et.edu.askuala.askualalmsapi.domains.TeacherAccount;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherAccountController {

    //    @Autowired
//    private AccountService accountService;
//
    @PostMapping("/api/account/create")
    public void createTeacherAccount(@RequestBody TeacherAccount account) {
//        return accountService.createAccount(account);
//
//
//    }
//    @GetMapping("/api/account/list")
//    public Iterable<Account> listAccounts(){
//        return  accountService.allAccounts();
//
//
//    }
    }
}