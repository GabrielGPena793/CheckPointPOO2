# CheckPointPOO2

### Aplicativo de tatuagem

  O tatuador já possui um site onde mostra seu trabalho,  e ele decidiu fazer também um aplicativo para poder gerenciar seus clientes e melhorar o acesso que os clientes tem com o trabalho dele.

  Ele pede para que no aplicativo tenha um agendamento para os clientes marcarem as tatuagens com ele, nesse agendamento contenha os detalhes de orçamento de cada tatuagem e os dados do cliente.

  Para isso o **cliente** tem que informar **email, senha, nome, sobrenome, gênero e idade** para se cadastrar e fazer login no aplicativo**,** o **aplicativo** tem que registrar o **agendamento, conter os dados do cliente  e dados do orçamento**, e a **tatuagem** tem um **tamanho, tipo da tatuagem e um preço padrão de acordo com o tamanho:**

- **preço padrão:**
pequena R$80,00;
média  R$150,00;
grande R$ 350,00;

Sendo que para os tipos de tatuagem **tribal, new school e old school cada tipo vai ter um preço diferente do preço padrão de acordo com o tamanho:**

- **Preço Tribal:**
pequena vai ser 2 vezes o preço padrão;
média vai ser 3 vezes o preço padrão;
grande vai ser 4 vezes o preço padrão;
- **Preço New school:**
pequena vai ser o preço padrão mais 50 reais ;
média vai  ser o preço padrão mais 100 reais;
grande vai  ser o preço padrão mais 150 reais;
- **Preço Old School:**
pequena vai ser o preço padrão mais 25 reais ;
média vai  ser o preço padrão mais 75 reais;
grande vai  ser o preço padrão mais 120 reais;

## Diagrama
![CheckPoint- POO](https://user-images.githubusercontent.com/86542760/144125784-8d766ff7-97be-491d-9188-a04a2d08cf87.png)

### Notas de observação
- Coloquei novas classes para delegar a responsabilidade de cada parte no meu código em suas devidas classes.
- Imagiando em um app, criei as telas de Exibição começando com a tela inicial, tela de menu e a partir do menu o usuário vai ter duas opões de escolha se vai para tela de perfil ou para tela de agendamento.
- A responsabilidade das telas de exibição é apenas exibir as opções para o cliente e a partir das decições que o cliente fizer, será chamado a função de outra classe que é responsavel por fazer o serviço escolhido
- Os serviços é onde acontecem todo funcionamento do aplicativo, e cada serviço está separado de acordo com suas responsabilidades, como serviços de login, serviços de agendamento, serviços de perfil e serviços da tataugem.
- E por fim dexei as entidades com a unica responsabilidade de forner os dados nescessários para funcionar o aplicativo.

### Script do Código

1 - No main execute o código

2 - Irá abrir um Menu no console, onde tudo irá acontecer!

3 - Irá aparecer a tela de login, onde você **só consegue logar, se antes se cadastrar**

4 - Depois de logar irá para o menu, onde irá te fornecer as opções de fazer agendamento ou ver o seu perfil

5 - Caso escolha fazer o agendamento, irá para tela de agendamento

6 - No Menu do agendamento você porderá realizar o agendamento e ver os detalhes do agendamento, caso tente ver os detalhes sem antes ter agendado irá notificar que você não tem uma agendamento.

7 - Caso escolha ver o seu perfil, irá pra tela de perfil

8 - No Menu do perfil você poderá alterar os dados do seu perfil ou ver os detalhes do perfil

9 - Por fim para sair do aplicativo é só escolher a opção 3 em todas etapas que o app irá encerrar
