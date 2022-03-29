package com.company.Dio.Pagamento;

public class CartaoBnadeiraVisa implements PagamentoCartao{
    private String pagoVisa = "Pago com visa";
    @Override
    public void pagamentoDebito() {
        System.out.println("Débito");
        System.out.println(pagoVisa);
    }

    @Override
    public void pagamentoCredito() {
        System.out.println("Crédito");
        System.out.println(pagoVisa);
    }
}
