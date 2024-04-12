package org.example;

import javax.swing.*;

class Objeto {
    private int ucp;
    private int criacao;


    public Objeto(int ucp, int criacao) {
        this.ucp = ucp;
        this.criacao = criacao;
    }


    public int getucp() {
        return ucp;
    }

    public int getCriacao() {
        return criacao;
    }
}

public class Main {
    public static void main(String[] args) {
        int iniciar = JOptionPane.showOptionDialog(
                null,
                "ESCALONADOR FIFO / SJF",
                "Bem Vindo!",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Iniciar"},
                "Iniciar"
        );


        if (iniciar == 0) {
           int numeroProcessos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de processos?"));
           while (numeroProcessos <= 1 ){
               JOptionPane.showMessageDialog(null, "O numero de processos deve ser maior que: 1");
               numeroProcessos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de processos?"));
           }
            Objeto[] arrayDeObjetos = new Objeto[numeroProcessos];
            for(int i = 0; i<numeroProcessos; i++){
                int ucp = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de UCP"));
                int criacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de criacao"));
                arrayDeObjetos[i] = new Objeto(ucp, criacao);
            }

            JOptionPane.showMessageDialog(null, "      0  1  2  3  4" + "\n" +
                    "P1 ===" + "\n" +
                    "P2             ===");
            for (Objeto objeto : arrayDeObjetos) {
                System.out.println("ucp: " + objeto.getucp() + ", criacao: " + objeto.getCriacao());
            }

        }
    }
}