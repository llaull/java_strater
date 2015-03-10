package starter_1;

public class Edutient {
    
    
    //liste de propriete / attributs
    private String name; //osef NetBeans sux
    private int[] notes;
    private int moyenne;
    
    //contruction explicite
    Edutient(String name){
        this.name = name;
    }
    
    /**
     * metholde expriment une action
     * c'est une fonction dans la classe
     */
    public void saisieNotes(){
        
        //variables
        int nbNotes = Saisie.lireInt("nombre de notes ? ");
        
        notes = new int[nbNotes];
        
        for (int i = 0; i < notes.length; i++) {
            
            String question = "Saisir note : " + (i+1) + "/" + nbNotes + " : ";
            notes[i] = Saisie.lireInt(question);
            
        }
    }
    
    /**
     * 
     */
    public void calculeNotes(){
        
        for(int v : notes){ //foreach de java
            moyenne += v;
            System.out.println("-> " + moyenne);
        }
        moyenne = moyenne/notes.length;
    }
    
    /**
     * 
     */
    public void afficheNotes(){
        
        System.out.println("Notes pour l'édutiant " + name + " : ");
        for(int v : notes){
            System.out.print(v + "/");
        }
        System.out.println("moyenne " + moyenne);
    }
}
