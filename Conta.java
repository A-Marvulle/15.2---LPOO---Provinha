public abstract class Conta implements IOperacoes {
  private int id;
  private String nome;
  private float saldo;

  public int getId() { 
    return id; 
  }
  
	public void setId(int cod) { 
    this.id = cod; 
  }

  public String getNome() { 
    return nome; 
  }
  
	public void setNome(String name) { 
    this.nome = name; 
  }

  public float getSaldo() { 
    return saldo; 
  }
  
	public void setSaldo(float verba) { 
    this.saldo = verba; 
  }

  public String toString() {
	return "Id: " + Integer.toHexString(this.id) + "\nNome: " + this.nome + "\nConta: " + getClass().getName();
}



  public float consultaSaldo(){
    return this.saldo;
  }
  
  public void realizaSaque(float valor){
    
  }
  
  public void realizaDeposito(float valor){
    
  }
  
}