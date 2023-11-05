package CVDS.Dina.proyecto.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "CLIENTE")
public class Cliente {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;

    @Column(name = "FIRSTNAME")
    private int firstName;

    @Column(name = "LASTNAME")
    private int lastName;

    

}
