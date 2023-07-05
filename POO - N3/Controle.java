public class Controle extends SQLClass{            
    @Key
    int id;
    String nome;
    String descricao;
    int quantidade;
    double preco;    


    Controle(){
        this.setTableName("Controle");        
    }    
}
