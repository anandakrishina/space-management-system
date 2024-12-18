package ifto.projeto.space_management_system.Service;


import ifto.projeto.space_management_system.model.entidades.EspacoFisico;
import ifto.projeto.space_management_system.repository.EspacoFisicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspacoFisicoService {
    @Autowired
    private EspacoFisicoRepository espacoFisicoRepository;

    public EspacoFisico listarEspacoFisico(EspacoFisico espacoFisico){
        return (EspacoFisico) espacoFisicoRepository.findAll();
    }
    public EspacoFisico cadastrarEspacoFisico(EspacoFisico espacoFisico) {
        return espacoFisicoRepository.save(espacoFisico);
    }

    public EspacoFisico editarEspacoFisico(EspacoFisico espacoFisico) {
        if (espacoFisico.getId() == null) {
            throw new IllegalArgumentException("Não é possível editar um espaço que não possui ID.");
        }
        if (!espacoFisicoRepository.existsById(espacoFisico.getId())) {
            throw new IllegalArgumentException("Espaço não encontrado para edição.");
        }
        return espacoFisicoRepository.save(espacoFisico);
    }
}
