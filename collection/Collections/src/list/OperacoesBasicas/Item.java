public class Item {
    String nome;
    double preco;
    int quantidade;


    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public double calcularTotal(){
        return preco * quantidade;
    }


    @Override
    public String toString() {
        return "Nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + " \n ";
    }





    
}
