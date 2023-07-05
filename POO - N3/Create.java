public class Create{
    public static void main(String[] args){

        Controle produto1 = new Controle();

        produto1.id = 3;
        produto1.nome = "Oleo";
        produto1.descricao = "oleo de Soja liza";
        produto1.quantidade = 20;
        produto1.preco = 90.00;

        boolean retorno = Database.inserirRegistro(produto1);
        System.out.println(retorno);
    
    }
}