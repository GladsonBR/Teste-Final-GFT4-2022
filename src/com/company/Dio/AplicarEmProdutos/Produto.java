package com.company.Dio.AplicarEmProdutos;

public class Produto {
    private String descricao;
    private double valorReal;
    private String operacao;
    private double percentual;
    private double valorFinal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }



    public void operacaoMetodo(String operacao) {
        if (operacao.equalsIgnoreCase("desconto")) {
            valorFinal = valorReal - (valorReal * (percentual / 100));
            System.out.println("O produto " + this.descricao + " apresenta o valor de " + valorFinal + " Aplicado o" + this.operacao);
        } else if (operacao.equalsIgnoreCase("acrescimo")) {
            valorFinal = valorReal + (valorReal * (percentual / 100));
            System.out.println("O produto " + this.descricao + " apresenta o valor de " + valorFinal + "Aplicado o" + this.operacao);
        }
    }



    public Produto() {
    }
}


