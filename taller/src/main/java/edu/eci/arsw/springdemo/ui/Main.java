/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.springdemo.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.eci.arsw.springdemo.GrammarChecker;

public class Main {
    public static void main(String[] args) {
        // Cargamos el contexto de Spring desde applicationContext.xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Obtenemos el bean GrammarChecker ya construido por Spring
        GrammarChecker gc = ac.getBean(GrammarChecker.class);

        // Probamos el método
        System.out.println(gc.check("la la la"));
    }
}

