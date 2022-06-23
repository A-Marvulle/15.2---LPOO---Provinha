import java.util.List;
import java.util.ArrayList;
  
public class Banco {
  private int numero;
  private String nome;
  private List<Conta> contas = new ArrayList<Conta>();

  public int getNumero() { 
    return numero; 
  }
  
	public void setNumero(int nmr) { 
    this.numero = nmr; 
  }

  public String getNome() { 
    return nome; 
  }
  
	public void setNome(String name) { 
    this.nome = name; 
  }

  public void cadastrarConta(Conta conta) {
    contas.add(conta);
  }

  public void removerConta(Conta conta) {
    contas.remove(conta);
  }

  public void exibirContas() {
    for(Conta c : contas) {
      System.out.println(c.toString());
    }
  } 

  public void Banco(int numero, String nome, List<Conta> contas) {}
}