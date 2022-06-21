import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        
    	ListaCircular listaCircular = new ListaCircular();
    	
        //Coloque aqui o caminho do arquivo
		String path = "C:\\Users\\igorn\\ws-eclipse\\ad2-testes\\teste";
		String fim = "FIM";
		int passo = 0;
		int i = 1;
		No noCabeca = null;
		No permanece = null;
		
		try {
			Scanner s = new Scanner(new File(path));
			String linha;
			while (s.hasNextLine()) {
				linha = s.nextLine();
				if (fim.equals(linha)) {
					passo = Integer.parseInt(s.nextLine());
				} else {
					noCabeca = listaCircular.inserir(noCabeca, linha, i);
					i++;
				}

			}
			permanece = listaCircular.remover(noCabeca, passo);
		    listaCircular.print(permanece);
		
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
    }
    
}
