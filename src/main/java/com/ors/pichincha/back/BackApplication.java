package com.ors.pichincha.back;

import com.ors.pichincha.back.entity.Account;
import com.ors.pichincha.back.entity.Client;
import com.ors.pichincha.back.entity.Menu;
import com.ors.pichincha.back.service.AccountService;
import com.ors.pichincha.back.service.ClientService;
import com.ors.pichincha.back.service.MenuService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackApplication implements CommandLineRunner {

    @Autowired
    MenuService menuService;
    @Autowired
    ClientService clientService;
    @Autowired
    AccountService accountService;

    public static void main(String[] args) {
        SpringApplication.run(BackApplication.class, args);
    }

    private void saveMenu() {
        Menu menu = new Menu(1, "Clientes", "/clientes");
        Menu menu2 = new Menu(2, "Cuentas", "/cuentas");
        Menu menu3 = new Menu(3, "Movimientos", "/movimiento");
        Menu menu4 = new Menu(4, "Reportes", "/reportes");

        List<Menu> productLis = Arrays.asList(menu, menu2, menu3, menu4);
        productLis.stream().forEach(menuService::save);
    }
    private void saveAccount(){
        Account account= new Account(1L,12356,"Ahorros",100.00,true,new Client(5L,"123","activo",null,5L,"Ricardo Ortiz","M",33,1722451383,"carapungo","0999999999"));
     
 
         accountService.save(account);
    }
    private void saveClient(){
        Client client=new Client(null,"123","activo",null,null,"Camila Ortiz","M",33,1722451383,"carapungo","0999999999");
        Client client2=new Client(null,"123","activo",null,null,"Ricardo Ortiz","M",33,1722451383,"carapungo","0999999999");
        List<Client> productLis = Arrays.asList(client, client2);
        productLis.stream().forEach(clientService::save);
    }

    @Override
    public void run(String... args) throws Exception {
            saveMenu();
            saveClient();
            saveAccount();
            System.out.println("****paso save");
 
    }

}
