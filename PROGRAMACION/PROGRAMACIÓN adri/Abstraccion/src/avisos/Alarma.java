package avisos;

import interfaces.Programable;
import interfaces.Ruidoso;

public abstract class Alarma implements Ruidoso, Programable
{
	private boolean esDigital;
	
	public Alarma(boolean esDigital)
	{
		this.esDigital=esDigital;
	}

	@Override
	public void sonar() 
	{
		System.out.println("riiiiiinnngg... sonando");
	}
	
	@Override
	public void molestar() 
	{
		System.out.println("gggggrrrr... molestando");
	}
	
	@Override
	public void programar(int hora) 
	{
		if (esDigital)
			System.out.println("Programando digital a las "+hora);
		else
			System.out.println("Programando manualmnete a las "+hora);
	}
	
	@Override
	public String toString() 
	{
		String str="Alarma"+(esDigital?"digital":"manual");
		return str;
	}

}
