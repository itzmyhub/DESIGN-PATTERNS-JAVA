package loja.pedido.acao;

import loja.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar no bancod de dados!");
    }
}
