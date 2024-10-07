package br.com.gabriel.SistemaGerenciamentoTarefas.service;

import br.com.gabriel.SistemaGerenciamentoTarefas.model.Usuario;
import br.com.gabriel.SistemaGerenciamentoTarefas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public Usuario cadastrarUsuario(Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        return usuarioRepository.save(usuario);
    }

    public String autenticarUsuario(String email, String senha) {
        // Implementar lógica de autenticação com JWT aqui
        return "Token JWT"; // Placeholder
    }
}
