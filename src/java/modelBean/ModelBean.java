/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelBean;



import java.util.Date;




@ManagedBean
@SessionScoped
public class ModelBean{
    private String nombre;
    private int edad;
    private String signoZodiacal;
    private String fecha_nacimiento;

    public ModelBean() {
        this("", "");
    }

    public ModelBean(String nombre, String fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void horoscopo() {
        Date fechaActual = new Date();
        String cadenaMes = "";
        Boolean datosCorrectos = false;
        String fecha_cumple = this.fecha_nacimiento;
        Integer dia = null, mes = null, edad = null;
        String arregloMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        try {
            String[] arregloFecha = fecha_cumple.split("-"); //fecha formato 2022-09-01
            dia = Integer.parseInt(arregloFecha[2]);
            mes = Integer.parseInt(arregloFecha[1]);
            edad = Integer.parseInt(arregloFecha[0]);
            cadenaMes = arregloMeses[mes - 1];
            edad = (fechaActual.getYear() + 1900) - edad;
            if (fechaActual.getMonth() + 1 == mes) {
                if (fechaActual.getDate() < dia) {
                    edad--;
                }
            }
            if (fechaActual.getMonth() + 1 < mes)
                edad--;
            datosCorrectos = true;
        } catch (NumberFormatException ex) {
            System.out.println("No son numeros los valores insertados" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error generico" + ex.getMessage());
        }

        String resultado = "";

        if (datosCorrectos) {
            if (dia >= 21 && cadenaMes.equals("Marzo") || dia <= 20 && cadenaMes.equals("Abril")) {
                resultado = "Aries";
            } else if (dia >= 21 && cadenaMes.equals("Abril") || dia <= 20 && cadenaMes.equals("Mayo")) {
                resultado = "Tauro";
            } else if (dia >= 21 && cadenaMes.equals("Mayo") || dia <= 21 && cadenaMes.equals("Junio")) {
                resultado = "Geminis";
            } else if (dia >= 22 && cadenaMes.equals("Junio") || dia <= 22 && cadenaMes.equals("Julio")) {
                resultado = "Cancer";
            } else if (dia >= 23 && cadenaMes.equals("Julio") || dia <= 22 && cadenaMes.equals("Agosto")) {
                resultado = "Leo";
            } else if (dia >= 23 && cadenaMes.equals("Agosto") || dia <= 22 && cadenaMes.equals("Septiembre")) {
                resultado = "Virgo";
            } else if (dia >= 23 && cadenaMes.equals("Septiembre") || dia <= 22 && cadenaMes.equals("Octubre")) {
                resultado = "Libra";
            } else if (dia >= 23 && cadenaMes.equals("Octubre") || dia <= 21 && cadenaMes.equals("Noviembre")) {
                resultado = "Escorpio";
            } else if (dia >= 22 && cadenaMes.equals("Noviembre") || dia <= 22 && cadenaMes.equals("Diciembre")) {
                resultado = "Sagitario";
            } else if (dia >= 23 && cadenaMes.equals("Diciembre") || dia <= 20 && cadenaMes.equals("Enero")) {
                resultado = "Capricornio";
            } else if (dia >= 21 && cadenaMes.equals("Enero") || dia <= 19 && cadenaMes.equals("Febrero")) {
                resultado = "Acuario";
            } else if (dia >= 20 && cadenaMes.equals("Febrero") || dia <= 20 && cadenaMes.equals("Marzo")) {
                resultado = "Piscis";
            }
            this.setSignoZodiacal(resultado);
        }
        this.setEdad(edad);
        this.setNombre(this.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSignoZodiacal() {
        return signoZodiacal;
    }

    public void setSignoZodiacal(String signoZodiacal) {
        this.signoZodiacal = signoZodiacal;
    }
}