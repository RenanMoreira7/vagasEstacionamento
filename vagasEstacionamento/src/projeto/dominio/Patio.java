package projeto.dominio;

public class Patio {
    private Vaga[][] vagas = new Vaga[4][5];

    {
        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas[i].length; j++) {
                String nomeVaga = "" + (char) ('A' + i) + (j + 1);
                vagas[i][j] = new Vaga(nomeVaga);
            }
        }
    }

    public void imprimirVagas() {
        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas[i].length; j++) {
                Vaga vagaAtual = vagas[i][j];
                if (vagaAtual.getStatus() == false) {
                    System.out.print("[L]");
                } else {
                    System.out.print("[O]");
                }
            }
            System.out.println();
        }
    }

    public void registrarCaminhao(Caminhao caminhao) {
        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas[i].length; j++) {
                Vaga vagaLivre = vagas[i][j];
                if (vagaLivre.getStatus() == false) {
                    vagaLivre.setStatus(true);
                    vagaLivre.setCaminhaoEstacionado(caminhao);
                    System.out.println("Caminhão estacionado na vaga ");
                    return;
                }
            }
        }
    }

    public void registrarSaida(String placaProcurada) {
        for (int i = 0; i < vagas.length; i++) {
            for (int j = 0; j < vagas[i].length; j++) {
                Vaga vagaLivre = vagas[i][j];
                if (vagaLivre.getStatus() == true) {
                    Caminhao caminhaoNaVaga = vagaLivre.getCaminhaoEstacionado();
                    if (caminhaoNaVaga.getPlaca().equals(placaProcurada)){
                        vagaLivre.setStatus(false);
                        vagaLivre.setCaminhaoEstacionado(null);
                        return;
                    }
                }
            }
        }
        System.out.println("placa dp caminhão não encontrada no patio");
    }
}

