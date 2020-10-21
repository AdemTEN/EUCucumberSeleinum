package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
       Driver.get().manage().window().maximize();
       Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        //Driver.closeDriver();


    }
    @Before("@db")
    public void setUpdb(){
        System.out.println("\tconnecting to database...");
    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tdisconnecting to database...");

    }



}