public class CalculadoraDeFreteLoggi implements CalculadoraDeFrete {


    @Override
    public Double calcularFrete(Produto produto, Double km) {
        double pesoCubico = produto.calcularPesoCubico(produto.getAltura(), produto.getLargura(), produto.getComprimento());
        double pesoValido;
        if (pesoCubico> produto.getPesoKg()){
            pesoValido=pesoCubico;
        } else{
            pesoValido= produto.getPesoKg();
        }
        return pesoValido*km*0.5;

//
    }


}
