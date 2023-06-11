package  ma.sir.cnss;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.sir.cnss.bean.core.*;
import ma.sir.cnss.service.facade.admin.*;

import ma.sir.cnss.zynerator.security.common.AuthoritiesConstants;
import ma.sir.cnss.zynerator.security.bean.User;
import ma.sir.cnss.zynerator.security.bean.Permission;
import ma.sir.cnss.zynerator.security.bean.Role;
import ma.sir.cnss.zynerator.security.service.facade.UserService;
import ma.sir.cnss.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.sir.cnss.required.facade")
public class CnssApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(CnssApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){



    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }




    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Employe.edit"));
        permissions.add(new Permission("Employe.list"));
        permissions.add(new Permission("Employe.view"));
        permissions.add(new Permission("Employe.add"));
        permissions.add(new Permission("Employe.delete"));
        permissions.add(new Permission("Societe.edit"));
        permissions.add(new Permission("Societe.list"));
        permissions.add(new Permission("Societe.view"));
        permissions.add(new Permission("Societe.add"));
        permissions.add(new Permission("Societe.delete"));
        permissions.add(new Permission("TaxIr.edit"));
        permissions.add(new Permission("TaxIr.list"));
        permissions.add(new Permission("TaxIr.view"));
        permissions.add(new Permission("TaxIr.add"));
        permissions.add(new Permission("TaxIr.delete"));
        permissions.add(new Permission("TaxIrEmploye.edit"));
        permissions.add(new Permission("TaxIrEmploye.list"));
        permissions.add(new Permission("TaxIrEmploye.view"));
        permissions.add(new Permission("TaxIrEmploye.add"));
        permissions.add(new Permission("TaxIrEmploye.delete"));
        permissions.add(new Permission("TauxIr.edit"));
        permissions.add(new Permission("TauxIr.list"));
        permissions.add(new Permission("TauxIr.view"));
        permissions.add(new Permission("TauxIr.add"));
        permissions.add(new Permission("TauxIr.delete"));
    }

}


