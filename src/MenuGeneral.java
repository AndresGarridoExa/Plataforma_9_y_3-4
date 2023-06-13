import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuGeneral {
    public class MenuGeneral {
        //variables
        private Scanner sn = new Scanner(System.in),teclado= new Scanner(System.in),sn2 = new Scanner(System.in);
        private boolean passvalida = false,salir = false;
        private int opcion = 0,DNI,index=0,tries = 0;
        private Pasajero sesionActiva = null;
        private String contrasenia;
        private EmpresaTransporte empresa;

        public MenuGeneral(EmpresaTransporte empresa) {
            this.empresa = empresa;
        }

        /////////lineas para sistema inicio de sesion
        public void IniciarMenu() {
            while (!salir) {

                System.out.println("---Bienvenido al sistema de La empresa Plataforma 9-3/4---");
                System.out.println("elija su rol");
                System.out.println("1. INICIAR SESION/cliente");
                System.out.println("2. iniciar sesion/admin");
                System.out.println("3. Buscar pasaje");
                System.out.println("4. Salir");

                try {

                    opcion = sn.nextInt();

                    switch (opcion) {
                        case 1:
                            do {
                                System.out.println("INGRESE SU DOCUMENTO");
                                DNI = sn2.nextInt();
                                System.out.println("INGRESE SU CONTRASEÑA");
                                contrasenia = teclado.nextLine();
                                if (empresa.logIn(contrasenia, DNI, "m") != null) {
                                    System.out.println("Inicio de sesion correcto, bienvenido");
                                    new MenuCliente((Cliente) empresa.logIn(contrasenia, DNI, "m")).menu();
                                    salir = true;
                                    break;
                                } else {
                                    System.out.println("USUARIO Y/O CONTRASEÑA INCORRECTOS");
                                    tries++;
                                }
                            } while (tries < 3);
                            break;
                        case 2://Admin
                            do {
                                System.out.println("INGRESE SU DOCUMENTO");
                                DNI = sn2.nextInt();
                                System.out.println("INGRESE SU CONTRASEÑA");
                                contrasenia = teclado.nextLine();
                                if (empresa.logIn(contrasenia, DNI, "s") != null) {
                                    System.out.println("Inicio de sesion correcto");
                                    new MenuAdmin((Admin) empresa.logIn(contrasenia, DNI, "s")).menu();
                                    salir = true;
                                    break;
                                } else {
                                    System.out.println("USUARIO Y/O CONTRASEÑA INCORRECTOS");
                                    tries++;
                                }

                            } while (tries < 3);

                            break;
                    }
                    case 3: { //hacer menu buscar pasaje
                        do {

                            break;
                        }
                        case 4:
                            System.out.println("programa terminado");
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                }
            }
        }
    }


}
