package Trabalho3LRF;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean verdadeiroFalso;
        String mensagemInicial = ("""
                Digite (1) para Veículos de Carga;
                Digite (2) para Veículos de Transporte de Pessoal;
                """);
        System.out.println(mensagemInicial);
        int opcao = scan.nextInt();
        scan.nextLine();
        if (opcao == 1) {
            Carga carga = new Carga();
            System.out.println("Digite a Placa:");
            carga.setPlaca(scan.nextLine());
            System.out.println("Digite a Marca:");
            carga.setMarca(scan.nextLine());
            System.out.println("Digite o Modelo:");
            carga.setModelo(scan.nextLine());
            System.out.println("Digite o Ano do Modelo:");
            carga.setAnoModelo(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Ano de Fabricação:");
            carga.setAnoFabricacao(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Número do Chassi:");
            carga.setChassi(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Renavam:");
            carga.setRenavam(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite a Procedência:");
            carga.setProcedencia(scan.nextLine());
            System.out.println("Digite a Altura em metros:");
            carga.setAltura(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite a Largura em metros:");
            carga.setLargura(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite a Profundidade:");
            carga.setProfundidade(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite a Cor Externa:");
            carga.setCorExterna(scan.nextLine());
            System.out.println("Digite a Cor Interna:");
            carga.setCorInterna(scan.nextLine());
            System.out.println("Digite o Tipo de Combustível:");
            carga.setCombustivel(scan.nextLine());
            System.out.println("Digite os CVs do Motor:");
            carga.setCvMotor(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite a Quilometragem:");
            carga.setQuilometragem(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Consumo:");
            carga.setConsumo(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite se tem Opcionais:\n(1)Sim\n(2)Não");
            if (scan.nextInt() == 1) {
                verdadeiroFalso = true;
            } else {
                verdadeiroFalso = false;
            }
            carga.setOpcionais(verdadeiroFalso);
            scan.nextLine();
            System.out.println("Digite o Peso Máximo em Kilos:");
            carga.setMaxKg(scan.nextDouble());
            scan.nextLine();
            List<Veiculos> listaVeiculos = Arrays.asList(carga);
            imprimeVeiculos(listaVeiculos);
        } else if (opcao == 2){
            Pessoal pessoal = new Pessoal();
            System.out.println("Digite a Placa:");
            pessoal.setPlaca(scan.nextLine());
            System.out.println("Digite a Marca:");
            pessoal.setMarca(scan.nextLine());
            System.out.println("Digite o Modelo:");
            pessoal.setModelo(scan.nextLine());
            System.out.println("Digite o Ano do Modelo:");
            pessoal.setAnoModelo(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Ano de Fabricação:");
            pessoal.setAnoFabricacao(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Número do Chassi:");
            pessoal.setChassi(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Renavam:");
            pessoal.setRenavam(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite a Procedência:");
            pessoal.setProcedencia(scan.nextLine());
            System.out.println("Digite a Altura em metros:");
            pessoal.setAltura(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite a Largura em metros:");
            pessoal.setLargura(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite a Profundidade:");
            pessoal.setProfundidade(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite a Cor Externa:");
            pessoal.setCorExterna(scan.nextLine());
            System.out.println("Digite a Cor Interna:");
            pessoal.setCorInterna(scan.nextLine());
            System.out.println("Digite o Tipo de Combustível:");
            pessoal.setCombustivel(scan.nextLine());
            System.out.println("Digite os CVs do Motor:");
            pessoal.setCvMotor(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite a Quilometragem:");
            pessoal.setQuilometragem(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Consumo:");
            pessoal.setConsumo(scan.nextDouble());
            scan.nextLine();
            System.out.println("Digite se tem Opcionais:\n(1)Sim\n(2)Não");
            if (scan.nextInt() == 1) {
                verdadeiroFalso = true;
            } else {
                verdadeiroFalso = false;
            }
            pessoal.setOpcionais(verdadeiroFalso);
            scan.nextLine();
            System.out.println("Digite o Número de Portas:");
            pessoal.setNumPortas(scan.nextInt());
            scan.nextLine();
            System.out.println("Digite o Número de Passageiros:");
            pessoal.setNumPassageiros(scan.nextInt());
            scan.nextLine();
            List<Veiculos> listaVeiculos = Arrays.asList(pessoal);
            imprimeVeiculos(listaVeiculos);
        } else{
            System.out.println("Digito inválido");
        }
        scan.close();
    }
    public static void imprimeVeiculos(List<Veiculos> veiculos) {
        int i = 1;
        for (Veiculos veiculo : veiculos) {
            System.out.println("Veículo " + i++);
            System.out.println(veiculo.toString());
            System.out.println("----------------------------------------");
        }
    }
}