import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taller1 extends Thread
{
	private String name;
	private  int n;
	private Long tiempoSleep;
	
	public Taller1(String name, int n, Long tiempoSleep) {
		this.name=name;
		this.n=n;
		this.tiempoSleep=tiempoSleep;
	}
	
	
	public void run()
	{
		if(name=="1")
		{
			int i=1;
			
			while(i<=n)
			{
				if(i%2==0)
				{
					System.out.println(i);
					try {
						Thread.sleep(tiempoSleep);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				i++;
			}
		}
		else if(name=="2")
		{
			int i=1;
			
			while(i<=n)
			{
				if(i%2==1)
				{
					System.out.println(i);
					
					try {
						Thread.sleep(tiempoSleep);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				i++;
			}
			
				
		}
		
	}
	
	public static void main(String[] args) throws IOException
	{  

		System.out.println("Ingrese el limite superior:");
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		int nAux=Integer.parseInt(reader.readLine());
		
		System.out.println("Ingrese el tiempo de dormir de los Thread (en milisegundos):");
		
		Long nT= Long.parseLong(reader.readLine());
		
		Taller1 p1= new Taller1("1",nAux, nT);
		Taller1 p2= new Taller1("2",nAux, nT);
		
		p1.start();
		p2.start();

	}

}
