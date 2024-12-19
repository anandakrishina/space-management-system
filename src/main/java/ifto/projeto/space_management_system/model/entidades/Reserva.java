package ifto.projeto.space_management_system.model.entidades;


import ifto.projeto.space_management_system.model.enums.SituacaoReserva;
import ifto.projeto.space_management_system.model.enums.TipoEvento;
import ifto.projeto.space_management_system.model.enums.Turno;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
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

    private LocalDateTime dataCadastroReserva;

    private LocalDateTime dataUltimaAtualizacaoReserva;

    private LocalDate periodoReserva;

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
        this.dataCadastroReserva = LocalDateTime.now();
        this.dataUltimaAtualizacaoReserva = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.dataUltimaAtualizacaoReserva = LocalDateTime.now();
    }
}
