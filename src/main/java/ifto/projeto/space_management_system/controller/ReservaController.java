package ifto.projeto.space_management_system.controller;

import ifto.projeto.space_management_system.model.entidades.RequestReservaDTO;
import ifto.projeto.space_management_system.model.entidades.Reserva;
import ifto.projeto.space_management_system.repository.ReservaRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    private ReservaRepository reservaRepository;
    @GetMapping
    public ResponseEntity mostrarTodasReservas(){
        var allProducts = reservaRepository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity marcarReserva(@RequestBody @Valid RequestReservaDTO dados){
        Reserva novaReserva = new Reserva(dados);
        reservaRepository.save(novaReserva);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateReserva(@RequestBody @Valid RequestReservaDTO dados){
        Optional<Reserva> reservaOptional = reservaRepository.findById(dados.id());
        if(reservaOptional.isPresent()){
             Reserva reserva = reservaOptional.get();
            reserva.setNomeEvento(dados.nomeEvento());
            reserva.setTipoEvento(dados.tipoEvento());
            reserva.setResponsavel(dados.responsavel());
            reserva.setPeriodoReserva(dados.periodoReserva());
            reserva.setTurno(dados.turno());
            reserva.setHorarioInicio(dados.horarioInicio());
            reserva.setHorarioTermino(dados.horarioTermino());
            reserva.setTotalParticipantes(dados.totalParticipantes());
            reserva.setSituacao(dados.situacao());
            return ResponseEntity.ok(reserva);
        } else {
            throw new EntityNotFoundException();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluirReserva(@PathVariable Long id){
        reservaRepository.deleteById(id);
    }
}
