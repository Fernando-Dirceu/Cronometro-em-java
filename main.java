public class main {
    public static void main(String[] args) 
    {
    int segundos = 30, minutos = 1;
    int i,j;


    for (j=0; j<=minutos; j++)
    {
        for (i=0; i<=60; i++)
        {
            System.out.println("Minutos:" + j +" Segundos:" + i);
            if (j==minutos & i==segundos)
            {
                break;
            }
            try 
            {
                Thread.sleep(1000); // 1000 milissegundos = 1 segundos
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        
    }

    }
}
