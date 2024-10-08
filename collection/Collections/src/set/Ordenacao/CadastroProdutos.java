package set.Ordenacao;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(Set<Produto> produtoSet) {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(produtoSet);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        
        CadastroProdutos cadastroProdutos = new CadastroProdutos(null);

        cadastroProdutos.adicionarProduto(12345, "Arroz", 4.9, 2);
        cadastroProdutos.adicionarProduto(12345, "Açucar", 4.45, 3);
        cadastroProdutos.adicionarProduto(123457, "Feijao", 5.9, 1);
        cadastroProdutos.adicionarProduto(123458, "massa", 3.9, 1);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println("Preços: " +cadastroProdutos.exibirPorPreco());

    }

}
