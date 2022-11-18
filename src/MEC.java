public class MEC{
  
    public void imprimeUniverdidades(Universidade uni[]){
        for(int i=0; i<uni.length; i++){
            if(uni[i] instanceof Publica){
                System.out.println("Pública: ");
                uni[i].imprimeInfo();
            }
            else if (uni[i] instanceof Privada){
                System.out.println("Privada: ");
                uni[i].imprimeInfo();
            }
        }
    }
    
    public void maisCara(Universidade cara[]){
        double maisCara = 0;
        int id = 0;
        for(int i = 0; i<cara.length; i++){
            if(cara[i] instanceof Privada){
                if(                                                                                                                                maisCara < ((Privada)cara[i]).getValorMensalidade()){
                    maisCara = ((Privada)cara[i]).getValorMensalidade();
                    id = i;
                }
            }
        }
        ((Privada)cara[id]).imprimeInfo();
    }
    
    public void universidadesDoSul(Universidade sul[]){
        for(int i=0; i<sul.length;i++){
            if(sul[i] instanceof Publica){
                if(((Publica)sul[i]).getEstado().equalsIgnoreCase("RS") || ((Publica)sul[i]).getEstado().equalsIgnoreCase("SC") || ((Publica)sul[i]).getEstado().equalsIgnoreCase("PR")){
                    ((Publica)sul[i]).imprimeInfo();
                }
            }
        }
    }
    
}
