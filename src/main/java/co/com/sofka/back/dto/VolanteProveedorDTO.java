package co.com.sofka.back.dto;

import co.com.sofka.back.Model.Producto;

import java.util.Date;
import java.util.List;

public class VolanteProveedorDTO {
    private String id;
    private String nombreProveedor;
    private List<Producto> productos;
    private Date Fecha;
    private String documentoIdentidadProveedor;

    public VolanteProveedorDTO() {
    }

    public VolanteProveedorDTO(String id, String nombreProveedor,
                               List<Producto> productos, Date fecha, String documentoIdentidadProveedor) {
        this.id = id;
        this.nombreProveedor = nombreProveedor;
        this.productos = productos;
        Fecha = fecha;
        this.documentoIdentidadProveedor = documentoIdentidadProveedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getDocumentoIdentidadProveedor() {
        return documentoIdentidadProveedor;
    }

    public void setDocumentoIdentidadProveedor(String documentoIdentidadProveedor) {
        this.documentoIdentidadProveedor = documentoIdentidadProveedor;
    }
}
