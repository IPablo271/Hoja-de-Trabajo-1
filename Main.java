import java.util.Scanner;
import java.util.ArrayList;


class Main {

  public static void main(String[] args) {

  GenericRadio radio = new Radio();
  Scanner scan = new Scanner(System.in);

  if(radio.isON() == false){

    boolean run = true;
    while(run){
      try{
      System.out.println("Desea encender la Radio? (Ingrese '1' para hacerlo)");
      int opc1=scan.nextInt();
      run = false;
      }catch(Exception e){
        System.out.println("Por favor ingrese numeros unicamente");
        scan.nextLine();
      }
    }
    
    boolean run2 = true;
    while(run2){

      System.out.println("######-MENU-######");
      System.out.println("1. Incrementar");
      System.out.println("2. Asignar");
      System.out.println("3. Seleccionar emisora guardada");
      System.out.println("4. Cambiar Radiofrecuencia");
      System.out.println("5. Salir");

      run = true;
      int opc = 0;
      while(run){
        try{
      System.out.println("Ingrese la opcion que desee");
      opc = scan.nextInt();
      if(opc < 1 || opc > 5){
        System.out.println("Por favor ingrese el numero correcto");
      } else{
        run = false;
      }
        }catch(Exception e){
        System.out.println("Por favor ingrese numeros unicamente");
        scan.nextLine();
      }
    }

  switch(opc){

    case 1: 
      radio.incrementar();
      break;
    case 2:
      System.out.println("Por favor ingrese la emisora que desea seleccionar (1-12)");
      boolean run3 = true;
      int opc2 = 0;
      while(run3){
        try{
          opc2 = scan.nextInt();
          if(opc2 < 1 || opc2 > 12){
            System.out.println("Por favor ingrese el numero correcto");
          } else{
            run3 = false;
          }
        }catch(Exception e){
        System.out.println("Por favor ingrese numeros unicamente");
        scan.nextLine();
        }
      }
      radio.asignar(opc2);
      break;
    case 3:
      System.out.println("Por favor ingrese la emisora que desea seleccionar (1-12)");
      boolean run4 = true;
      int opc3 = 0;
      while(run4){
        try{
          opc3 = scan.nextInt();
          if(opc3 < 1 || opc3 > 12){
            System.out.println("Por favor ingrese el numero correcto");
          } else{
            run4 = false;
          }
        }catch(Exception e){
        System.out.println("Por favor ingrese numeros unicamente");
        scan.nextLine();
        }
      }
      radio.emisoras(opc3);
      break;
    case 4:
      radio.frecuencias();
      break;
    case 5:
      run2 = false;
      break;

  }

    }
    

    
    





  }
  



  }
}