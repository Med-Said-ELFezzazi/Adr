package musica;

public class InstrumentoCuerda extends InstrumentoMusical
{
	private int numCuerdas;
	
	public InstrumentoCuerda(String nombre, int registro, int numCuerdas) 
	{
		super(nombre, registro);
		this.numCuerdas=numCuerdas;
	}
	public String toString()
	{
		return super.toString()+", cuerdas: "+numCuerdas;
	}
	@Override
	public void sonar() 
	{
		System.out.println("nininni...");
	}
	
	public static void main(String[] args) 
	{
		InstrumentoCuerda ic1=new InstrumentoCuerda("Violín", 100, 4);
		ic1.sonar();
		System.out.println(ic1.toString());
	}
}
