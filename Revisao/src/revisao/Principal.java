import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        int opcao = 0;
        Agenda clinica = new Agenda();
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:\n1 - Cadastrar Consulta\n2 - Editar Consulta\n3 - Imprimir Consulta\n4 - Imprimir Todos\n0 - Sair"));
        switch (opcao) {
            case 1:
                clinica.cadastrarPaciente();
                break;
            case 2:
                clinica.listarPacientes();
                break;
            case 3:
                clinica.excluirPaciente();
                break;
            case 4:
                clinica.metodosAgenda();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
        }
        // MENU 4 METODOS AGENDA
        // Scannet leitor = new Scanner (System.in)
        // JOptionPane.showInputDialog("Digite...");
    }
}
