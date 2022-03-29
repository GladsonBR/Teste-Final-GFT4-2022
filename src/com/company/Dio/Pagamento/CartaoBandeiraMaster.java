package com.company.Dio.Pagamento;

public class CartaoBandeiraMaster implements PagamentoCartao{
    private String pagoMaster ="Pago com master";

    @Override
    public void pagamentoDebito() {
        System.out.println("Débito");
        System.out.println(pagoMaster);
    }

    @Override
    public void pagamentoCredito() {
        System.out.println("Crédito");
        System.out.println(pagoMaster);
    }
}
