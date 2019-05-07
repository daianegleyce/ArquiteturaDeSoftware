package br.usjt.previsoes.service;

import br.usjt.previsoes.model.Usuario;
import br.usjt.previsoes.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UsuarioRepository usuarioRepo;
    public boolean logar(Usuario usuario){
        return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
    }
}
