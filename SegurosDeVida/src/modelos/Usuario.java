package modelos;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Usuario {
@Autowired	
private int id_usuario 			= 0;
private int edad 				= 0;
private int numero 				= 0;
private int codigo_postal 		= 0;
private int id_condicionMedica 	= 0;
private String nombre 			= "";
private String apellidos 		= "";
private String genero 			= "";
private String telefono			= "";
private String celular			= "";
private String correo			= "";
private String calle 			= "";
private String locacion 		= "";
private String ciudad 			= "";
private String estado 			= "";
private String pais  			= "";
private String rfc 				= "";
private String curp 			= "";
private String Direccion 		= "";
private String ocupacion 		= "";
private String estado_civil		= "";
private String pasatiempos		= "";
private Date fecha_de_nacimiento;

public int getId_condicionMedica() {
	return id_condicionMedica;
}

public void setId_condicionMedica(int id_condicionMedica) {
	this.id_condicionMedica = id_condicionMedica;
}

public int getId_usuario() {
	return id_usuario;
}

public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public Date getFecha_de_nacimiento() {
	return fecha_de_nacimiento;
}

public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
	this.fecha_de_nacimiento = fecha_de_nacimiento;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion() {
	Direccion = calle+" "+numero+" C.P: "+codigo_postal;
}

public String getCalle() {
	return calle;
}

public void setCalle(String calle) {
	this.calle = calle;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public int getCodigo_postal() {
	return codigo_postal;
}

public void setCodigo_postal(int codigo_postal) {
	this.codigo_postal = codigo_postal;
}

public String getLocacion() {
	return locacion;
}

public void setLocacion() {
	this.locacion = ciudad+" "+estado+" "+pais;
}

public String getCiudad() {
	return ciudad;
}
public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public String getRfc() {
	return rfc;
}
public void setRfc(String rfc) {
	this.rfc = rfc;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getCelular() {
	return celular;
}
public void setCelular(String celular) {
	this.celular = celular;
}
public String getCurp() {
	return curp;
}
public void setCurp(String curp) {
	this.curp = curp;
}
public String getOcupacion() {
	return ocupacion;
}
public void setOcupacion(String ocupacion) {
	this.ocupacion = ocupacion;
}
public String getEstado_civil() {
	return estado_civil;
}
public void setEstado_civil(String estado_civil) {
	this.estado_civil = estado_civil;
}
public String getPasatiempos() {
	return pasatiempos;
}
public void setPasatiempos(String pasatiempos) {
	this.pasatiempos = pasatiempos;
}
public void setLocacion(String locacion) {
	this.locacion = locacion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
}
