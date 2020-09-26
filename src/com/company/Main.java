package com.company;

import java.util.Scanner;

public class Main {

    public static boolean VerificaValidez(String palavra) {
        System.out.println(palavra);

        Pilha oPilha = new Pilha();

        char[] letras = palavra.toCharArray();
        for (Character letra : letras) {

            if (letra == '(' || letra == '{' || letra == '[' || letra == '<') {

                oPilha.empilhar(letra);
            } else if (letra == ')' || letra == ']' || letra == '}' || letra == '>') {

                try {

                    char comparaSimbolo = oPilha.desempilhar();

                    if (letra == ')' && comparaSimbolo == '(') {
                        continue;
                    } else if (letra == '}' && comparaSimbolo == '{') {
                        continue;
                    } else if (letra == ']' && comparaSimbolo == '[') {
                        continue;
                    } else if (letra == '>' && comparaSimbolo == '<') {
                        continue;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }

        public static void main (String[]args){

           // é possível testar o código com as inputs já setadas e  então você pode escrever os
           //alfabetos de linguaguem que desejar.

           String[] inputs = {"(((((([]))))))","{{[[()]()]}}","{[[([)]]]}","<{(())}>","{<[]()[[]]<>>}","[(]){}"};

            for (String palavra : inputs) {

                System.out.println(VerificaValidez(palavra)?"valido":"invalido");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva aqui os alfabetos de linguagem. Ex: <{[( )]}>");
            String phrase = scanner.nextLine();
            String[] userInputs = { phrase } ;

            for (String palavra : userInputs) {

                System.out.println(VerificaValidez(palavra)?"valido":"invalido");
            }
        }
    }