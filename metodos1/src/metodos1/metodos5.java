package metodos1;

public class metodos5 {
    
    public static void iguais() {
        String nome1 = "arthur";
        String nome2 = "Dhiovana";
        
        boolean iguais = nome1.equals(nome2);
        
        if(iguais == true){
            System.out.println("sao iguais");
        }else{
            System.out.println("Nao sao");
        }
    }

    public static void main(String[] args) {
        iguais();
    }
    
    
}
