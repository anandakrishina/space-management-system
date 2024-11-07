package ifto.projeto.space_management_system.controller;

import ifto.projeto.space_management_system.model.Pessoa;
import ifto.projeto.space_management_system.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/helloworld")
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/save")
    public String saveName() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ananda");
        pessoaRepository.save(pessoa);
        return "Nome salvo com sucesso: " + pessoa.getNome();
    }

    @GetMapping("/all")
    public List<Pessoa> getAllNames() {
        return pessoaRepository.findAll();
    }
}
