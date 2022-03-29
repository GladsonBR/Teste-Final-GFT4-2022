package com.company.Dio;

import com.company.Dio.AplicarEmProdutos.Operacao;
import com.company.Dio.AplicarEmProdutos.Produto;
import com.company.Dio.Pagamento.CartaoBandeiraMaster;
import com.company.Dio.Pagamento.CartaoBnadeiraVisa;
import com.company.Dio.Pagamento.PagamentoCartao;
import com.company.Dio.Vetor.Vetor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite qual dos questoẽs à testar\n"+
                "1_Para Pagamento\n" +
                "2_Vetor\n"+
                "3_Aumentos e Descontos");
        Scanner ler = new Scanner(System.in);
        Scanner lerStr = new Scanner(System.in);
        int opt = ler.nextInt();

        switch (opt) {
            case 1:
                PagamentoCartao pagamentoMaster = new CartaoBandeiraMaster();
                PagamentoCartao pagamentoVisa = new CartaoBnadeiraVisa();
                String tipoPagamento;
                System.out.println("Qual a forma de pagamento? Crédito ou Débito?");
                tipoPagamento = lerStr.next();
                String bandeiraCartao;

                try {
                    if (tipoPagamento.equalsIgnoreCase("Credito")) {
                        System.out.println("Qual a bandeira do cartão? Visa ou Master?");
                        bandeiraCartao = lerStr.next();
                        if (bandeiraCartao.equalsIgnoreCase("Visa")) {
                            pagamentoVisa.pagamentoCredito();
                        } else if (bandeiraCartao.equalsIgnoreCase("Master")) {
                            pagamentoVisa.pagamentoCredito();
                        }
                    } else if (tipoPagamento.equalsIgnoreCase("Debito")) {
                        System.out.println("Qual a bandeira do cartão? Visa ou Master?");
                        bandeiraCartao = lerStr.next();
                        if (bandeiraCartao.equalsIgnoreCase("Visa")) {
                            pagamentoVisa.pagamentoCredito();
                        } else if (bandeiraCartao.equalsIgnoreCase("Master")) {
                            pagamentoMaster.pagamentoCredito();
                        }
                    } else {
                        System.out.println("Digite uma das opção");
                    }
                }catch (NullPointerException e){
                    System.out.println("Digite uma opção valida");
                }

                System.out.println();
            case 2:
                Vetor vetorSet = new Vetor();
                double vetorLer=0;
                String sair="";


                do {
                    System.out.println("Digite um valor para armazenar no vetor ou digite qualquer caracter para Sair" );
                    try{
                        vetorLer = ler.nextDouble();
                        vetorSet.getVetor().add(vetorLer);
                    }catch (InputMismatchException e){
                        break;
                    }catch (NullPointerException em){
                       break;
                    }


                }while(sair != ("sair"));
                for (Double vetores: vetorSet.getVetor()) {
                    System.out.println(vetores);
                }
            case 3:
                Produto produto = new Produto();
                Operacao operacao = null;

                String descricao;
                String oper ;
                double valorReal;
                double percentual;


                System.out.println("Digite a descrição do produto");
                descricao= lerStr.nextLine();
                produto.setDescricao(descricao);
                System.out.println("Digite o valor do produto");
                valorReal = ler.nextDouble();
                produto.setValorReal(valorReal);
                System.out.println("Digite operacao");
                oper = lerStr.nextLine();


                System.out.println("Digite o percentual da operaçao");
                percentual = ler.nextDouble();
                produto.setPercentual(percentual);


                 produto.operacaoMetodo(oper);

                break;

        }
    }
}



