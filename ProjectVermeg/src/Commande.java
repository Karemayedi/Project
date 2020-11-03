
public class Commande {
	String nom ; 
	int id ;
	int num ;
	int nb=0; 
	LigneCommande c1[];
	public Commande(int nbc) {
	c1=new LigneCommande[nbc];
	}	
	public void ajouter(LigneCommande c3) {
		
		if(nb<=this.c1.length) 
			c1[this.nb++]=c3;
			
	}	
public void AfficheCommande( ) {
	for(int i=0;i<nb;i++) {
		c1[i].AfficheLigneCommande();			
	}
}
public float TotalCommande() {
	float total =0;
	for(int i=0;i<nb;i++) {
		total=total+c1[i].p.getPrix()*this.c1[i].p.getQte();	
	}
	return total;	
}
}
