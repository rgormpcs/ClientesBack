package com.ors.pichincha.back;

import com.ors.pichincha.back.entity.Menu;
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

    @Override
    public void run(String... args) throws Exception {
            saveMenu();
            System.out.println("****paso save");
 
    }

}
