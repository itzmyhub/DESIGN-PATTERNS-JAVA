package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class AntesDosPatterns {

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("1000.0")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.2"));
        }

        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
