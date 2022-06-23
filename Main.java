import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Banco banco = new Banco();
    Corrente corrente = new Corrente();
    Poupanca poupanca = new Poupanca();
    Poupanca poupanca2 = new Poupanca();
    Poupanca poupanca3 = new Poupanca();
    

    banco.setNome("Itau");
    banco.setNumero(10);

    corrente.setId(1);
    corrente.setNome("Milton");
    corrente.setSaldo(100.5f);
    corrente.setLimite(50);

    poupanca.setId(2);
    poupanca.setNome("Milton");
    poupanca.setSaldo(1005f);
    poupanca.setTaxaJuro(0.5f);

    poupanca2.setId(3);
    poupanca2.setNome("Andreia");
    poupanca2.setSaldo(1005f);
    poupanca2.setTaxaJuro(0.556f);

    poupanca3.setId(4);
    poupanca3.setNome("Jose");
    poupanca3.setSaldo(1005f);
    poupanca3.setTaxaJuro(5f);

    banco.cadastrarConta(corrente);
    banco.cadastrarConta(poupanca);
    banco.cadastrarConta(poupanca2);
    banco.cadastrarConta(poupanca3);
    banco.exibirContas();
   
  }
}