import model.Banco;
import service.BancoService;


public class Main {
    public static void main(String[] args) {
        BancoService bancoService = new BancoService();
        Banco client1 = new Banco(1,"Maik",15000.00);
        bancoService.showAccount(client1);
        bancoService.addCredit(client1,2500.00);
        System.out.printf("Last :");
        bancoService.showAccount(client1);
        bancoService.deductCredit(client1,1500.00);
        System.out.printf("Last :");
        bancoService.showAccount(client1);
        bancoService.deductCredit(client1,30000.00);
        System.out.printf("Last :");
        bancoService.showAccount(client1);






    }
}