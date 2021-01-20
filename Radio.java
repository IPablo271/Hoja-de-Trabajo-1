import java.util.ArrayList;
public class Radio implements GenericRadio{

  private boolean on = false;
  private boolean am = false;
  private int estacionam = 1;
  private int estacionfm = 1;
  ArrayList<Integer> estacionesam= new ArrayList<Integer>();
  ArrayList<Integer> estacionesfm= new ArrayList<Integer>();


  public Radio(){
    for(int i = 0; i< 12; i++){
      estacionesam.add(0);
      estacionesfm.add(0);
    }
    
  }

  public boolean isON(){
    return on;
  }

  public void encender(){
      on = true;
  }

  public void apagar(){
      on = false;
  }

  public void incrementar(){
    if(estacionam < 50 && am == true){
      estacionam++;
      System.out.println("Usted esta escuchando la estacion " + estacionam + " en am");
    } else if(estacionfm < 50 && am == false){
      estacionfm++;
      System.out.println("Usted esta escuchando la estacion " + estacionfm + " en fm");
    } else if(estacionam == 50 && am == true) {
      estacionam =1;
      System.out.println("Usted esta escuchando la estacion " + estacionam + " en am");
    } else if(estacionfm == 50 && am == false) {
      estacionfm =1;
      System.out.println("Usted esta escuchando la estacion " + estacionfm + " en fm");
    }
  }

	public boolean asignar(int pos){
    if(am == true){
      estacionesam.set(pos-1,estacionam);
      System.out.println("Usted ha asignado la estacion " + estacionam + " al boton " + pos + " en am");
      return true;
    } else{
      estacionesfm.set(pos-1,estacionfm);
      System.out.println("Usted ha asignado la estacion " + estacionfm + " al boton " + pos + " en fm");
      return true;
    }
    

  }

	public boolean emisoras(int pos){
    if(estacionesam.get(pos-1) != 0 && am == true){
    
      estacionam = estacionesam.get(pos-1);
      System.out.println("Usted esta escuchando la estacion " + estacionam + "en am");
      return true;

    } else if (estacionesfm.get(pos-1) != 0 && am == false){
      estacionfm = estacionesfm.get(pos-1);
      System.out.println("Usted esta escuchando la estacion " + estacionfm + "en fm");
      return true;

    } else{
      System.out.println("Esta emisora no tiene ninguna estacion");
      return false;
    }
  }

	public void frecuencias(){
    if(am==false){
      am=true;
      System.out.println("Usted esta escuchando la estacion " + estacionam + " en am");
    }
    else if(am==true){
      am=false;
      System.out.println("Usted esta escuchando la estacion " + estacionfm + " en fm");
    }
    
  }


  
  

}