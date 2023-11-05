package CVDS.Dina.proyecto.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    private Long id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column( name = "COMIDAPREFERIDA1")
    private String comidaPreferidaUno;

    @Column( name = "COMIDAPREFERIDA2" )
    private String comidaPreferidaDos; 

    @Column( name = "COMIDAPREFERIDA3" )
    private String comidaPreferidaTres;

    @Column (name = "FUTURASCOMIDAS")
    private String futurasComidas;
    
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name="ALERGIAS", joinColumns= @JoinColumn(name = "personaId"))
    @Column(name = "Alergia", nullable = false)
    private List<String> alergias;

    
    


    public Cliente(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getComidaPreferidaUno() {
        return this.comidaPreferidaUno;
    }

    public void setComidaPreferidaUno(String comidaPreferidaUno) {
        this.comidaPreferidaUno = comidaPreferidaUno;
    }

    public String getComidaPreferidaDos() {
        return this.comidaPreferidaDos;
    }

    public void setComidaPreferidaDos(String comidaPreferidaDos) {
        this.comidaPreferidaDos = comidaPreferidaDos;
    }

    public String getComidaPreferidaTres() {
        return this.comidaPreferidaTres;
    }

    public void setComidaPreferidaTres(String comidaPreferidaTres) {
        this.comidaPreferidaTres = comidaPreferidaTres;
    }

    public String getFuturasComidas() {
        return this.futurasComidas;
    }

    public void setFuturasComidas(String futurasComidas) {
        this.futurasComidas = futurasComidas;
    }

    public List<String> getAlergias() {
        return this.alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }
 
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return id == cliente.id && firstName == cliente.firstName && lastName == cliente.lastName && Objects.equals(comidaPreferidaUno, cliente.comidaPreferidaUno) && Objects.equals(comidaPreferidaDos, cliente.comidaPreferidaDos) && Objects.equals(comidaPreferidaTres, cliente.comidaPreferidaTres) && Objects.equals(futurasComidas, cliente.futurasComidas) && Objects.equals(alergias, cliente.alergias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, comidaPreferidaUno, comidaPreferidaDos, comidaPreferidaTres, futurasComidas, alergias);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", comidaPreferidaUno='" + getComidaPreferidaUno() + "'" +
            ", comidaPreferidaDos='" + getComidaPreferidaDos() + "'" +
            ", comidaPreferidaTres='" + getComidaPreferidaTres() + "'" +
            ", futurasComidas='" + getFuturasComidas() + "'" +
            ", alergias='" + getAlergias() + "'" +
            "}";
    }


}
