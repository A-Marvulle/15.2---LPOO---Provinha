public class Corrente extends Conta {
  private float limite;

  public float getLimite() { 
    return limite; 
  }
  
	public void setLimite(float limite) { 
    this.limite = limite; 
  }

  public String toString(){
    //super.toString() + “ limite: “ + this.limite;
    return super.toString() + "\nLimite: " + this.limite + "\n";
  }
}