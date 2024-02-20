package abstraccion;

public abstract class Tren extends Vehiculo
{
	private int vagones;
	
	public Tren(String marca, int vagones)
	{
		super(marca);
		super.numRuedas=-1;
		vagones=vagones;
	}
	
	@Override
	public void arrancar() 
	{
		System.out.println("Tren arrancando...");
	}
	
	@Override
	public void parar() 
	{
		System.out.println("Tren parando...");
	}
	
	@Override
	public String toString() 
	{
		String str="Tren marca "+getMarca()+", vagones: "+vagones;
		return str;
	}
}
