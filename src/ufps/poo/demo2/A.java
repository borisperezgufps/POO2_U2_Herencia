package ufps.poo.demo2;

public class A {
	
	protected int a;
	protected int telefono;

	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public void setTelefono(int telefono) throws Exception {
		if(telefono<8)
			this.telefono = telefono;
		else
			throw new Exception("Valor inválido");
	}
	
}
