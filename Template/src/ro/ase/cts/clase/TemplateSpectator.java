package ro.ase.cts.clase;

public abstract class TemplateSpectator {
	
    public abstract void seAseazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void controlCorporal();
    public abstract void ocupaLoc();
    
    public final void intrareStadion() {
    	seAseazaLaCoada();
    	prezintaBilet();
    	controlCorporal();
    	ocupaLoc();
    }
    

}
