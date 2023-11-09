package CVDS.Dina.proyecto.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    private Long clienteid;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "PASSWORD")
    private String password;

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
    
    @Column(name = "TIPOID")
    private String tipoId;

    @Column(name = "CEDULA")
    private int cedula;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Alergia> alergias;

    public Cliente(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }




    public Long getClienteid() {
        return this.clienteid;
    }

    public void setClienteid(Long clienteid) {
        this.clienteid = clienteid;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Alergia> getAlergias() {
        return this.alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

    public String getTipoId(){
        return this.tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public int getCedula(){
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (clienteid == null) {
            if (other.clienteid != null)
                return false;
        } else if (!clienteid.equals(other.clienteid))
            return false;
        if (nickname == null) {
            if (other.nickname != null)
                return false;
        } else if (!nickname.equals(other.nickname))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (comidaPreferidaUno == null) {
            if (other.comidaPreferidaUno != null)
                return false;
        } else if (!comidaPreferidaUno.equals(other.comidaPreferidaUno))
            return false;
        if (comidaPreferidaDos == null) {
            if (other.comidaPreferidaDos != null)
                return false;
        } else if (!comidaPreferidaDos.equals(other.comidaPreferidaDos))
            return false;
        if (comidaPreferidaTres == null) {
            if (other.comidaPreferidaTres != null)
                return false;
        } else if (!comidaPreferidaTres.equals(other.comidaPreferidaTres))
            return false;
        if (futurasComidas == null) {
            if (other.futurasComidas != null)
                return false;
        } else if (!futurasComidas.equals(other.futurasComidas))
            return false;
        if (alergias == null) {
            if (other.alergias != null)
                return false;
        } else if (!alergias.equals(other.alergias))
            return false;
        return true;
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((clienteid == null) ? 0 : clienteid.hashCode());
        result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((comidaPreferidaUno == null) ? 0 : comidaPreferidaUno.hashCode());
        result = prime * result + ((comidaPreferidaDos == null) ? 0 : comidaPreferidaDos.hashCode());
        result = prime * result + ((comidaPreferidaTres == null) ? 0 : comidaPreferidaTres.hashCode());
        result = prime * result + ((futurasComidas == null) ? 0 : futurasComidas.hashCode());
        result = prime * result + ((alergias == null) ? 0 : alergias.hashCode());
        return result;
    }






}
