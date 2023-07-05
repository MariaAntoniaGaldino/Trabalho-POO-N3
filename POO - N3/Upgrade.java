public class Upgrade{
    public static void main(String[] args){

        Controle produto1 = new Controle();

        produto1.id = 1;
        produto1.nome = "oleo";
        produto1.descricao = "oleo de soja soya";
        produto1.quantidade = 5;
        produto1.preco = 0;

        boolean retorno = Database.atualizarRegistro(produto1);
        System.out.println(retorno);
    
    }
}