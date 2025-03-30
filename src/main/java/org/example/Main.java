package org.example;

import org.example.expections.ParametrosInvalidosException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O primeiro numero é maior que o segundo");
        }



    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro numero é maior que o segundo");
        }
        else{

            int contagem = parametroDois - parametroUm;

            for(int i = 1; i <= contagem; i++){

                System.out.println("Gerando Numero : " + i);

            }

        }


    }


}