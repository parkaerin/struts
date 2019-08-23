package org.superbiz.struts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public FilterRegistrationBean filterDispatch() {
//        return buildFilterRegistration(2, new StrutsPrepareAndExecuteFilter(),
//                asList("/", "/addUserForm.action", "/addUser.action"
//                        , "/findUserForm.action", "/findUser.action", "/.action"));
//    }


}
