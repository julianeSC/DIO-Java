package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhodecompras;

    public CarrinhoDeCompras() {
        this.carrinhodecompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {

        carrinhodecompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhodecompras.isEmpty()) {
            for (Item i : carrinhodecompras) {

                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);

                }
            }
        } else {
            System.out.println("Carrinho de compras vazio");
        }
        carrinhodecompras.removeAll(itensParaRemover);

    }

    public double calcularValorTotal() {

        double total = 0;
        if (!carrinhodecompras.isEmpty()) {

            for (Item i : carrinhodecompras) {
                total += i.calcularTotal();

            }

        }

        return total;

    }

    public void exibirItens() {
        if (!carrinhodecompras.isEmpty()) {
            System.out.println("itens :  " + carrinhodecompras);
        }else{
            System.out.println("O carrinho está vazio " );
        }
        
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();
        carrinho.adicionarItem("Feijao", 2.90, 2);
        carrinho.adicionarItem("arroz", 3.90, 1);
        carrinho.adicionarItem("Feijao", 2.90, 2);
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho:  " + carrinho.calcularValorTotal());
        carrinho.removerItem("arroz");
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho:  " + carrinho.calcularValorTotal());
    }

}
