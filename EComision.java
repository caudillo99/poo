public class EComision extends Empleado
{
    double comision;          // Comision por cada cliente
    int clientes;               // Cantidad de clientes percibidos
    static double sueldo_base = 750;


    public EComision(){}
    

    public EComision(String name, String lastName, String id, int join_date,double salary, int clientes, double comision)
    {
        super(name, lastName, id, join_date, salary);
        setClientes(clientes);
        setComision(comision);
        //this.salary = sueldo_base;
    }

    
    void setComision(double comision)
    {
        this.comision = comision;
    }

    void setClientes(int clientes)
    {
        this.clientes = clientes;
    }

    @Override
    public void obtenerSalario() 
    {
        if ((clientes*comision)>this.salary)    this.salary = (clientes*comision);
    }


    
}