public class Test { 
  public static void main(String[] args) {
    Loup l = new Loup("Gris bleut�", 20);
    l.boire();
    l.manger();
    l.deplacement();
    l.crier();
    System.out.println(l.toString());
    
    //Les m�thodes d'un chien 
    Chien c = new Chien("Gris bleut�", 20);
    c.boire();
    c.manger();
    c.deplacement();
    c.crier();
    System.out.println(c.toString());
			
    System.out.println("--------------------------------------------");
    //Les m�thodes de l'interface
    c.faireCalin();
    c.faireLeBeau();
    c.faireLechouille();
		
    System.out.println("--------------------------------------------");
    //Utilisons le polymorphisme de notre interface
    Rintintin r = new Chien();
    r.faireLeBeau();
    r.faireCalin();
    r.faireLechouille();
  } 
}