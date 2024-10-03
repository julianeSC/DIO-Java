package list.ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa{

    // Atriuto

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(List<Pessoa> pessoaList) {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() { // COMPARABLE
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(null);

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.89);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 24, 1.60);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.68);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 28, 1.58);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 23, 1.73);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
