package projeto.test;

import projeto.dominio.Caminhao;
import projeto.dominio.Patio;

public class ProtejoTest {
    static void main() {
        Patio patio = new Patio();

        patio.imprimirVagas();

        Caminhao c1 = new Caminhao("ABC-1234", "Carlos", "Volvo FH");
        Caminhao c2 = new Caminhao("XYZ-9876", "Ana", "Scania");
        Caminhao c3 = new Caminhao("QWE-1111", "João", "Mercedes");

        patio.registrarCaminhao(c1);
        patio.registrarCaminhao(c2);
        patio.registrarCaminhao(c3);

        patio.imprimirVagas();

        patio.registrarSaida("XYZ-9876");
        patio.registrarSaida("CCC-656");

        patio.imprimirVagas();
    }
}
