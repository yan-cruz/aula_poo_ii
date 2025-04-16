public class Paciente extends Pessoa{
    private Data dataNascimento;
    private String sexo, planoSaude;

    public Paciente(){
        dataNascimento = new Data();
        planoSaude = "";
        sexo = "";
    }

    public Paciente(Data dataNascimento, String planoSaude){
        this.dataNascimento = dataNascimento;
        this.planoSaude = planoSaude;
        sexo = "";
    }

    public Data getDataNascimento(){
        return dataNascimento;
    }

    public Data getPlanoSaude(){
        return planoSaude;
    }

    public String getSexo(){
        return sexo;
    }

}