package beans;

import java.util.Date;

public class EquiposRed {
    private int idEquipo;
    private String hostname;
    private String tipo;
    private String ipGestion;
    private String estado;
    private String fechaAlta;
    private Sedes idSedes;

    public EquiposRed() {
    }

    public EquiposRed(int idEquipo, String hostname, String tipo, String ipGestion, String estado, String fechaAlta, Sedes idSedes) {
        this.idEquipo = idEquipo;
        this.hostname = hostname;
        this.tipo = tipo;
        this.ipGestion = ipGestion;
        this.estado = estado;
        this.fechaAlta = fechaAlta;
        this.idSedes = idSedes;
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

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Sedes getIdSedes() {
        return idSedes;
    }

    public void setIdSedes(Sedes idSedes) {
        this.idSedes = idSedes;
    }
}
