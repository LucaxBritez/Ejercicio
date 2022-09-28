public class Main{

    public static void main(String[] args){
        Cliente cliente1 = new Cliente();

        cliente1.setNombre("Marcos");
        String nombre = cliente1.getNombre();
        System.out.println("El nombre de este cliente es " + nombre);

        cliente1.setEdad(22);
        int edad = cliente1.getEdad();
        System.out.println("La edad de "+ nombre + "es " + edad);

        cliente1.setTelefono(1178993376);
        int telefono = cliente1.getTelefono();
        System.out.println("El numero de telefono de " + nombre  +" es " + telefono);

        cliente1.setCredito(false);
        boolean credito = cliente1.getCredito();
        if(credito == true){
            System.out.println("El cliente " + nombre + " posee credito");
        }else {
            System.out.println("El cliente " + nombre + " no posee credito");
        }
    }

}
class Persona{
    private int edad, telefono;
    private String  nombre;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
   }

   class Cliente extends Persona{
      boolean credito = true;

      public void setCredito(boolean credito){
          this.credito = credito;
      }
      public boolean getCredito(){
          return this.credito;
      }
   }
