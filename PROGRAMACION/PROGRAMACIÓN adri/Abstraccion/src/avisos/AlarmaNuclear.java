package avisos;

public class AlarmaNuclear extends Alarma
{
	public AlarmaNuclear()
	{
		super(true);
	}
	
	@Override
	public void parar()
	{
		System.out.println("Activando sistema de seguridad");
	}
}
