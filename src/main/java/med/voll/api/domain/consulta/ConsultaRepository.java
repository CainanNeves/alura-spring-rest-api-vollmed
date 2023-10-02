package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
    Boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(Integer id, LocalDateTime data);

    Boolean existsByPacienteIdAndDataBetween(Integer id, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);
}
