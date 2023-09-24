public class Veiculos {
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private int chassi;
    private int renavam;
    private String procedencia;
    private double altura;
    private double largura;
    private double profundidade;

    private String corExterna;
    private String corInterna;
    private String combustivel;
    private int cvMotor;
    private int quilometragem;
    private double consumo;
    private boolean opcionais;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getChassi() {
        return chassi;
    }
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
    public int getRenavam() {
        return renavam;
    }
    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }
    public String getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
    public String getCorExterna() {
        return corExterna;
    }
    public void setCorExterna(String corExterna) {
        this.corExterna = corExterna;
    }
    public String getCorInterna() {
        return corInterna;
    }
    public void setCorInterna(String corInterna) {
        this.corInterna = corInterna;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public double getCvMotor() {
        return cvMotor;
    }
    public void setCvMotor(int cvMotor) {
        this.cvMotor = cvMotor;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    public boolean isOpcionais() {
        return opcionais;
    }
    public void setOpcionais(boolean opcionais) {
        this.opcionais = opcionais;
    }
    public String toString(){
        return "- Marca : " + this.marca +
                " \n- Modelo : " + this.modelo + 
                " \n- Ano Modelo: " + this.anoModelo +
                " \n- Placa: " + this.placa +
                " \n- Ano Fabricação: " + this.anoFabricacao +
                " \n- Chassi: " + this.chassi +
                " \n- Renavam: " + this.renavam +
                " \n- Procedência: " + this.renavam +
                " \n- Altura em Metros: " + this.altura +
                " \n- Largura em Metros: " + this.largura +
                " \n- Profundidade em Metros: " + this.profundidade +
                " \n- Cor Externa: " + this.corExterna +
                " \n- Cor Interna: " + this.corInterna +
                " \n- Combustível: " + this.combustivel +
                " \n- CVs do Motor: " + this.cvMotor +
                " \n- Quilometragem: " + this.quilometragem +
                " \n- Consumo por Litro: " + this.consumo + 
                " \n- Opcionais: " + this.opcionais;
    }


}