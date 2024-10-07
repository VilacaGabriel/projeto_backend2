package br.com.gabriel.SistemaGerenciamentoTarefas.repository;

import br.com.gabriel.SistemaGerenciamentoTarefas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
