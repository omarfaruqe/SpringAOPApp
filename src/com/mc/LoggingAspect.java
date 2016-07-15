/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author faruqe
 */
@Aspect
public class LoggingAspect {
//    @Before("execution(public String getName())") for any class
//    @Before("execution(public String com.mc.Triangle.getName())")    for Triangle Class only
//    @Before("execution(public String springaopapp.*.getName())")       for any class in this package 
//    @Before("execution(public * get*())") // Wild card 
//    @Before("execution(* get*())") // Wild card for no arguments
//    @Before("execution(* get*(*))") // Wild card for 1 or more arguments
//    @Before("execution(* get*(..))") // Wild card for 0 or more arguments

    @Before("execution(public String com.mc.*.getName(..))")
    public void LoggingAdvice(){
        System.out.println("Advice run. Get Method called");
    }
        
}
