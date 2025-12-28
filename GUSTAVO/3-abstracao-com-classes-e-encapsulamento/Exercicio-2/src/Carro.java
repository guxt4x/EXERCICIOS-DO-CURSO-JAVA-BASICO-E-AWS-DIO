public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marchas;

    public Carro(boolean ligado, int velocidade, int marchas) {
        this.ligado = ligado;
        this.velocidade = velocidade;
        this.marchas = marchas;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado!");
    }
    
    public void desligar() {
        this.ligado = false;
        this.velocidade = 0;
        this.marchas = 0;
        System.out.println("Carro desligado!");
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
        System.out.println("Marcha atual: " + this.marchas);
    }

    public void acelerar(int incremento) {
        if (!this.ligado) {
            System.out.println("O carro está desligado. Não é possível acelerar.");
            return;
        }
        if (this.marchas == 0) {
            System.out.println("O carro está em ponto morto. Não é possível acelerar.");
            return;
        }
        int novaVelocidade = this.velocidade + incremento;
        int velocidadeMaximaMarcha = this.marchas * 20;
        if (novaVelocidade <= velocidadeMaximaMarcha) {
            this.velocidade = novaVelocidade;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima para a marcha " + this.marchas + " é " + velocidadeMaximaMarcha + " km/h.");
        }
    }

    public void frear(int decremento) {
        if (this.ligado && this.velocidade > 0) {
            this.velocidade -= decremento;
            if (this.velocidade < 0) {
                this.velocidade = 0;
            }
            atualizarMarcha();
            System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado ou parado. Não é possível frear.");
        }
    }

    private void atualizarMarcha() {
        if (this.velocidade == 0) {
            this.marchas = 0;
        } else if (this.velocidade <= 20) {
            this.marchas = 1;
        } else if (this.velocidade <= 40) {
            this.marchas = 2;
        } else if (this.velocidade <= 60) {
            this.marchas = 3;
        } else if (this.velocidade <= 80) {
            this.marchas = 4;
        } else if (this.velocidade <= 100) {
            this.marchas = 5;
        } else {
            this.marchas = 6;
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (this.ligado) {
            if (novaMarcha >= 0 && novaMarcha <= 6) {
                this.marchas = novaMarcha;
                System.out.println("Marcha trocada para: " + this.marchas);
            } else {
                System.out.println("Marcha inválida. Escolha entre 0 e 6.");
            }
        } else {
            System.out.println("O carro está desligado. Não é possível trocar de marcha.");
        }
    }

    public void virar(String direcao) {
        if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Virando para " + direcao + "...");
        } else {
            System.out.println("Velocidade inadequada para virar. Deve estar entre 1 e 40 km/h.");
        }
    }
}