package CVDS.Dina.proyecto.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "pedidoId")
    private Long pedidoId;

    @ManyToOne
    @JoinColumn(name = "IdCliente")
    private Cliente cliente;

    @Column(name = "Pedido")
    private String nombreRestaurante;

    @Column(name = "nombreComida")
    private String nombreComida;

    @Column(name = "valor")
    private int valor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Factura factura;

    public Pedido(Long pedidoId, Cliente cliente, String nombreRestaurante, String nombreComida, int valor) {
        this.pedidoId = pedidoId;
        this.cliente = cliente;
        this.nombreRestaurante = nombreRestaurante;
        this.nombreComida = nombreComida;
        this.valor = valor;
    }

    public Pedido() {
    }

    public Long getpedidoId() {
        return pedidoId;
    }

    public void setpedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pedidoId == null) ? 0 : pedidoId.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((nombreRestaurante == null) ? 0 : nombreRestaurante.hashCode());
        result = prime * result + ((nombreComida == null) ? 0 : nombreComida.hashCode());
        result = prime * result + valor;
        result = prime * result + ((factura == null) ? 0 : factura.hashCode());
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
        Pedido other = (Pedido) obj;
        if (pedidoId == null) {
            if (other.pedidoId != null)
                return false;
        } else if (!pedidoId.equals(other.pedidoId))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (nombreRestaurante == null) {
            if (other.nombreRestaurante != null)
                return false;
        } else if (!nombreRestaurante.equals(other.nombreRestaurante))
            return false;
        if (nombreComida == null) {
            if (other.nombreComida != null)
                return false;
        } else if (!nombreComida.equals(other.nombreComida))
            return false;
        if (valor != other.valor)
            return false;
        if (factura == null) {
            if (other.factura != null)
                return false;
        } else if (!factura.equals(other.factura))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pedido [pedidoId=" + pedidoId + ", cliente=" + cliente + ", nombreRestaurante=" + nombreRestaurante
                + ", nombreComida=" + nombreComida + ", valor=" + valor + ", factura=" + factura + "]";
    }

}
