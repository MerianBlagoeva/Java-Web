package com.meri;

import com.meri.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.meri");

        UserService userService = context.getBean(UserService.class);

        System.out.println(userService.findYoungestUser().orElseThrow());


    }
}
