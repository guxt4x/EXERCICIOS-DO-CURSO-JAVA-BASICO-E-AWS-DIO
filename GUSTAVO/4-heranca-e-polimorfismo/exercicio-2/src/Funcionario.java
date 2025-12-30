public class Funcionario {
    private String nome;
    private String Email;
    private String senha;
    private String Relatorio;
    private boolean admin = true;

    public Funcionario(boolean admin, String relatorio, double quantidadeDeVendas, String senha, String email, String nome) {
        this.admin = admin;
        this.senha = senha;
        Email = email;
        this.nome = nome;
        this.Relatorio = relatorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getRelatorio() {
        return Relatorio;
    }
    public void consultarVendas(){
        System.out.println("Consultando vendas...");
    }

    public String login;
}
