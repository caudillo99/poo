public class Main
{
    public static void main(String[] args) 
    {
        Empleado[] vector = new Empleado[4] ;   //Creacion del arreglo de objetos
        vector[0] = new EComision(CapturaInfo.captureStrings("Nombre"), CapturaInfo.captureStrings("Apellido"), CapturaInfo.captureStrings("ID"), CapturaInfo.joinDate("Anio de ingreso"), CapturaInfo.captureSalary("Salario"));
        vector[1] = new EComision(CapturaInfo.captureStrings("Nombre"), CapturaInfo.captureStrings("Apellido"), CapturaInfo.captureStrings("ID"), CapturaInfo.joinDate("Anio de ingreso"), CapturaInfo.captureSalary("Salario"));

        
        
       // EComision comision = new EComision(CapturaInfo.captureStrings("Nombre"), CapturaInfo.captureStrings("Apellido"), CapturaInfo.captureStrings("ID"), CapturaInfo.joinDate("Anio de ingreso"), CapturaInfo.captureSalary("Salario"));


        
    }
}