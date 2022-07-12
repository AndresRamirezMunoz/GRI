package co.edu.uniquindio.gri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.gri.model.CompositeKey;
import co.edu.uniquindio.gri.model.GruposInves;

/**
 * Interface GruposInvesRepository
 *
 */
@Repository
public interface GruposInvesRepository extends JpaRepository<GruposInves, CompositeKey> {

	String MODELO_GRUPOSINVESTIGADOR = "co.edu.uniquindio.gri.model.GruposInves(i.grupos, i.investigadores, i.estado)";
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */

	@Query("select distinct NEW " + MODELO_GRUPOSINVESTIGADOR
			+ " FROM co.edu.uniquindio.gri.model.GruposInves i")
	List<GruposInves> findAll();
}
