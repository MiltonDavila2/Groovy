package org.example;

public abstract class Terrestre implements VehiculoInterface{

    public boolean prendido = false;
    public boolean movimiento = false;

    @Override
    public void detener() {

        if (movimiento){
            movimiento=false;
            System.out.println("Tu vehiculo se ha detenido");

        }else{
            System.out.println("Tu vehiculo no esta en movimiento, enciendelo o muevete");
        }


    }


    @Override
    public void arrancar() {

        if(movimiento){
            System.out.println("Tu vehiculo ya esta en movimiento");
        }

        else if (prendido){
            movimiento = true;
            System.out.println("Tu vehiculo arranco");
        }else{
            System.out.println("Necesita encender el vehiculo");
        }
    }

    @Override
    public void encender() {
        if (prendido){
            System.out.println("Tu vehiculo ya esta encendido");

        }else{


            prendido = true;
            System.out.println("Tu vehiculo se ha encendido");
        }

    }


    @Override
    public void apagar() {
        if(prendido){
            prendido = false;
            System.out.println("Tu vehiculo se ha apagado");

        }else{
            System.out.println("Tu vehiculo esta apagado");
        }
    }

    public abstract void parqueo();

    public abstract void retroceder();


    public abstract void pitar();
}
