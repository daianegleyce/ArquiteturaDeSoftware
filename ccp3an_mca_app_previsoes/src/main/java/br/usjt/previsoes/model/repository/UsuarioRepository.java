package br.usjt.previsoes.model.repository;


import br.usjt.previsoes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findOneByLoginAndSenha(String login, String senha);
}
