package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        Integer opcion;
        String cedula;
        LocalDate fecha=LocalDate.now();
        String nombreCliente;

        String nombreEmpleado;
        String contracenaEmpleado;
        String nombreEmpleadoBD="jaimitoElmascapito";
        String contracenaEmpleadoBD="lijhsf99670kbnkfoi|°ñ_{ñ´-{-.ñkjhisa9";
        boolean usuario=false;


        while (usuario==false){

            System.out.println("*****Pandebonos Nario*****");
            System.out.println("**************************");
            System.out.println("Apreciado empleado inicie sesión por favor");
            System.out.print("Digite su usario: ");
            nombreEmpleado=leer.nextLine();
            System.out.print("Digite su contraceña: ");
            contracenaEmpleado=leer.nextLine();

            if (nombreEmpleado.equals(nombreEmpleadoBD) && contracenaEmpleado.equals(contracenaEmpleadoBD)) {
                System.out.println("Ingresando");
                usuario=true;
            }else {
                System.out.println("Usuario invalido intent nueva mente");
            }
        }

        System.out.println("\n.....pandequesofware.....");
        System.out.println("1.Registrar compra");
        System.out.println("2.Calcular total");
        System.out.println("3.Modificar compra");
        System.out.println("4.salir");
        do {
            System.out.print("Seleccione una opcion: ");
            opcion=leer.nextInt();


            Integer cantidadTradicional=0;
            Integer cantidadGuayaba=0;
            Integer cantidadArequipe=0;
            Integer cantidad7Quesos=0;
            Integer cantidadBebidas=0;

            Integer producyoSeleccionado;
            switch (opcion){
                case 1:
                    System.out.println("1. Pandebono Tradicional ($8000)");
                    System.out.println("2. Pandebono de Guayaba ($9500)");
                    System.out.println("3. Pandebono de Arequipe ($12000)");
                    System.out.println("4. Pandebono de 7 Quesos ($20000)");
                    System.out.println("5. Bebida ($9500)");
                    System.out.println("6. Terminar pedido");
                    System.out.println("....................................");

                    do {
                        System.out.println("digite el producto deseado");
                        producyoSeleccionado=leer.nextInt();
                        switch (producyoSeleccionado){
                            case 1:
                                System.out.println("Dijita cla cantidad de pandebono tradicional que deseas");
                                cantidadTradicional=leer.nextInt();
                                break;
                            case 2:
                                System.out.println("Dijita cla cantidad de pandebono de guayaba que deseas");
                                cantidadGuayaba=leer.nextInt();
                                break;
                            case 3:
                                System.out.println("Dijita cla cantidad de pandebono de arequipe que deseas");
                                cantidadArequipe=leer.nextInt();
                                break;
                            case 4:
                                System.out.println("Dijita cla cantidad de pandebono de 7 quesos que deseas");
                                cantidad7Quesos=leer.nextInt();
                                break;
                            case 5:
                                System.out.println("Dijita cla cantidad de bebidas que deseas");
                                cantidadBebidas=leer.nextInt();
                                break;
                            case 6:
                                System.out.println("Orden terminada");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }while (producyoSeleccionado!=6);
                    break;
                case 2:
                    Double totalSinPropina=((cantidadTradicional*8000.0)+(cantidadGuayaba*9500.0)+(cantidadArequipe*12000.0)+(cantidad7Quesos*20000.0)+(cantidadBebidas*9500.0));
                    Double totalconPropina=((totalSinPropina)+(totalSinPropina*0.1));
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Compra terminada");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }

        }while (opcion !=4);





    }
}