public class Deletar{
    public static void main(String[] args){

        Controle produto1 = new Controle();

        produto1.id = 3;

        boolean retorno = Database.deletarRegistro(produto1);
        System.out.println(retorno);

    }
}