/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pilhainverter;

/**
 *
 * @author Anna
 */
import java.util.Stack;
public class InverteOrdem {
    
     String exemplo1;
     String exemplo2;
     String resultado1;
     String resultado2;
  
                
    public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" "); 
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();

      
            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }

            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }

            resultado.append(" ");
        }

        return resultado.toString().trim(); 
 }
}
    

