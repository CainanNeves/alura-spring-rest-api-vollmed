package med.voll.api.domain.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Integer idMedico,

        @NotNull
        Integer idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade
) {
}
