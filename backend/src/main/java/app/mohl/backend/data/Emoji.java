package app.mohl.backend.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="emoji")
public class Emoji {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String slug;

    private String character;

    @Column(name = "unicode_name")
    private String unicodeName;

    @Column(name = "code_point")
    private String codePoint;

    private String group;

    @Column(name = "sub_group")
    private String subGroup;
}