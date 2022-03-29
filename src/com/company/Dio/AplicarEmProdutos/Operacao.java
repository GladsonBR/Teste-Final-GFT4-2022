package com.company.Dio.AplicarEmProdutos;

public enum Operacao {
    DESCONTO("DESCONTO"), ACRESCIMO("ACRESCIMO");

    public String getOperacao() {
        return operacao;
    }

    public String setOperacao(String operacao) {
        this.operacao = operacao;
        return operacao;
    }

    private String operacao;
    Operacao(String operacao){
        this.operacao = operacao;
    }
}