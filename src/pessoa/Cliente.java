package pessoa;

public class Cliente {
    private String nome;
    private String endereco;
    private String rua;
    private String numero;
    private String cpf;
    private String cnpj;
    private String razaoSocial;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String toString() {
        return "Cliente [nome=" + nome + ", endereco=" + endereco + ", rua=" + rua + ", numero=" + numero + ", cpf=" + cpf
                + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + "]";
    }
    
}
