package pe.vallegrande.institucion.dto;

public class InstitucionDTO {
    private String id;
    private String nombre;
    private String correoContacto;

    public InstitucionDTO(String id, String nombre, String correoContacto) {
        this.id = id;
        this.nombre = nombre;
        this.correoContacto = correoContacto;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreoContacto() { return correoContacto; }
}
