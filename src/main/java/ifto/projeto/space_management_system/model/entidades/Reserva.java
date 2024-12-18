package ifto.projeto.space_management_system.model.entidades;


import ifto.projeto.space_management_system.model.enums.SituacaoReserva;
import ifto.projeto.space_management_system.model.enums.TipoEvento;
import ifto.projeto.space_management_system.model.enums.Turno;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Digite o nome do evento")
    private String nomeEvento;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Defina o tipo do evento")
    private TipoEvento tipoEvento;

    @NotBlank (message = "Digite o nome do responsável pela reserva")
    private String responsavel;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastroReserva;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltimaAtualizacaoReserva;

    @Temporal(TemporalType.DATE)
    private Date periodoReserva;

    @Enumerated(EnumType.STRING)
    @NotNull (message = "Defina o turno do evento")
    private Turno turno;

    @NotNull(message = "Defina o horário de início")
    private LocalTime horarioInicio;

    @NotNull(message = "Defina o horário de término")
    private LocalTime horarioTermino;

    @Min(value = 1, message = "Precisa ser pelo menos 1")
    private int totalParticipantes;

    @Enumerated(EnumType.STRING)
    @NotNull (message = "Defina a situação da reserva")
    private SituacaoReserva situacao;

    @PrePersist
    protected void onCreate() {
        this.dataCadastroReserva = new Date();
        this.dataUltimaAtualizacaoReserva = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.dataUltimaAtualizacaoReserva = new Date();
    }

}
