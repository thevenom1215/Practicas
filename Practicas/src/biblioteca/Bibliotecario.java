package biblioteca;
import interactores.Persona;
import java.time.Clock;
public class Bibliotecario extends Persona {
protected int numeroEmpleado;
private String turno;
private Clock horaEntrada;
private Clock horaSalida;
}
