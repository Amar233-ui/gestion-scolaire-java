package classeEleve;

public class Eleve {
     private int id;
     private String nom;
     private  String  prenom;

    public Eleve(int id,String nom,String prenom){
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

//    les setters
    void setNom(String nouveauNom){
        this.nom = nouveauNom;
    }
    void setPrenom(String nouveauPrenom){
        this.prenom = nouveauPrenom;
    }
    void setId(int nouvelId){
        this.id = nouvelId;
    }

//    les getters
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    int getId(){
        return this.id;
    }

//    to string()
    @Override
    public String toString(){
        return  "id: "+this.id+"   nom : "+ this.nom+"   prenom : "+this.prenom;


    }




    }


