public class contador {
    int cont;

    public contador() {
    }

    public void inicializar(int n) {
        this.cont = n;
    }

    public int acessar() {
        return this.cont;
    }

    public void incrementar() {
        this.cont++;
    }

    public void decrementar() {
        this.cont--;
    }
}
