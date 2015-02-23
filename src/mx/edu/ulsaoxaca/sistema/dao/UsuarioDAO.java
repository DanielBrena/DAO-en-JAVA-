package mx.edu.ulsaoxaca.sistema.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements UsuarioDAOImpl{

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
		DataSource ds = new DataSource();
		String sql = "SELECT * FROM usuario";
		ResultSet rs = ds.ejecutarConsulta(sql);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario = null;
		try{
			while(rs.next()){
				usuario = new Usuario();
				usuario.setId(rs.getObject("id").toString());
				usuario.setNombre(rs.getObject("nombre").toString());
				usuario.setCorreoElectronico(rs.getObject("correoElectronico").toString());
				usuarios.add(usuario);
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return usuarios;
	}

	@Override
	public int updateUsuario(Usuario usuario) {
		DataSource ds = new DataSource();
		String sql = "UPDATE usuario SET nombre = '" + usuario.getNombre() + "', correoElectronico = '" + usuario.getCorreoElectronico() + "' WHERE id = '" + usuario.getId()  +"'";
		int r = ds.ejecutarActualizacion(sql);
		return r;
	}

	@Override
	public int insertUsuario(Usuario usuario) {
		DataSource ds = new DataSource();
		String sql = "INSERT INTO usuario (id,nombre,correoElectronico) ";
		sql += " VALUES ('"+usuario.getId()+"','"+usuario.getNombre()+"','"+usuario.getCorreoElectronico()+"')";
		
		int r = ds.ejecutarActualizacion(sql);
		return r;
	}

	@Override
	public int deleteUsuario(int id) {
		DataSource ds = new DataSource();
		String sql = "DELETE FROM usuario WHERE id= '" + id +"'";
		int resultado = ds.ejecutarActualizacion(sql);
		return resultado;
	}

}
