package dw.com.projectmanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MEMBRO")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idpessoa", referencedColumnName = "id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "idprojeto", referencedColumnName = "id")
    private Project project;

}
