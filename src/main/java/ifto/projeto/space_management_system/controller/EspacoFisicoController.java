package ifto.projeto.space_management_system.controller;

import ifto.projeto.space_management_system.Service.EspacoFisicoService;
import ifto.projeto.space_management_system.model.entidades.EspacoFisico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/espacos")
public class EspacoFisicoController {

    @Autowired
    private EspacoFisicoService espacoFisicoService;



    @PostMapping
    public ResponseEntity<EspacoFisico> cadastrarEspacoFisico(@RequestBody EspacoFisico espacoFisico){
        return ResponseEntity.ok(espacoFisicoService.cadastrarEspacoFisico(espacoFisico));
    }

    @PatchMapping("espacos/{id}")
    public ResponseEntity<EspacoFisico> editarEspacoFisico(@RequestBody EspacoFisico espacoFisico){
        return ResponseEntity.ok(espacoFisicoService.editarEspacoFisico(espacoFisico));
    }


}
