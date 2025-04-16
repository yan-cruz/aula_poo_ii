public class Consulta {
    private int codigo;
    private Data data;
    private Paciente paciente;
    private Profissional especialista;
    private String horario, descricaoSintomas, prescricao;

    public Consulta(){
        codigo = 0;
        data = new Data();
        paciente = new Paciente();
        especialista = new Profissional();
        horario = "";
        descricaoSintomas = "";
        prescricao = "";
    }

    public Consulta(int codigo, Data data, Profissional especialista){
        this.codigo = codigo;
        this.data = data;
        this.especialista = especialista;
        paciente = new Paciente();
        horario = "";
        descricaoSintomas = "";
        prescricao = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profissional getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Profissional especialista) {
        this.especialista = especialista;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricaoSintomas() {
        return descricaoSintomas;
    }

    public void setDescricaoSintomas(String descricaoSintomas) {
        this.descricaoSintomas = descricaoSintomas;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
}
