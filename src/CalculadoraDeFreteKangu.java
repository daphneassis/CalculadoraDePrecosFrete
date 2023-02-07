public class CalculadoraDeFreteKangu implements CalculadoraDeFrete{
    @Override
    public Double calcularFrete(Produto produto, Double km) {
        double taxaEntregaPorArea = 0;
        if (produto.getPesoKg() <= 10) {
            if (km > 1 && km <= 2) {
                taxaEntregaPorArea = 8.0;
            } else if (km > 2 && km <= 5) {
                taxaEntregaPorArea = 10.0;
            } else if (km > 5 && km <= 7) {
                taxaEntregaPorArea = 12.0;
            }
            return taxaEntregaPorArea;
        } else if (produto.getPesoKg()>10 && produto.getPesoKg()<=20 ) {
            taxaEntregaPorArea = 25.0;
        }
        return taxaEntregaPorArea;
    }
}
