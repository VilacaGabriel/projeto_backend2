package br.com.gabriel.SistemaGerenciamentoTarefas.repository;

import br.com.gabriel.SistemaGerenciamentoTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
