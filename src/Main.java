import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        CalculadoraDePreco calculadoraLoggi = new CalculadoraDePreco(new CalculadoraDeFreteLoggi(), new CalculadoraDescontosValorProgressivo());
        CalculadoraDePreco calculadoraLoggi2 = new CalculadoraDePreco(new CalculadoraDeFreteLoggi(), new CalculadoraDeDescontoFeriadosNacionais());
        CalculadoraDePreco calculadoraKangu = new CalculadoraDePreco(new CalculadoraDeFreteKangu(), new CalculadoraDescontosValorProgressivo());
        CalculadoraDePreco calculadoraKangu2 = new CalculadoraDePreco(new CalculadoraDeFreteKangu(), new CalculadoraDeDescontoFeriadosNacionais());


        Produto produto1 = new Produto(600.0, 20.0, 50.0, 30.0, 45.0);
        Produto produto2 = new Produto(300.0, 9.0, 60.0, 50.0, 10.0);
        double km = 10.0;

        System.out.println("Via Loggi, com descontos progressivos");
        System.out.println(calculadoraLoggi.calcularPrecoTotal(produto1, km));
        System.out.println(calculadoraLoggi.calcularPrecoTotal(produto2, km));
        System.out.println("-------------");
        System.out.println("Via Loggi, com descontos feriados nacionais");
        System.out.println(calculadoraLoggi2.calcularPrecoTotal(produto1, km));
        System.out.println( calculadoraLoggi2.calcularPrecoTotal(produto2, km));
        System.out.println("-------------");
        System.out.println("Via Kangu, com descontos progressivos");
        System.out.println(calculadoraKangu.calcularPrecoTotal(produto1, km));
        System.out.println(calculadoraKangu.calcularPrecoTotal(produto2, km));
        System.out.println("-------------");
        System.out.println("Via Kangu, com descontos feriados nacionais");
        System.out.println(calculadoraKangu2.calcularPrecoTotal(produto1, km));
        System.out.println(calculadoraLoggi2.calcularPrecoTotal(produto2, km));





    }
}