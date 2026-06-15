# Sistema de Gestão de Pátio

Sistema backend desenvolvido em Java para gerenciamento de vagas em um pátio de logística. O projeto aplica conceitos fundamentais de Programação Orientada a Objetos (POO) para simular o controle de entrada e saída de caminhões utilizando uma matriz bidimensional de objetos.

## Funcionalidades

* **Mapeamento do Pátio:** Inicialização automática de uma grade de 20 vagas (4 fileiras de 5 colunas), nomeadas dinamicamente (A1, A2, B1, etc.).
* **Registro de Entrada:** Busca automatizada pela primeira vaga disponível, alteração de status e vinculação do veículo à vaga.
* **Registro de Saída:** Busca de veículos via placa, desvinculação do caminhão e liberação do espaço físico.
* **Monitoramento em Tempo Real:** Impressão do mapa do pátio no console, indicando visualmente vagas Livres `[ L ]` e Ocupadas `[ O ]`.

## Tecnologias Utilizadas

* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos (Encapsulamento, Associação de Classes, Modificadores de Acesso).
* **Estruturas de Dados:** Arrays Multidimensionais (Matrizes).

## Estrutura do Projeto

O código-fonte está organizado da seguinte forma:

- `src/projeto/dominio/`: Contém as classes de modelo e regras de negócio.
    - `Caminhao.java`: Representa a entidade do veículo (placa, modelo, motorista).
    - `Vaga.java`: Representa o espaço físico, controlando seu status de ocupação e o veículo estacionado.
    - `Patio.java`: O core do sistema. Gerencia a matriz de vagas e expõe os métodos de negócio (`registrarEntrada`, `registrarSaida`, `imprimirVagas`).
- `src/projeto/test/`: Contém a camada de execução.
    - `ProjetoTest.java`: Classe principal (`main`) contendo cenários de teste simulados (mocking) para validar a lógica de negócio.

## Como Executar

1. Clone este repositório em sua máquina local.
2. Abra o projeto em sua IDE de preferência (IntelliJ IDEA, Eclipse, VSCode).
3. Navegue até o diretório `src/projeto/test/`.
4. Execute o método `main` da classe `ProjetoTest.java`.
5. Acompanhe as saídas e as atualizações do mapa do pátio diretamente no console da IDE.
