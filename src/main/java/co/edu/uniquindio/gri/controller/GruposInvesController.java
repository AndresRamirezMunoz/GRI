package co.edu.uniquindio.gri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniquindio.gri.dao.GruposInvesDAO;

@RestController
@RequestMapping("/rest/service")
public class GruposInvesController {
	
	/** DAO para gruposInve. */
	@Autowired
	GruposInvesDAO gruposInvesDAO;
	
}
