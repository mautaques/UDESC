package dados;

import dados.Pessoa;

public class Grupo {

        private Pessoa[] pessoas = new Pessoa[3];
        private int numeroPessoas = 0;

        public Pessoa[] getPessoas() {
            return pessoas;
        }

        public void setPessoas(Pessoa p) {
            if(this.numeroPessoas < 3){
                pessoas[this.numeroPessoas] = p;
                this.numeroPessoas++;
            }
        }

        public void ordena(){
            for (int i = 0 ; i < 3 ; i++) {
                for (int j = i + 1 ; j < 3 ; j++) {
                    if(this.pessoas[j].calculaImc() > this.pessoas[i].calculaImc()) {
                        Pessoa aux = this.pessoas[j];
                        this.pessoas[j] = this.pessoas[i];
                        this.pessoas[i] = aux;
                    }
                }
            }
        }

        public int getNumeroPessoas() {
            return numeroPessoas;
        }

        public void setNumeroPessoas(int numeroPessoas) {
            this.numeroPessoas = numeroPessoas;
        }
}
