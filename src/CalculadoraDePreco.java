public class CalculadoraDePreco {

    private final CalculadoraDeFrete calculadoraDeFrete;
    private final CalculadoraDeDesconto calculadoraDeDesconto;

    public CalculadoraDePreco(CalculadoraDeFrete calculadoraDeFrete, CalculadoraDeDesconto calculadoraDeDesconto) {
        this.calculadoraDeFrete = calculadoraDeFrete;
        this.calculadoraDeDesconto = calculadoraDeDesconto;
    }

    public double calcularPrecoTotal(Produto produto, Double km){
       double precoFrete= calculadoraDeFrete.calcularFrete(produto, km);
       double precoDesconto= calculadoraDeDesconto.calcularDesconto(produto);
       return produto.getPreco()+precoFrete-precoDesconto;
    }

}
