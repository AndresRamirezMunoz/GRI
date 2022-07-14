package co.edu.uniquindio.gri.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.edu.uniquindio.gri.CrudRepository.GruposInvesCrudRepository;
import co.edu.uniquindio.gri.model.CompositeKey;
import co.edu.uniquindio.gri.model.Grupo;
import co.edu.uniquindio.gri.model.GruposInves;
import co.edu.uniquindio.gri.repository.GruposInvesRepository;
import co.edu.uniquindio.gri.service.api.GruposInvesServiceApi;
import co.edu.uniquindio.gri.utilities.GenericServiceImpl;

/**
 * Clase GruposInvesDAO
 *
 */
@Service
public class GruposInvesDAO  extends GenericServiceImpl<GruposInves, CompositeKey> implements GruposInvesServiceApi{

	@Autowired
	GruposInvesRepository gruposInvesRepository;
	
	@Autowired
	GruposInvesCrudRepository gruposInvesCrudRepository;
	
	public List<GruposInves> findAll(){
		return gruposInvesRepository.findAll();
	}
	
	@Override
	public GruposInves get(CompositeKey id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Obtiene un grupo de investigación especificado por un id.
	 *
	 * @param grupoId el id del grupo de investigación
	 * @return el grupo de investigación por el id
	 */
	public GruposInves findOne(CompositeKey grupoId) {
		return gruposInvesRepository.findById(grupoId).orElse(null);
	}

	@Override
	public CrudRepository<GruposInves, CompositeKey> getCrudRepository() {
		return gruposInvesCrudRepository;
	}

	
}
