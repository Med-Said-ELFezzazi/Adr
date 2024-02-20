package avisos;

public class AlarmaDomestica extends Alarma
{
	public AlarmaDomestica(boolean esDigital)
	{
		super(esDigital);
	}
	@Override
	public void parar() 
	{
		System.out.println("Parando alarma casera...");
	}
	
	public static void main(String[] args) 
	{
		AlarmaNuclear an1=new AlarmaNuclear();
		an1.programar(10000);
		an1.parar();
		System.out.println(an1.toString());
		
		AlarmaDomestica ad1=new AlarmaDomestica(false);
		ad1.programar(200);
		ad1.parar();
		System.out.println(ad1.toString());
	}
}
