package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaMaisDeCincoItens(new DescontoParaValorSuperiorAMilReais(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
