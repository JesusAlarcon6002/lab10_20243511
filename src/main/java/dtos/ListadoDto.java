package dtos;

public class ListadoDto {
    private int idEquipo;
    private String hostname;
    private String tipo;
    private String ipGestion;
    private String estado;
    private String sedeNombre;
    private String ciudad;
    private String mesesOperativos;

    public ListadoDto() {
    }

    public ListadoDto(int idEquipo, String hostname, String tipo, String ipGestion, String estado, String sedeNombre, String ciudad, String mesesOperativos) {
        this.idEquipo = idEquipo;
        this.hostname = hostname;
        this.tipo = tipo;
        this.ipGestion = ipGestion;
        this.estado = estado;
        this.sedeNombre = sedeNombre;
        this.ciudad = ciudad;
        this.mesesOperativos = mesesOperativos;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIpGestion() {
        return ipGestion;
    }

    public void setIpGestion(String ipGestion) {
        this.ipGestion = ipGestion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMesesOperativos() {
        return mesesOperativos;
    }

    public void setMesesOperativos(String mesesOperativos) {
        this.mesesOperativos = mesesOperativos;
    }
}
