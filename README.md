# projetoCalculadoraSimplesJava
Projeto  aplicado nas aulas de desenvolvimento JOVENS PROGRAMADORES


Logo após Defina do Projeto como: Calculadora Simples e desmarque a opção Criar Classe Principal conforme
a figura abaixo:

<img src="https://caiomalheiros.files.wordpress.com/2015/04/03.png" alt="HTML tutorial" width="700" height="400" />

Depois de criar o projeto, chegou a hora de criarmos nosso Formulário JFrame (conhecido por muitos como telinha).
Para criar basta clicar com o Botão Direito do Mouse em cima do Projeto, escolher a opção Novo -> Form JFrame

<img src="https://caiomalheiros.files.wordpress.com/2015/04/04.png" alt="HTML tutorial" width="700" height="400" />

Defina o Nome da Classe (nome do JForm) para : FrmCalculadora conforme abaixo:

<img src="https://caiomalheiros.files.wordpress.com/2015/04/05.png" alt="HTML tutorial" width="700" height="400" />


Agora chegou a hora que a maioria gosta, a hora de criar a Interface da nossa Calculadora.

Se você está começando a usar o Netbeans, você irá perceber que ele possui um sistema de
organização (layout) dos objetos automáticos, que por sinal eu não consigo me adaptar.

Nesse sistema conforme você coloca um componente na tela, ele organiza para você. Se você
é como eu e não se adaptar, basta clicar com o botão direito no Form->Definir Layout e escolher a opção
Layout Absoluto:


<img src="https://caiomalheiros.files.wordpress.com/2015/04/06.png?w=900&h=539" alt="HTML tutorial" width="700" height="400" />


Legal, agora vamos começar a criar nossa tela,  para começar escolha a ferramenta Label na paleta Controles Swing (hummmmmm Swing)
e crie 3 labels referente a Valor1, Valor2 e Total. Para editar o texto do Label basta clicar com o botão direito em cima e ir em Editar Texto

<img src="https://caiomalheiros.files.wordpress.com/2015/04/07.png?w=900&h=486" alt="HTML tutorial" width="700" height="400" />

Utilizando a essa mesma Técnica Ninja, crie 3 Campos de Texto para que o usuário informe o
Valor1, Valor2. Já o total o usuário não será necessário inserir né!


<img src="https://caiomalheiros.files.wordpress.com/2015/04/13.png" alt="" width="700" height="400" />

Agora vamos criar um Painel com as Operações da nossa Calculadora. Para criar um
Painel e colocar uma Borda de Titulo basta selecionar e ir em Border no painel de Propriedades

<img src="https://caiomalheiros.files.wordpress.com/2015/04/10.png?w=900&h=386" alt="HTML tutorial" width="700" height="400" />


<img src="https://caiomalheiros.files.wordpress.com/2015/04/11.png" alt="HTML tutorial" width="700" height="400" />


Pois bem jovem gafanhoto, agora crie os botões dentro desse painel com as operações.
Lembrando que para alterar o texto do botão, você também clica com o direito e escolhe Editar Texto


<img src="https://caiomalheiros.files.wordpress.com/2015/04/12.png?w=900&h=277" alt="HTML tutorial" width="700" height="400" />


Se tudo deu certo até aqui, seu formulário deve ficar igual ao meu abaixo:
Com um só detalhe, eu coloquei mais 2 botões (Botão limpar e botão sair).


<img src="https://caiomalheiros.files.wordpress.com/2015/04/13.png" alt="HTML tutorial" width="700" height="400" />

Brincando um pouco com as Propriedade Font de cada componente eu deixei mais ou menos assim:

<img src="https://caiomalheiros.files.wordpress.com/2015/04/14.png" alt="HTML tutorial" width="700" height="400" />


Beleza! Agora nossa missão é alterar os Nomes das Variáveis... de cada componente conforme abaixo.
Para fazer isso é muito simples, basta clicar com o direito e escolher Alterar o Nome da Variável de cada componente:


<img src="https://caiomalheiros.files.wordpress.com/2015/04/15.png" alt="HTML tutorial" width="700" height="400" />

<img src="https://caiomalheiros.files.wordpress.com/2015/04/16.png" alt="HTML tutorial" width="700" height="400" />



Deixe cada componente com os seguinte nomes:

<img src="https://caiomalheiros.files.wordpress.com/2015/04/17.png" alt="HTML tutorial" width="700" height="400" />

Depois de atribuir os nomes, vamos a parte mais divertida, aaaaa Programação!
Nesse projeto vamos programar no Evento ActionPerfomed de cada botão.

Vamos começar com o botão Somar (+). Para isso clique com o direito em cima do botão
navegue até Eventos>Action>actionPerfomed



<img src="https://caiomalheiros.files.wordpress.com/2015/04/17.png" alt="HTML tutorial" width="700" height="400" />

Um detalhe, aproveitando que está no Código da Aplicação, navegue até a parte Superior do código e crie
as variavies n1, n2 e total logo abaixo do Public Class FrmCalculadora. Pois criando nessa área
todos os botões terão acesso a elas.


<img src="https://caiomalheiros.files.wordpress.com/2015/04/18.png?w=900&h=616" alt="HTML tutorial" width="700" height="400" />

Agora programe o botão Somar conforme abaixo:

Dica Marota! O Double.parseDouble tem função de converter uma String para Double!
Já o  String.valueOf faz o processo inverso, ou seja, converte de Double para String.


<img src="https://caiomalheiros.files.wordpress.com/2015/04/20.png" alt="HTML tutorial" width="700" height="400" />

Agora ficou fácil né, basta repetir o processo para todos os botões alterando somente a operação:

Código do botão Subtrair:


<img src="https://caiomalheiros.files.wordpress.com/2015/04/21.png" alt="HTML tutorial" width="700" height="400" />


Código do botão Dividir:


<img src="https://caiomalheiros.files.wordpress.com/2015/04/22.png" alt="HTML tutorial" width="700" height="400" />

Código do botão Multiplicar:

<img src="https://caiomalheiros.files.wordpress.com/2015/04/23.png" alt="HTML tutorial" width="700" height="400" />


Código do botão Limpar!



<img src="https://caiomalheiros.files.wordpress.com/2015/04/24.png" alt="HTML tutorial" width="700" height="400" />


Código do botão Sair!


<img src="https://caiomalheiros.files.wordpress.com/2015/04/25.png" alt="HTML tutorial" width="700" height="400" />

Agora se tudo der certo, pressione as teclas SHIT + F6 e teste sua Calculadora!






























































































