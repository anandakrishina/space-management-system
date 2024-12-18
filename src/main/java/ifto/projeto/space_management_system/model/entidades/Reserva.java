package ifto.projeto.space_management_system.model.entidades;


import ifto.projeto.space_management_system.model.enums.Situacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEvento;
    private TipoEvento tipoEvento;
    private String responsavel;
    private Date dataReserva;
    private Turno periodo;
    private String horarioInicio;
    private String horarioTermino;
    private int totalParticipantes;
    private SituacaoReserva situacao;
}
