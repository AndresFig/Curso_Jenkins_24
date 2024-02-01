package com.mycompany.app;
/**
 * Hello world!
 * Se modifica para que este retorne saldos X
 */
public class App
{


    private final String message = "";

    public App() {}

    public static void main(String[] args) {

        System.out.println(new App().generarCuerpo());

    }

    private final String generarCuerpo() {
        String cuerpo = "";
        cuerpo = "{\n" +
                "  \"descripcion\":\"Envio de saldos usuario 1\",\n" +
                "  \"nombre\":\"Carlos Javier Estrada Sanchez\",\n" +
                "  \"clave\":\"568\",\n" +
                "  \"saldoRetiroAhorro97\":\"9846243.90\",\n" +
                "  \"saldoVivienda\":\"893263.90\",\n" +
                "  \"saldoAhorro92\":\"735293.08\",\n" +
                "  \"saldoCensativayVejes\":\"17258392.09\"\n" +
                "}";

        return cuerpo;
    }
}
