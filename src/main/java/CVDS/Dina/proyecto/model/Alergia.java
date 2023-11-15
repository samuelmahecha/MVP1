package CVDS.Dina.proyecto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Alergia {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "Alergiasid")
    private Long alergiasid;

    @ManyToOne
    @JoinColumn(name = "IdCliente")
    private Cliente cliente;

    @Column(name = "Nombre")
    private String name;

    public Alergia() {
    }

    public Alergia(Cliente cliente, String name) {
        this.cliente = cliente;
        this.name = name;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Long getAlergiasid() {
        return alergiasid;
    }

    public void setAlergiasid(Long alergiasid) {
        this.alergiasid = alergiasid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alergiasid == null) ? 0 : alergiasid.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alergia other = (Alergia) obj;
        if (alergiasid == null) {
            if (other.alergiasid != null)
                return false;
        } else if (!alergiasid.equals(other.alergiasid))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Alergias [alergiasid=" + alergiasid + ", name=" + name + "]";
    }




    
    
    

    
    
}
