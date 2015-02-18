package mx.edu.ulsaoxaca.sistema.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUsuario {
	public static void main(String[] args){
		
		//Seleccionar
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario1 = usuarioDAO.selectByNombre("daniel");
		System.out.println(usuario1);
		
		//Actualizar
		Usuario usuario2 = new Usuario("uno","Daniel","daniel_brena@hotmail.com");
		int i = usuarioDAO.updateUsuario(usuario2);
		System.out.println(i);
		
		
		
	}
}
