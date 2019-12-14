/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.kisoft.chat.run;

import java.util.Date;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author tareq
 */
@WebListener
public class Initialization implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println(new Date().toString() + " : Application Launched");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.err.println(new Date().toString() + " : Application Shutdown");
  }

}
