public class cliente {

    String nome;
    String endereco;
    int numero;

    public cliente(String nome, String endereco, int numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", endereco='" + getEndereco() + "'" + ", numero='" + getNumero()
                + "'" + "}";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getNumero() {
        return this.numero;
    }

    public void deletarPessoa() {
        this.nome = "";
        this.endereco = "";
        this.numero = 0;
    }

}
