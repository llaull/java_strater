package starter_1;

public class Edutient {
    
    private String name;
    private int[] notes;
    private int moyenne;
    
    //contruction explicite
    Edutient(String name){
        this.name = name;
    }
    
    /**
     * 
     */
    public void saisieNotes(){
        
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
        
        for(int v : notes){
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
