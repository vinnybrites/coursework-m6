public class Principal{
    
    public static void main (String [] args){
        
         //universidade
    String n; 
    int qA; 
    int qP; 
    //privada
    double vM;
    //publica
    String e; 
    String c;
        
        int quantidade = Teclado.leInt("Quantas universidades você deseja criar?");
        Universidade[] univer = new Universidade[quantidade];
        
        for(int i=0; i<univer.length; i++){
            int op = Teclado.leInt("Você deseja criar uma universidade de qual tipo? Escolhe 1-Pública ou 2-Privada\n");
            switch(op) {
                case 1: n = Teclado.leString("Digite o nome da Universidade: ");
                        qA = Teclado.leInt("Digite a quantidade de alunos da Universidade: ");
                        qP = Teclado.leInt("Digite a quantidade de professores da Universidade: ");
                        e = Teclado.leString("Digite o estado: ");
                        c = Teclado.leString("Digite a cidade: ");
                        univer[i] = new Publica (n, qA, qP, e, c);
                        break;
                case 2: n = Teclado.leString("Digite o nome da Universidade: ");
                        qA = Teclado.leInt("Digite a quantidade de alunos da Universidade: ");
                        qP = Teclado.leInt("Digite a quantidade de professores da Universidade: ");
                        vM = Teclado.leDouble("Digite o valor da mensalidade: ");
                        univer[i] = new Privada (n, qA, qP, vM);
                        break;
                default:
                    System.out.println("Opção Invalida");
                                
            }
        }
        
        MEC imprime = new MEC();
        
        
        System.out.println("\nImprimindo as informações de todas as Universidades\n");
        System.out.println();
    
        imprime.imprimeUniverdidades(univer);
        
        System.out.println("Imprimindo as informações da Privada mais cara\n");
        System.out.println();
    
        imprime.maisCara(univer);
        
        System.out.println("\n Imprimindo as informações das Públicas do sul");
        System.out.println();
   
        imprime.universidadesDoSul(univer);
        
        
        
    }
}
