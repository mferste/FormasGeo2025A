public class Triangulo {

    public static String classificarTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return "Erro: lado inválido";
        }
        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            return "Erro: não forma triângulo";
        }
        if (lado1 == lado2 && lado2 == lado3) {
            return "Triângulo Equilátero";
        }
        if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Triângulo Isósceles";
        }
        return "Triângulo Escaleno";
    }
}