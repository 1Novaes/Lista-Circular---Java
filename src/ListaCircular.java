
public class ListaCircular {
	
	No prim = null;
	
	
    public No remover(No ref_prim, int passo) {
        No prim = ref_prim;

     
        if (prim == null) {
            return null;
        }

     
        No atual = prim, anterior = null;
        while (true) {

            for (int i = 0; i < passo; i++) {
                anterior = atual;
                atual = atual.prox;
            }

            if (atual.prox == prim && atual == prim) {
                break;
            }
            
            if (atual == prim) {
                anterior = prim;
                while (anterior.prox != prim)
                    anterior = anterior.prox;
                    
                prim = atual.prox;
                anterior.prox = prim;
                ref_prim = prim;
            }
            
            else if (atual.prox == prim) {
                anterior.prox = prim;
            } else {
                anterior.prox = atual.prox;
            }
            atual = atual.prox;
        }
        return prim;
    }

    public No inserir(No ref_prim, String str, int pos) {
        
        No prim = ref_prim;
        No aux = new No(str, pos);

    
        if (prim == null) {
            aux.prox = aux;
            ref_prim = aux;
            return ref_prim;
        }

        else {
            No aux2 = prim;
            while (aux2.prox != prim) {
                aux2 = aux2.prox;
            }
            aux2.prox = aux;
            aux.prox = prim;
        }
        return prim;
    }
    
    public void print(No prim) {
        System.out.println(prim.posicao);
    }
}

