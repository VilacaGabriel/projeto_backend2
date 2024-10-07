package br.com.gabriel.SistemaGerenciamentoTarefas.controller;

import br.com.gabriel.SistemaGerenciamentoTarefas.model.Usuario;
import br.com.gabriel.SistemaGerenciamentoTarefas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.cadastrarUsuario(usuario);
        return ResponseEntity.ok(novoUsuario);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        String token = usuarioService.autenticarUsuario(usuario.getEmail(), usuario.getSenha());
        return ResponseEntity.ok(token);
    }
}
