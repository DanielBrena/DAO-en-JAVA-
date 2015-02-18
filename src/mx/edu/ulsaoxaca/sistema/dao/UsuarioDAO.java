package mx.edu.ulsaoxaca.sistema.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDAO implements IUsuarioDAO{

	@Override
	public Usuario selectByNombre(String nombre) {
		DataSource ds = new DataSource();
		ResultSet r = ds.ejecutarConsulta("SELECT * FROM usuario where nombre = '"+ nombre + "'");
		Usuario u = new Usuario();
		try {
			if(r.next()){
				u.setId(r.getObject("id").toString());
				u.setNombre(r.getObject("nombre").toString());
				u.setCorreoElectronico(r.getObject("correoElectronico").toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public List<Usuario> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUsuario(Usuario usuario) {
		DataSource ds = new DataSource();
		String sql = "UPDATE usuario SET nombre = '" + usuario.getNombre() + "', correoElectronico = '" + usuario.getCorreoElectronico() + "'";
		int r = ds.ejecutarActualizacion(sql);
		return r;
	}

}
