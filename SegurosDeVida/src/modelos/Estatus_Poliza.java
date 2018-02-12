package modelos;

import org.springframework.beans.factory.annotation.Autowired;

public class Estatus_Poliza {
@Autowired
private int estatus_Poliza;
private String estatus;

public int getEstatus_Poliza() {
	return estatus_Poliza;
}
public void setEstatus_Poliza(int estatus_Poliza) {
	this.estatus_Poliza = estatus_Poliza;
}
public String getEstatus() {
	return estatus;
}
public void setEstatus(String estatus) {
	this.estatus = estatus;
}



}
