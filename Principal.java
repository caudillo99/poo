public class Principal
{
    public static void main(String[] args) 
    {
        cls();
        EAsalariado[] asalariado = new EAsalariado[2];
        EComision[] comision = new EComision[2];
        
        System.out.println("Persona 1. Asalariado");
        asalariado[0] = new EAsalariado(CapturaInfo.captureStrings("Nombre"), CapturaInfo.captureStrings("Apellido"), CapturaInfo.captureStrings("ID"), CapturaInfo.captureInt("Anio de ingreso"), CapturaInfo.captureDouble("Salario"));
        
        
        System.out.print("\n\nPersona 2. Comision\n");
        comision[0] = new EComision(CapturaInfo.captureStrings("Nombre"), CapturaInfo.captureStrings("Apellido"), CapturaInfo.captureStrings("ID"), CapturaInfo.captureInt("Anio de ingreso"), CapturaInfo.captureDouble("salario"),CapturaInfo.captureInt("Clientes"), CapturaInfo.captureDouble("Comision por cliente") );
        
        /*
        System.out.print("\n\nPersona 3. Comision\n");
        empleado[2] = new EComision();
        empleado[2].
        empleado[2].lastName = "Ruiz";
        empleado[2].id = "741258";
        empleado[2].join_date = 2012;
        empleado[2].
        empleado[2].setComision(7.90);
        /*


        /*
        System.out.print("\n\nPersona 4. Asalariado\n");
        vector[3] = new EAsalariado();

        vector[3].name      = CapturaInfo.captureStrings("Nombre");
        vector[3].lastName  = CapturaInfo.captureStrings("Apellido");
        vector[3].id        = CapturaInfo.captureStrings("ID");
        vector[3].join_date = CapturaInfo.captureInt("Anio de ingreso");
        vector[3].salary    = CapturaInfo.captureDouble("Salario");
        */
        
       //EAsalariado.imprimeDatos(vector[0]);
       //EComision.imprimeDatos(vector[1]);
       //EComision.imprimeDatos(vector[2]);
       //EAsalariado.imprimeDatos(vector[3]);
    
    }

    public static void cls()
    {
        for(int i=0; i<40; i++)
            System.out.println(" ");
    }

    
}