package loja.desconto;

import com.sun.org.apache.xpath.internal.operations.Or;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaValorSuperiorAMilReais extends Desconto {

    public DescontoParaValorSuperiorAMilReais(Desconto proximo) {
        super(proximo);
    }
    public BigDecimal aplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }

    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("1000.0")) > 0;
    }
}
