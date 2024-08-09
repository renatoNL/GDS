package start.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import start.Repository.PrevidenciaRepository;

@RestController
@RequestMapping("/previdencia")
public class PrevidenciaController {

    @Autowired
    PrevidenciaRepository previdenciaRepository;

    // na aula a mina sugeriu e usou o recurso do java "record" para implementar os
    // get, delet e etc... //

}