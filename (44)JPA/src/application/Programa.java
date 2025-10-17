package application;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "João", "Joao@gmail.com");
        Pessoa p2 = new Pessoa(2, "Maria ", "<EMAIL>");
        Pessoa p3 = new Pessoa(3, "Pedro", "<EMAIL>");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
