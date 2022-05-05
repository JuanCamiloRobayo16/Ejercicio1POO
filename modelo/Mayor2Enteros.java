package modelo;

public class Mayor2Enteros 
{
    //----------
    // Atributos 
    //----------
    private int x;
    private int y; 
    private int mayor;
 
    //----------
    // Metodos
    //----------

    /*Metodo Constructor*/
    public class Mayor2Enteros(int pX, int pY)
    {
        this.x = pX;
        this.y = pY;
        this.mayor = 0;

    }
    public void setX(int x)
    {
        this.x = X;
    }
    public getX()
    {
        return X;
    }
    public void setY(int y)
    {
        this.x = X;
    }
    public getY()
    {
        return Y;
    }
    public int getMayor()
    {
        return mayor;
    }
    public void hallarMayor()
    {
        if(x>y)
        {
            mayor = x;
        }
        else
         {
            mayor = y;
        }
    }
}
 