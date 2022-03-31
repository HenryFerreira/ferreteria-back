package co.com.sofka.back.dto;

public class ProductoDTO {

    private String id;
    private String nombreProducto;
    private Long precio;

    public ProductoDTO() {
    }

    public ProductoDTO(String id, String nombreProducto, Long precio) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
}
