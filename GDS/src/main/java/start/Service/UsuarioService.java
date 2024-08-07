package start.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import start.Repository.UsuarioRepository;
import start.Model.UsuarioModel;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> listarUsuario(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel criarUsuario (UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

}
