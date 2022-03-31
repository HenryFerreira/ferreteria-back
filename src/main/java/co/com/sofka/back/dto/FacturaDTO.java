package co.com.sofka.back.dto;

import co.com.sofka.back.Model.Producto;

import java.util.Date;
import java.util.List;

public class FacturaDTO {
    private String id;
    private Long consecutivoFactura;
    private Date Fecha;
    private String nombreCliente;
    private String nombreEmpleado; //El empleado de la ferreteria atiende al cliente
    private List<Producto> productos;
    private Double totalPagar;

    public FacturaDTO() {
    }

    public FacturaDTO(String id, Long consecutivoFactura, Date fecha,
                      String nombreCliente, String nombreEmpleado, List<Producto> productos, Double totalPagar) {
        this.id = id;
        this.consecutivoFactura = consecutivoFactura;
        Fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.nombreEmpleado = nombreEmpleado;
        this.productos = productos;
        this.totalPagar = totalPagar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public void setConsecutivoFactura(Long consecutivoFactura) {
        this.consecutivoFactura = consecutivoFactura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }
}
