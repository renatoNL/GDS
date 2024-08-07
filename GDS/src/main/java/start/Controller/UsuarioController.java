package start.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import start.Model.UsuarioModel;
import start.Service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioModel> listarUsuario (){
        return usuarioService.listarUsuario();
    }
    @PostMapping
    public UsuarioModel CriarUsuario(@RequestBody UsuarioModel usario){
        return usuarioService.criarUsuario(usario);
    }

}
