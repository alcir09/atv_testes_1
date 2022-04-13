public class FormasPagamentos {


    private double desconto;
    private double acrescimo;
    private double valor_final;

    //PAGAMENTO VIA MASTERCARD TEM 4% DE DESCONTO PARA PARCELAMENTO ATÉ 3 VEZES
    //SE FOR ACIMA DE 3 VEZES É ACESCENTADO JUROS DE 2%
    public Double TipoMaster(double valor, int parcelamento) {

        if (parcelamento <= 3) {

            desconto = (4 * valor) / 100;
            valor_final = valor - desconto;

        } else {

            acrescimo = (2 * valor) / 100;
            valor_final = valor + acrescimo;

        }

        return valor_final;

    }

    //PAGAMENTO VIA VISA TEM 6% DE DESCONTO PARA PARCELAMENTO ATÉ 2 VEZES
    //SE FOR ACIMA DE 2 VEZES É ACESCENTADO JUROS DE 4%
    public double TipoVisa(double valor, int parcelamento) {

        if (parcelamento <= 2) {

            desconto = (6 * valor) / 100;
            valor_final = valor - desconto;

        } else {

            acrescimo = (4 * valor) / 100;
            valor_final = valor + acrescimo;

        }

        return valor_final;

    }

    //PAGAMENTO A VISTA TEM 9% DESCONTO SE VIA PIX E 11% SE FOR EM ESPÉCIE
    public double TipoAvista(double valor, String tipoPagamento) {

        switch (tipoPagamento.toUpperCase()) {

            case "ESPECIE":
                desconto = (11 * valor) / 100;
                valor_final = valor - desconto;

            case "PIX":

                desconto = (9 * valor) / 100;
                valor_final = valor - desconto;

            default:

                System.out.println("Para pagamentos avista entrar com PIX ou ESPECIE");

        }

        return valor_final;

    }

}