package ifto.projeto.space_management_system.model.entidades;


import ifto.projeto.space_management_system.model.enums.Situacao;
import ifto.projeto.space_management_system.model.enums.TipoEspaco;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EspacoFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nomeEspaco;

    @NotBlank(message = "A descrição é obrigatória")
    private String descricaoEspaco;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Escolha o tipo do espaço")
    private TipoEspaco tipoEspaco;

    @Min(value = 1, message = "A capacidade precisa ser pelo menos 1")
    private int capacidade;

    @NotBlank(message = "Escolha os recursos disponíveis")
    private String recursosDisponiveis;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltimaAtualizacao;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Defina a situação do espaço")
    private Situacao situacao;

    @NotBlank(message = "Defina a localização")
    private String localizacao;

    private String notasAdicionais;

    @PrePersist
    protected void onCreate() {
        this.dataCadastro = new Date();
        this.dataUltimaAtualizacao = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.dataUltimaAtualizacao = new Date();
    }

}
