package gestao;
public class Empresa {
    private String nome;
    private String razaoSocial;
    private String empCnpj;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getEmpCnpj() {
        return empCnpj;
    }
    public void setEmpCnpj(String cnpj) {
        this.empCnpj = cnpj;
    }
}
