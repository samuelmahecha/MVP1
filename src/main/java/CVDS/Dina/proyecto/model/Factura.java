package CVDS.Dina.proyecto.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "valor")
    private int valor;

    @Column(name = "NombreRestaurante")
    private String nombreRes;

    @Column(name = "FechaPedido")
    private LocalDate fechaPedido;

    @OneToOne(mappedBy = "factura")
    private Pedido pedido;

    

    public Factura(Long id, int valor, String nombreRes, LocalDate fechaPedido) {
        this.id = id;
        this.valor = valor;
        this.nombreRes = nombreRes;
        this.fechaPedido = fechaPedido;
    }

    public Factura() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + valor;
        result = prime * result + ((nombreRes == null) ? 0 : nombreRes.hashCode());
        result = prime * result + ((fechaPedido == null) ? 0 : fechaPedido.hashCode());
        result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
        Factura other = (Factura) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (valor != other.valor)
            return false;
        if (nombreRes == null) {
            if (other.nombreRes != null)
                return false;
        } else if (!nombreRes.equals(other.nombreRes))
            return false;
        if (fechaPedido == null) {
            if (other.fechaPedido != null)
                return false;
        } else if (!fechaPedido.equals(other.fechaPedido))
            return false;
        if (pedido == null) {
            if (other.pedido != null)
                return false;
        } else if (!pedido.equals(other.pedido))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", valor=" + valor + ", nombreRes=" + nombreRes + ", fechaPedido=" + fechaPedido
                + ", pedido=" + pedido + "]";
    }

    public Object getFacturaid() {
        return null;
    }

    
}
