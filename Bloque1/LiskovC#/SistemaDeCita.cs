public class SistemaDeCita
{

    private List<Cita> cita = new List<Cita>{}

    public void AgregarCita(Cita cita)
    {
        cita.Add(cita);
    }

    public void ProcesarCita()
    {
        foreach (var cita in cita)
        {
            if (cita is IVerificable verificable)
            {
                
            }
        }
    }

}