import java.util.ArrayList;

public class Agenda implements InterfaceAgenda {
    private ArrayList<Consulta> agendaMedica; // Corrigido "prvate" para "private"

    public Agenda() {
        agendaMedica = new ArrayList<>();
    }

    @Override
    public void cadastrarAgenda(Consulta consulta) {
        agendaMedica.add(consulta);
    }

    @Override
    public void editarConsulta(int codigo, Consulta consulta) {
        agendaMedica.set(codigo, consulta);
    }

    @Override
    public void imprimirTodos() {
        for (Consulta c : agendaMedica){
            System.out.println("Paciente: " + c.getPaciente().getNome());
            System.out.println("Especialista: " + c.getEspecialista().getNome());
            System.out.println("Horario: " + c.getHorario());
        }
    }

    @Override
    public void imprimirConsulta(int codigo){
        Consulta c = agendaMedica.get(codigo);
        System.out.println("Paciente: " + c.getPaciente().getNome()); 
        System.out.println("Especialista: " + c.getEspecialista().getNome());
        System.out.println("Horario: " + c.getHorario());

        // ou

        System.out.println("Paciente: " + agendaMedica.get(codigo).getPaciente().getNome());
    }
}