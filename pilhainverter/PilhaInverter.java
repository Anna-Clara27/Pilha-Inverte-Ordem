/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pilhainverter;

/**
 *
 * @author Anna
 */

// Implementar uma estrutura de Pilha em Java. O programa da pilha deve inverter a ordem das letras de 
// cada palavra de uma string ASCII, preservando a ordem das palavras (acentos podem ser desconsiderados). 
// Por exemplo, para a string  ESTE EXERCICIO E MUITO FACIL  o resultado deve ser  ETSE OICICREXE E OTIUM 
// LICAF.

// use os dois exemplos abaixo:

// 1) UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE

// 2) ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI 
// ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD  ODATSE ED .SAIOG

import javax.swing.JOptionPane;
public class PilhaInverter {

    public static void main(String[] args) {
       
        InverteOrdem pilha = new InverteOrdem();
        
        
        pilha.exemplo1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        pilha.exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

    
       pilha.resultado1 = InverteOrdem.inverterPalavras(pilha.exemplo1);
       pilha.resultado2 = InverteOrdem.inverterPalavras(pilha.exemplo2);

        
       JOptionPane.showMessageDialog(null,"Exemplo 1:\nOriginal: " + pilha.exemplo1 + "\nInvertido: " + pilha.resultado1);
       JOptionPane.showMessageDialog(null,"\nExemplo 2:\nOriginal: " + pilha.exemplo2 + "\nInvertido: " + pilha.resultado2);
    }
}

   