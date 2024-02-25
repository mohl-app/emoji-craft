package app.mohl.backend.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="combination")
public class Combination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "first", referencedColumnName = "id")
    private Emoji first;

    @ManyToOne
    @JoinColumn(name = "second", referencedColumnName = "id")
    private Emoji second;

    @ManyToOne
    @JoinColumn(name = "result", referencedColumnName = "id")
    private Emoji result;

}