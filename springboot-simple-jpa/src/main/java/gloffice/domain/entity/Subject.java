package gloffice.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "subect")
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String subjectName;
    private String subjectDescription;
    private int unitCounts;

}
