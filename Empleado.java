public abstract class Empleado
{
     String name, lastName, id;
     double salary;
     int join_date;
    
    //Constructores
    public Empleado(){}

    public Empleado(String name, String lastName, String id, int join_date, double salary)
    {
        setName(name);
        setLastName(lastName);
        setId(id);
        setJoinDate(join_date);
        setSalary(salary);
    }

    //Getters and setters
    void setName(String name)
    { this.name = name; }

    void setLastName(String lastName)
    { this.lastName = lastName; }

    void setId(String id)
    { this.id = id; }
    
    void setSalary(double salary)
    { this.salary = salary; }

    void setJoinDate(int join_date)
    { this.join_date = join_date; }


    String getName()
    { return name; }

    String getLastName()
    { return lastName; }

    String getId()
    { return id; }

    double getSalary()
    { return salary; }
    
    int getJoinDate()
    { return join_date; }

    int calculaTiempoDeEmpleo(int join_date)
    {
        int tiempo = 2018 - join_date;
        return tiempo;
    }


   // public abstract void imprimeDatos();

    public abstract void obtenerSalario();

}// Fin de la clase Empleado


