package ifto.projeto.space_management_system.model.entidades;

import ifto.projeto.space_management_system.model.enums.SituacaoReserva;
import ifto.projeto.space_management_system.model.enums.TipoEvento;
import ifto.projeto.space_management_system.model.enums.Turno;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public record RequestReservaDTO(

        Long id,

        @NotBlank(message = "O nome do evento é obrigatório")
        String nomeEvento,

        @NotNull(message = "O tipo do evento é obrigatório")
        TipoEvento tipoEvento,

        @NotBlank(message = "O responsável pela reserva é obrigatório")
        String responsavel,

        @NotNull(message = "A data do período da reserva é obrigatória")
        LocalDate periodoReserva,

        @NotNull(message = "O turno é obrigatório")
        Turno turno,

        @NotNull(message = "O horário de início é obrigatório")
        LocalTime horarioInicio,

        @NotNull(message = "O horário de término é obrigatório")
        LocalTime horarioTermino,

        @Min(value = 1, message = "O número de participantes deve ser pelo menos 1")
        int totalParticipantes,

        @NotNull(message = "A situação da reserva é obrigatória")
        SituacaoReserva situacao
) {}
