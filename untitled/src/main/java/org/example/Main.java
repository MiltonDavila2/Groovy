package org.example;
import groovy.lang.GroovyClassLoader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();

        try{
            Class<?> motoClass = groovyClassLoader.parseClass(new File("src/main/resources/Moto.groovy"));

            Object motoInstance = motoClass.getDeclaredConstructor(String.class).newInstance("38382");

            motoClass.getMethod("mostrarMatricula").invoke(motoInstance);
            motoClass.getMethod("parqueo").invoke(motoInstance);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}