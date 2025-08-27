public class testeCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Fiesta", 2020);
        Carro carro2 = new Carro("Chevrolet", "Onix", 2022);

        carro1.setAno(2021);
        carro2.setModelo("Onix Plus");

        System.out.println("\n--- CARROS ATUALIZADOS ---");
        carro1.mostrarInformacoes();
        System.out.println();
        carro2.mostrarInformacoes();

        System.out.println("\n--- OPERAÇÕES ---");
        carro1.ligar();
        carro2.ligar();
    }
}
