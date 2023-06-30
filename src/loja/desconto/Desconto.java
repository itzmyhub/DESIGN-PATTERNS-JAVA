package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if(deveAplicar(orcamento)) {
            return aplicarDesconto(orcamento);
        } else {
            return proximo.calcular(orcamento);
        }
    }

    protected abstract BigDecimal aplicarDesconto(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);
}
