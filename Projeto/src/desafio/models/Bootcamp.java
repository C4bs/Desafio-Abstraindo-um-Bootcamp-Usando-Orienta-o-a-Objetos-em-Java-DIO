package desafio.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Conteudo> conteudos = new HashSet<>();

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Set<Conteudo> getConteudos() { return conteudos; }

    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
}
