public class CalculadoraDeDescontoFeriadosNacionais implements CalculadoraDeDesconto {
    @Override
    public Double calcularDesconto(Produto produto) {
        return produto.getPreco()*0.02;
    }

}
