package mx.edu.ulsaoxaca.sistema.dao;

import java.util.List;

public interface PerfilDAOImpl {
	Perfil selectPerfilById(int id);
	Perfil selectPerfilByNombre(String nombre);
	List<Perfil> selectAll();
	int insertPerfil(Perfil perfil);
	int updatePerfil(Perfil perfil);
	int deletePerfil(int i);
}
