public class head{
    public static void main(String[] args){

        Controle produto1 = new Controle();

        boolean retorno = Database.abrirID(produto1,2);
        System.out.println(produto1.nome + " " + produto1.descricao + " " + produto1.quantidade + " " + produto1.preco);
    
    }
}