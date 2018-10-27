import java.sql.Time;

//import com.sun.org.apache.regexp.internal.recompile;

public class EAsalariado extends Empleado
{
    //Constructor 
    public EAsalariado(){}
    
    public EAsalariado (String name, String lastName, String id, int join_date, double salary) 
    {
        super(name, lastName, id, join_date, salary);
  
    }

    @Override
    public void obtenerSalario() {
        if((2018-join_date)>= 2 && (2018-join_date)<=3 )        this.salary += (this.salary*.05);
        else if ((2018-join_date)>=4 && (2018-join_date)<=7)    this.salary += (this.salary*.10);
        else if ((2018-join_date)>=8 && (2018-join_date)<=15)   this.salary += (this.salary*.15);
        else if ((2018-join_date) > 15)                         this.salary += (this.salary*.20);
    }

    


}