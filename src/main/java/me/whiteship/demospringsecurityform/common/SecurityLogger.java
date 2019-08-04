package me.whiteship.demospringsecurityform.common;

import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityLogger {

    public static void log(String message) {
        System.out.println(message);
        Thread thread = Thread.currentThread();
        System.out.println("Thread: " + thread.getName());
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("Principal: " + principal);
    }

}
