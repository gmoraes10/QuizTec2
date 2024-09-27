/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author 08175
 */
public class Util {
    public static void main(String[] args) {
        String mensagem = "";
        int idade = 21;
        mensagem = idade >=18? "pode tirar a cnh":"chama um uber";
        JOptionPane.showConfirmDialog(null, mensagem);
    }
    
}
