 package com.company;
 import java.util.*;
 import  java.io.*;

public class Pilha {
private List <Character>dados;
    public  Pilha (){

        this.dados = new ArrayList<Character>();

    }
    public void empilhar(Character dadoEmpilha){

        this.dados.add(dadoEmpilha);

    }
    public Character desempilhar( ) throws Exception {

        if(this.dados.isEmpty()) {

            throw new Exception("A pilha está vazia");
        }
       return this.dados.remove(this.dados.size() -1);
    }
}
