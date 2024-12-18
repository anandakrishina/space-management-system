package ifto.projeto.space_management_system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @GetMapping
    public ResponseEntity mostrarTodasReservas(){
        return ResponseEntity.ok("Ok");
    }
}
