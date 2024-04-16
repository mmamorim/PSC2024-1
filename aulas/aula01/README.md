<img src="/assets/teste.svg" width="100%">

>❝ Sempre desejei que o meu computador fosse tão fácil de usar como o meu telefone. O meu desejo realizou-se. Já não sei usar o meu telefone ❞
> <div align="right"><b>Bjarne Stroustrup</b>, criador da linguagem C</div> 


Orientação à objetos é um paradigma de programação, isto é, uma forma ou estilo de programar. Basicamente, este modelo de programação utiliza o conceito de objetos para agrupar as informações e operações de entidades abstratas objetivando a solução de problemas. Assim, dizemos que uma linguagem é orientada a objetos quando ela disponibiliza recursos linguísticos que favorecem a implementação de programas usando este estilo de programação. Com isso, podemos de certa forma tratar as linguagens como ferramentas de implementação deste modelo de programação, sendo algumas delas mais apropriadas para a construção de programas neste estilo, e outras menos. 

Este material está inserido em um contexto no qual os alunos estão aprendendo algoritmos e programação por meio da Unidade Curricular denominada **Programação de soluções computacionais** que introduz os aspectos fundamentais de implementação de programas  sendo utilizado a linguagem Java como ferramenta de implementação dos conceitos de Orientação a Objetos.

Assim, se faz necessário apresentar alguns detalhes e pricípios básicos da linguagem antes de aprender o novo paradigma. 

Este texto apresenta um breve resumo da sintaxe, tipos de dados, operadores, comandos básicos, estruturas linguísticas, convenções de código e características tecnológicas oferecidas pela Linguagem de programação Java. 

### Conceito de Máquina Virtual Java

<p align="justify">
Algumas linguagens de programação, como por exemplo, C e Rust, compilam seus programas fontes para uma plataforma e um sistema operacional específico. O código binário gerado pela compilação é então executado pelo sistema operacional nativo para qual ele foi compilado. Isto é, este código executável poderá ser apenas executado neste sistema operacional. Para que o mesmo programa funcione em outro sistema operacional é necessário compilar o código fonte novamente utilizando um compilador adequado para este novo sistema
em questão.
</p>

O Java adota um conceito de máquina virtual que adiciona uma camada
extra entre o sistema operacional e a aplicação. Esta camada é responsável
por executar o código Java compilado, interpretando os comandos em chamadas do
sistema operacional no qual está rodando no momento. A Máquina Virtual Java
ou \realce{Java Virtual Machine (JVM)} é responsável pela interpretação dos
\realce{bytecodes} \footnote{Bytecode é o termo dado ao código binário gerado
pelo compilador Java.}.