import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0, dato1, ubicacion;

        Oper_ListasDobles OL=new Oper_ListasDobles();
        do {

            System.out.println("Menu de listas dobles");
            System.out.println("1.-Insertar inicio" +
                    "\n2.-Insertar final" +
                    "\n3.-Insertar enseguida" +
                    "\n4.-Eliminar al inicio" +
                    "\n5.-Eliinar al final" +
                    "\n6.-Eliminar elemento" +
                    "\n7.-Mostrar" +
                    "\n8.-Salir");
                    opcion =sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Insertar inicio");
                            System.out.println("Introduzca el digito que desea");
                            dato1 = sc.nextInt();
                            OL.insertarInicio(dato1);

                            break;
                        case 2:
                            System.out.println("Insertar final");
                            System.out.println("Introduzca el digito que desea");
                            dato1 = sc.nextInt();
                            OL.insertarFinal(dato1);

                            break;
                        case 3:
                            System.out.println("Insertar enseguida");
                            System.out.println("Introduzca el digito que desea insertar");
                            dato1 = sc.nextInt();
                            System.out.println("Introduzca el digito al que desea insertar enseguida");
                            ubicacion = sc.nextInt();
                            OL.insertarEnseguida(dato1,ubicacion);
                            break;
                        case 4:
                            System.out.println("Eliminar al inicio");

                            break;
                        case 5:
                            System.out.println("Eliminar al final");

                            break;
                        case 6:
                            System.out.println("Eliminar elemento");
                            System.out.println("Introduzca que eleento quiere eliminar");
                            ubicacion = sc.nextInt();
                            break;
                        case 7:
                            System.out.println("Mostrar");

                            break;
                        case 8:

                            System.out.println("Gracias por esar el programa");
                            break;
                    }
        }while (opcion!=8);
    }
}