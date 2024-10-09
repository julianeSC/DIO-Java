package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    // atributo

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(Map<Long, Produto> estoqueProdutoMap) {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p ;
                }
            }
        }
        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p ;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
          for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }

      public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto(null);
        estoque.adicionarProduto(1, "Prod A", 2, 3.8);
        estoque.adicionarProduto(2, "Prod B", 4, 6);
        estoque.adicionarProduto(3, "Prod C", 6, 4.56);
        estoque.adicionarProduto(4, "Prod D", 3, 10.3);

        estoque.exibirProdutos();

        System.out.println("Valor total: " +estoque.calcularValorTotalEstoque());
        System.out.println("Mais caro: " +estoque.obterProdutoMaisCaro());
        System.out.println("Mais barato: " +estoque.obterProdutoMaisBarato());
        System.out.println("Mais quantidade: " +estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

      }


}
