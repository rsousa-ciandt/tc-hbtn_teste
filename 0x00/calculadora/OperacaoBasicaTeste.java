public class OperacaoBasicaTeste {
    public static boolean testar_soma() {
        double resultadoEsperado = 8;
        double resultadoAcao = OperacaoBasica.somar(5, 3);

        return resultadoAcao == resultadoEsperado;
    }

    public static boolean testar_subtracao() {
        double resultadoEsperado = 2;
        double resultadoAcao = OperacaoBasica.subtrair(5, 3);

        return resultadoAcao == resultadoEsperado;
    }

    public static boolean testar_multiplicacao() {
        double resultadoEsperado = 15;
        double resultadoAcao = OperacaoBasica.multiplicar(5, 3);

        return resultadoAcao == resultadoEsperado;
    }

    public static boolean testar_divisao() {
        double resultadoEsperado = 3;
        double resultadoAcao = OperacaoBasica.dividir(9, 3);

        return resultadoAcao == resultadoEsperado;
    }


}
