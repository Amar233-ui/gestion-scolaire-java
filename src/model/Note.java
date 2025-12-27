public class Note
{
    private Eleve eleve;
    private Matiere matiere;
    private double valeur;

    public Note(Eleve eleve, Matiere matiere, double valeur)
    {
        this.eleve = eleve;
        this.matiere = matiere;
        this.valeur = valeur;
    }


    // setters / getters
    public Eleve getEleve()
    {
        return this.eleve;
    }
    public void setEleve(Eleve newEleve)
    {
        this.eleve = newEleve;
    }

    public Matiere getMatiere()
    {
        return this.matiere;
    }
    public void setMatiere(Matiere newMatiere)
    {
        this.matiere = newMatiere;
    }

    public double getValeur()
    {
        return this.valeur;
    }
    public void setValeur(double newValeur)
    {
        this.valeur = newValeur;
    }
}