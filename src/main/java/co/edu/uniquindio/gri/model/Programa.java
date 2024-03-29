package co.edu.uniquindio.gri.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

// TODO: Auto-generated Javadoc
/**
 * The Class Programa.
 */
@Entity(name = "PROGRAMAS")
@Table(name = "PROGRAMAS", schema = "gri")
public class Programa implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Column(name = "ID")
	private long id;

	/** The nombre. */
	@Column(name = "NOMBRE")
	private String nombre;

	/** The nombre. */
	@Column(name = "INFORMACIONGENERAL")
	private String informaciongeneral;

	/** The nombre. */
	@Column(name = "MISION")
	private String mision;
	/** The nombre. */
	@Column(name = "VISION")
	private String vision;

	/** The contacto. */
	@Column(name = "CONTACTO")
	private String contacto;

	/** The activo */
	@Column(name = "ACTIVO")
	private boolean activo;

	/** The facultad. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FACULTADES_ID")
	private Facultad facultad;

	/** The grupos. */
	@ManyToMany(mappedBy = "programas", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Grupo> grupos = new ArrayList<Grupo>();

	/**
	 * Instantiates a new programa.
	 */
	public Programa() {
	}

	/**
	 * Instantiates a new programa.
	 *
	 * @param id       the id
	 * @param nombre   the nombre
	 * @param facultad the facultad
	 */
	public Programa(long id, String nombre, Facultad facultad, String informaciongenera, String contacto, String mision,
			String vision) {
		this.id = id;
		this.nombre = nombre;
		this.facultad = facultad;
		this.informaciongeneral = informaciongenera;
		this.contacto = contacto;
		this.mision = mision;
		this.vision = vision;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * get the informaciongeneral
	 * 
	 * @return the informacion general
	 */
	public String getInformaciongeneral() {
		return informaciongeneral;
	}

	/**
	 * sets the informacion general
	 * 
	 * @param the new informaciongeneral
	 */
	public void setInformaciongeneral(String informaciongeneral) {
		this.informaciongeneral = informaciongeneral;
	}

	/**
	 * get the contacto
	 * 
	 * @return the contacto
	 */
	public String getContacto() {
		return contacto;
	}

	/**
	 * Sets the activo.
	 *
	 * @param categoria the new activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * Sets the activo.
	 *
	 * @param activo the new activo
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	/**
	 * get the mision
	 * 
	 * @return the vision
	 */
	public String getMision() {
		return mision;
	}

	/**
	 * set the mision
	 * 
	 * @param the new mision
	 */
	public void setMision(String mision) {
		this.mision = mision;
	}

	/**
	 * get the vision
	 * 
	 * @return the vision
	 */
	public String getVision() {
		return vision;
	}

	/**
	 * set the vision
	 * 
	 * @param the new vision
	 */
	public void setVision(String vision) {
		this.vision = vision;
	}

	/**
	 * sets the contacto
	 * 
	 * @param the New contacto
	 */
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	/**
	 * Gets the facultad.
	 *
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * Sets the facultad.
	 *
	 * @param facultad the new facultad
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * Gets the grupos.
	 *
	 * @return the grupos
	 */
	public List<Grupo> getGrupos() {
		return grupos;
	}

	/**
	 * Sets the grupos.
	 *
	 * @param grupos the new grupos
	 */
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

}