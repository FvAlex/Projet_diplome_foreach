package personne;

class Personne {

    private String nom;
    private String societe;

    public Personne(String nom){
        this.nom = nom;
    };

    public void afficher(){
        System.out.println("Je m'appelle " + nom);
        System.out.println("Je travaille chez " + societe);
    };
};
