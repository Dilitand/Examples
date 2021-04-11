import config.MyConfig;
import dao.Dao;
import models.Account;
import models.Accountop;
import models.Personx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(MyConfig.class);
        Dao springIpl = context.getBean("daospring", Dao.class);
        List list = springIpl.getListFromQuery("FROM Personx");
        System.out.println(list);
    }

    public static Personx makePersonx(){
        Personx person = new Personx("dimas");
        Account account = new Account("1000");
        Accountop accountop = new Accountop(1000.12D, new Date());
        account.addAccountOp(accountop);
        person.addAcc(account);
        return person;
    }
}
