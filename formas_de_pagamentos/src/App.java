public class App {

    public static void main(String[] args) throws Exception {

        TestePagamentos teste = new TestePagamentos();

        //TESTE MASTERCARD DESCONTO
        teste.TestarMastercardDesconto(12, 100, 2);

        //TESTE MASTERCARD ACRESCIMO
        teste.TestarMastercardAcrescimo();

        //TESTE VISA DESCONTO
        teste.TestarVisaDesconto();

        //TESTE VISA ACRESCIMO
        teste.TestarVisaAcrescimo();

        //TESTE A VISTA PIXA   
        teste.TestarAvistaPIX();

        //TESTE A VISTA ESPECIE
        teste.TestarAvistaEspecie();

    }
}