
public class Relationship {
	private Graph gInverse;
	
	public Relationship(Graph gInverse){
		this.gInverse = gInverse;
	}
	
	public void process(int p){
		WidthSearch search = new WidthSearch(gInverse);
		search.process(p); // realizo busca em largura
		String result[] = search.getColors(); // recupero as cores para verificação
		
		for(int i=0; i<gInverse.getSizeVertex(); i++)
		{
			// se for preto e não for a própria pessoa. A pessoa i encontrada chega
			// na pessoa p informada pelo usuário.
			if(result[i].equals("b") && i != p){
				System.out.println("Pessoa: "+i);
			}
		}
	
	}
}
