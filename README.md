<h1>Gerador de QR Code</h1>

Um serviço simples e containerizado para gerar QR Codes a partir de links ou textos fornecidos pelo usuário. As imagens geradas são automaticamente enviadas e armazenadas no AWS S3, permitindo acessos diretos via URL.

## ⚙️ Funcionalidades

- Recebe uma URL (ou texto) e gera um QR Code correspondente.
- Faz upload da imagem do QR Code para um bucket no AWS S3.
- Retorna a URL pública (ou presigned) da imagem armazenada no S3.
- Pode ser executado facilmente em ambiente Docker.

## 🧪 Tecnologias utilizadas

- **Java / Spring Boot** – responsável pela API que recebe o texto/link e gera o QR Code.
- **Docker** – para empacotar e executar toda a aplicação em um container isolado.
- **AWS S3** — Armazenamento das Imagens Geradas
- **Maven** – para gerenciar dependências e build do projeto,como a ZXing para gerar os QR Codes
- **Insomnia** - para testar os endpoints da API.

## 📦 Como usar
**Pré-requisitos:**

- Docker instalado na sua máquina
- Conta AWS configurada (com permissões para criar/usar bucket S3)
- IDE devidamente configurada
- Variáveis da AWS definidas (ex: AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY, AWS_REGION, S3_BUCKET_NAME)
-  Insomnia

## 🔍​ Preview do projeto
📌​ Coloquei o site do meu github para geração do qr-code no body da requisição em formato JSON. Dando tudo certo, o programa me envia um link da aws onde a imagem gerada está armazenada:

<img width="1027" height="603" alt="Image1" src="https://github.com/user-attachments/assets/11f18c3c-d62a-4b8a-aa2b-caa33c033549" />
</br>
</br>

📌​ O link me leva à imagem, que quando scanneada me devolve o site:
</br>
</br>
<img width="300" height="603" alt="Image2" src="https://github.com/user-attachments/assets/2e42e2e8-6b41-4e79-a1fb-8a374a7fda17" />
