package mx.edu.ulsaoxaca.sistema.dao;

import java.util.List;

public interface IUsuarioDAO {
	/**
	 * Selecciona un usuario por su nombre.
	 * @param nombre Nombre a buscar.
	 * @return	Usuario El usuario encontrado.
	 */
	Usuario selectByNombre(String nombre);
	/**
	 * Regresa una lista con todos los registros.
	 * @return List<Usuario> Registro de todos los usuarios.
	 */
	List<Usuario> selectAll();
	/**
	 * Actualiza un usuario.
	 * @param usuario Usuario a actualizar.
	 * @return Entero de la tablas afectadas.
	 */
	int updateUsuario(Usuario usuario);
}
