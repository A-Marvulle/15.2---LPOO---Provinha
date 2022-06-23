public class Poupanca extends Conta {
  private float taxaJuro;

  public float getTaxaJuro() { 
    return taxaJuro; 
  }
  
	public void setTaxaJuro(float juros) { 
    this.taxaJuro = juros; 
  }

  public String toString(){
    //super.toString() + “ taxa de juros: “ + this.taxaJuro;
    return super.toString() + "\nTaxa de Juros: " + this.taxaJuro + "\n";
  }
}