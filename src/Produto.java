public class Produto {

    Double preco;
    Double pesoKg;
    Double altura; //cm
    Double largura; //cm
    Double comprimento; //cm

    public Produto(Double preco, Double pesoKg, Double altura, Double largura, Double comprimento) {
        this.preco = preco;
        this.pesoKg = pesoKg;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public double calcularPesoCubico(Double altura, Double largura, Double comprimento) {
        double pesoCubico = altura * largura * comprimento / 6000;
        return pesoCubico;
    }

}
