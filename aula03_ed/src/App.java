import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando um array, do tipo inteiro, com 5 elementos
        //Criando um array de tamanho explicito
       int [] meu_array = new int[5];

       //Determinando um valor em cada posição [0 até 4]
       meu_array[0]=10;
       meu_array[1]=20;
       meu_array[2]=30;
       meu_array[3]=40;
       meu_array[4]=50;

       //Exibindo o conteúdo de uma determinada posição
       System.out.println(meu_array[0]);
       System.out.println(meu_array[1]);


       //Recuperando o conteúdo do array de uma determinada posição
       int e1 = meu_array[0];
       int e2 = meu_array[1];

       System.out.println("O conteudo: "+e1);
       System.out.println("O conteudo: "+e2);

       //percorrer um array (sequencial) - com for
        for (int i =0;i<meu_array.length;i++){
            System.out.println("A posição: "+i);
            System.out.println("O Elemento: "+ meu_array[i]);
        }

        //criando um array de tamanho implicito
        String [] alunos = {"Rafael", "Gabriel", "Guilherme", "Giovana"};
        
        //percorrendo um array (sequencialmente) - for-each
        for(String aluno:alunos){
            System.out.println(aluno);
        }

        //Realizando um print no vetor
        System.out.println(Arrays.toString(alunos));

        //Quantidade de elementos que há no vetor: Length
        System.out.println(alunos.length);

        //Clonar um vetor: Clone
        String [] copia = alunos.clone();

        //Copiando uma parte do vetor para outro: CopyOf
        String[] copia_parcial = Arrays.copyOf(alunos, 2);
        System.out.println(Arrays.toString(copia_parcial));

        //ordenando valores dentro do array
        Arrays.sort(alunos);
        System.out.println(Arrays.toString(alunos));

    }
}
