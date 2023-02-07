public class CalculadoraDescontosValorProgressivo implements CalculadoraDeDesconto{
    @Override
    public Double calcularDesconto(Produto produto) {
        double desconto =0;
        if (produto.getPreco()>=200 && produto.getPreco()<400){
            desconto = produto.getPreco()*0.01;
        } else if(produto.getPreco()>=400 && produto.getPreco()<=800){
            desconto = produto.getPreco()*0.03;
        } else if ((produto.getPreco()>800)){
            desconto = produto.getPreco()*0.05;
        }
        return desconto;
    }
}
