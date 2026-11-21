package daos;

import beans.EquiposRed;
import dtos.ListadoDto;

import java.sql.*;
import java.util.ArrayList;

public class EquiposRedDao extends BaseDao{
    public ArrayList<ListadoDto> listaEquiposRed(){
        ArrayList<ListadoDto> lista = new ArrayList<>();

        String sql = "SELECT e.id_equipo, e.hostname, e.tipo, e.ip_gestion, e.estado, s.nombre AS 'Sede', s.ciudad, fecha_alta FROM equipos_red AS e" +
                " INNER JOIN sedes s ON e.id_sede = s.id_sede;";

        try(Connection conn = this.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()){
                ListadoDto dto = new ListadoDto();
                dto.setIdEquipo(rs.getInt("id_equipo"));
                dto.setHostname(rs.getString("hostname"));
                dto.setTipo(rs.getString("tipo"));
                dto.setIpGestion(rs.getString("ip_gestion"));
                dto.setEstado(rs.getString("estado"));
                dto.setSedeNombre(rs.getString("Sede"));
                dto.setCiudad(rs.getString("ciudad"));
                dto.setMesesOperativos(rs.getString("fecha_alta"));
                lista.add(dto);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return  lista;
    }
}
