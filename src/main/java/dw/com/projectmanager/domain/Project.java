package dw.com.projectmanager.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROJETO")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "data_inicio")
    private LocalDate initialDate;

    @Column(name = "data_previsao_fim")
    private LocalDate expectedEndDate;

    @Column(name = "data_fim")
    private LocalDate endDate;

    @Column(name = "descricao")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "orcamento")
    private BigDecimal orcamento;

    @Column(name = "risco")
    private String risco;

    @ManyToOne
    @JoinColumn(name = "idgerente", nullable = false)
    private Person person;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Member> members;


}
