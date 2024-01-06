package algoritmosavancados;

public class ListaAlunos {

    static final int QUANTIDADE_LISTA = 5;

    Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

    int tamLista = 0;

    Aluno obter(int indice) {
        return lista[indice];
    }

    int tamanho() {
        return tamLista;
    }

    void adicionar(Aluno aluno) {
        if (tamLista == lista.length) {
            Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];

            for (int i = 0; i < lista.length; i++) {
                novaLista[i] = lista[i];
            }

            lista = novaLista;
        }

        lista[tamLista] = aluno;
        tamLista++;
    }

    void remover(Aluno aluno) {
        for (int i = 0; i < tamLista; i++) {
            Aluno a = lista[i];

            if (a != null && a.equals(aluno)) {
                remover(i);
                break;
            } else if (a == null && aluno == null) {
                remover(i);
                break;
            }
        }
    }

    void remover(int indice) {
        int indiceInicial = indice + 1;

        for (int i = indiceInicial; i < tamLista; i++) {
            lista[i - 1] = lista[i];
        }

        tamLista--;
        lista[tamLista] = null;
    }

    void ordenar() {
        for (int i = 1; i < tamLista; i++) {
            Aluno alunoPosicaoBase = lista[i];

            int indicePosicaoBase = i;

            while (indicePosicaoBase > 0) {
                int indicePosicaoAnterior = indicePosicaoBase - 1;
                Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];

                Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null
                        || alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);

                if (alunoPosicaoAnteriorVemDepoisDe) {
                    lista[indicePosicaoBase] = lista[indicePosicaoAnterior];

                    indicePosicaoBase--;
                } else {
                    break;
                }
            }

            lista[indicePosicaoBase] = alunoPosicaoBase;
        }
    }
}
