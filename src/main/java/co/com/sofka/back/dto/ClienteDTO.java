package co.com.sofka.back.dto;

public class ClienteDTO {
    private String id;
    private String documentoIdentidad;
    private String nombre;
    private String celular;

    public ClienteDTO() {
    }

    public ClienteDTO(String id, String documentoIdentidad, String nombre, String celular) {
        this.id = id;
        this.documentoIdentidad = documentoIdentidad;
        this.nombre = nombre;
        this.celular = celular;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
