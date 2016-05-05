// Grupo: Arthur Pires, Fábio Takaki e Lucas Martins.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static BufferedReader readFile;
	private static Scanner read;
	private static Scanner number;

	public static void main(String[] args) {
		System.out.println("Rede Social");
		read = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo.");
		String name = read.nextLine();
		try{
			// realizo a leitura do arquivo
			FileReader file = new FileReader(name);
			readFile = new BufferedReader(file);
			String line = readFile.readLine();
			int sizeVertex = Integer.parseInt(line);
			
			// Crio o Grafo
			Graph g = new Graph(sizeVertex, new ListAdjacency(sizeVertex));
			Graph gInverse = new Graph(sizeVertex, new ListAdjacency(sizeVertex));
			
			// caminho mais uma vez para começar a leitura das arestas
			line = readFile.readLine();
			
			// Como a busca em largura realiza a busca dos vértices que determinado vértice chega.
			// Invertemos as direções das arestas para saber os vértices que chegam no determinado vértice.
			// Assim temos um grafo correto (g) e um invertido (gInverse).
			while(line != null){
				String aux = line;
				String[] split = aux.split(" ");
				g.addEdge( Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]) );
				gInverse.addEdge( Integer.parseInt(split[1]), Integer.parseInt(split[0]), Integer.parseInt(split[2]) );
				line = readFile.readLine();
			}
			
			// Exibo o grafo correto
			g.show();
			
			number = new Scanner(System.in);
			System.out.println("Informe a pessoa:");
			int person = Integer.parseInt(number.nextLine());
			
			// Realizo a busca em largura com o grafo inverso.
			Relationship r = new Relationship(gInverse);
			r.process(person);
			
		}catch(IOException e){
			System.err.printf("Erro na abertura de arquivo %s \n", e.getMessage());
		}
	}

}
