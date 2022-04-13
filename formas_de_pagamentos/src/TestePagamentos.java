import org.junit.Test;
import org.junit.Assert;;

public class TestePagamentos {

    FormasPagamentos pagamento = new FormasPagamentos();

    double delta = 0.0;

    //TESTE PARA DESCONTO MASTERCARD
    @Test
    public void TestarMastercardDesconto(double param1, double param2, int param3) {

        Assert.assertEquals(param1, pagamento.TipoMaster(param2, param3), delta);
    } 

    //TESTE PARA ACRESCIMO MASTERCARD
    @Test
    public void TestarMastercardAcrescimo() {

        Assert.assertEquals(102, pagamento.TipoMaster(100, 4), delta);
    }

    //TESTE PARA DESCONTO VISA
    @Test
    public void TestarVisaDesconto() {

        Assert.assertEquals(94, pagamento.TipoVisa(100, 2), delta);
    }

    //TESTE PARA ACRESCIMO VISA
    @Test
    public void TestarVisaAcrescimo() {

        Assert.assertEquals(104, pagamento.TipoVisa(100, 3), delta);
    }

    //TESTE PARA PAGAMENTO A VISTA COM PIX
    @Test
    public void TestarAvistaPIX() {

        Assert.assertEquals(91, pagamento.TipoAvista(100, "pix"), delta);
    }

    //TESTE PARA PAGAMENTO A VISTA EM ESPECIE
    @Test
    public void TestarAvistaEspecie() {

        Assert.assertEquals(91, pagamento.TipoAvista(100, "especie"), delta);
    }
}