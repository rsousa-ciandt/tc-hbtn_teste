public class Pessoa {
    public static boolean emailValid(String email) {
        int tamanhoMaximo = 50;

        boolean contemArroba = email.contains("@");
        boolean tamanhoValido = email.length() <= tamanhoMaximo;

        return contemArroba && tamanhoValido;
    }
}
