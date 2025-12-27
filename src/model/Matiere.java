package model;

public class Matiere {

	private int id;
	private String nom;
	private double  coef;
	
	public Matiere(int id,String nom,double coef) {
		this.id =id;
		this.coef=coef;
		this.nom=nom;
	}
	
//	LES METHODES GETTERS PERMETTENT D'OBTENIR DES INFORMATIONS DE NOTRE OBJETS
	
	public int getId() {
		return this.id;
	}
	
	public String getNom() {
		return this.nom;
	}
	public double getCoefficient() {
		return this.coef;
	}
	
	
//	LES METHODES SETTERS PERMETTENT DE MODIFIER UN OBJET
	
	public void setId(int new_id) {
		this.id =new_id;
	}
	public void setNom(String new_nom) {
		this.nom =new_nom;
	}
	public void setCoefficient(double new_coef) {
		this.coef =new_coef;
	}
	
//AVOIR UNE REPRESENTATION  PLUS COMPREHENSIBLE<POUR L'HOMME> DE NOTRE OBJECT MATIERE
	
	
	@Override
    public String toString() {
        return "Matiere [id=" + id + ", nom=" + nom + ", coefficient=" + coef+ "]";
  
    }

	

	
	
}
