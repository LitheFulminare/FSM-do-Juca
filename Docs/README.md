# FSM - Máquina de Estados Finitos

## Overview dos projetos
Este repositório contém os programas para as tarefas envolvendo Máquina de Estados Finitos.
As 3 branches têm uma versão diferente desses programas.


### [Branch main](https://github.com/LitheFulminare/FSM-do-Juca/tree/main)

Nossa própria versão da FSM, com 2 agentes rodando simultaneamente cada um com sua própria FSM independente uma da outra e seguindo o State Pattern.

Uma pasta [Docs](https://github.com/LitheFulminare/FSM-do-Juca/tree/main/Docs) está disponível nessa branch com um PDF que descreve esse programa mais a fundo.


### [Branch state-pattern](https://github.com/LitheFulminare/FSM-do-Juca/tree/state-pattern)

Versão refatorada da FSM do Juca seguindo o State Pattern.


### [Branch switch-statement](https://github.com/LitheFulminare/FSM-do-Juca/tree/switch-statement)

Versão original da FSM do Juca usando switches e enumerators para controle da máquina de estado.

## Instruções

### Como rodar e baixar

Todos os 3 programas foram desenvolvidos usando Java. Os arquivos necessários estão em FSM/src. Compile o código e rode o arquivo main.java

O output no console reflete o que cada agente está fazendo no momento e o valor atual das variáveis que controlam a transição entre os estados

# Descrição da FSM dos guardas (main branch)

O programa simula o comportamento de dois guardas patrulhando um determinado local. O PDF na pasta [Docs](https://github.com/LitheFulminare/FSM-do-Juca/tree/main/Docs) descreve com mais detalhes.

## Agente Patrol Guard
O PatrolGuard tem como rota ir da Entrada para a Área B, retornar para a Entrada, depois ir para a Área D. Então repete.

## Agente Camera Guard
O CameraGuard altera entre checar a Câmera A e a Câmera B, cada estado durando três "ticks" ou chamadas do método update()

## Estrutura do código

O programa segue o State Pattern, o que significa que cada estado é uma classe. Além disso, cada estado herda uma classe abstrata que recebe um tipo genérico. Esses estados então são gerenciados por um agente, uma classe que implementa a interface Character. Ná prática isso significa que o código é altamente reutilizável para os mais diversos agentes.
