***Comandos referentes ao prompt de comando\***

**Windows** 

- **Dir =** listar 
- **cd c/ =** Base do diretório C 
- **cd nome =** Abre a pasta 
- **cd .. =** Voltar 
- **cls =** limpar a tela 
- **Tecla tab =** Autocompleta
- **mkdir + nome =** Criar uma pasta 
- **del =** Deleta arquivos da pasta 
- **rmdir =** Exclui pasta
- **Entre ><nome do arquivo. formato :** Cria um novo arquivo 
- **mv arquivo ./destino/:** Move arquivo para outra pasta 

**Linux**

- **Ls =** listar 
- **cd c/ =** Base do diretório C 
- **cd nome =** Abre a pasta
- **cd .. =** Voltar
- **clear(ctrl+) =** Limpar a tela
- **mkdir + nome =** Criar uma pasta
- **rm -rf =** Deleta arquivos da  pasta

## *[Git](https://git-scm.com/)*

**Processo chave SSH**

- **ssh-keygen -t ed25519 -C email:** Gera chaves pública e privada e demonstra o local das chaves 

- Insira uma senha pessoal 2 vezes 

- Vá aonde estão as chaves 

- De comando ls

- cat chave publica

- copie a chave pública e use no Github

- eval $(ssh-agent -S)

- Execute ls

- ssh-add chave privada

- Coloque a senha criada

  

**Comandos**

- **git init :** Criar novo repositório

- **git status :** Verifique o estado dos arquivos/diretórios

- **git add meuarquivo :** Adicionar um arquivo em específico

- **git add :** Adicionar todos os arquivos/diretórios

- **git commit meuarquivo :** Comitar um arquivo

- **git commit meuarquivo meuarquivo :** Comitar vários arquivos

- **git commit meuarquivo -m "minha mensagem" :** Comitar informando mensagem

- **git rm meuarquivo :** Remove arquivo

- **git rm -r diretorio :** Remove o diretório

- **git push -u origem main :** Enviar arquivos/diretórios para o repositório remoto "O primeiro push de um repositório deve conter o nome do repositório remoto e a filial"

- **git push :** Os demais pushes  não precisam dessa informação

- **git pull :** Atualizar  repositório local de acordo com o repositório remoto"Atualiza os arquivos na pasta atual"

- **git clone https://github.com/Alexsander-Vilar/Material-de-estudos.git :** Clonar um repositório remoto já existente

- **git remote -v :** Lista os repositorios remotos cadastrados

  ## Colocar repositorio para o GitHub

- **git remote add origin local url:** Coloca os arquivos do computador para o Github

- **git branch -m main:**

- **git push -u origin main:**

  