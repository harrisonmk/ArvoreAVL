
package avl;



public class Main {
    
    public static void main(String[] args){
        
    ArvoreAvl av = new ArvoreAvl();   
    
    
    
   System.out.println("****Inserções****");     
   av.inserir(20);
   av.inserir(15);
   av.inserir(8);
   av.inserir(12);
   av.inserir(6);
   av.inserir(1);
   av.inserir(4);
   av.inserir(7);
   
        
   av.emOrdem(av.raiz);
   System.out.println();
   
   
   
        
   System.out.println("Raiz: "+av.raiz);
   System.out.println("Altura: "+av.alturaArvore(av.raiz));
   System.out.println("Quantidade de Nó: "+av.quantidadeNo(av.raiz));
   av.verifcarAvl(av.raiz);
   
    
    }
    
}
