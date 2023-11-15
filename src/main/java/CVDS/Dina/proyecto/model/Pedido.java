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
    @Column(name= "PedidoId")
    private Long PedidoId;

    @ManyToOne
    @JoinColumn(name = "IdCliente")
    private Cliente cliente;

    @Column(name = "Pedido")
    private String nombreRestaurante;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facturaId", referencedColumnName = "PedidoId")
    private Factura factura;
}
