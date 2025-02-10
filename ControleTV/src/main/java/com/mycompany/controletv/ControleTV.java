/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controletv;

public class ControleTV {
    private int canal;
    private int volume;

    public ControleTV() {
        canal = 1;
        volume = 10;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = Math.max(canal, 1);
        System.out.println(canal > 0 ? "" : "Canal inválido!");
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        volume += (volume < 100) ? 1 : 0;
        System.out.println(volume < 100 ? "" : "Volume máximo atingido!");
    }

    public void reduzirVolume() {
        volume -= (volume > 0) ? 1 : 0;
        System.out.println(volume > 0 ? "" : "Volume mínimo atingido!");
    }

    public static void main(String[] args) {
        ControleTV tv = new ControleTV();

        System.out.println("Canal inicial: " + tv.getCanal());
        System.out.println("Volume inicial: " + tv.getVolume());

        tv.setCanal(5);
        System.out.println("Novo canal: " + tv.getCanal());

        tv.aumentarVolume();
        System.out.println("Volume após aumentar: " + tv.getVolume());

        tv.reduzirVolume();
        tv.reduzirVolume();
        System.out.println("Volume após reduzir: " + tv.getVolume());

        tv.setCanal(-3);
    }
}
