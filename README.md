# 🎬 Projeto Java - Catálogo de Filmes e Séries com API OMDb

## 🔖 Sobre o projeto  
Este projeto foi desenvolvido como exercício prático de **consumo de APIs REST** e **orientação a objetos em Java**, com base na formação da plataforma [Alura](https://www.alura.com.br/).

A aplicação simula um sistema de organização de filmes e séries, permitindo a busca de dados na [API pública OMDb](https://www.omdbapi.com/), além de funcionalidades como avaliação, recomendação e cálculo de tempo total de maratona.

A resposta da API é convertida em objetos Java e os dados são armazenados em um arquivo `.json`.

---

## 🎯 Funcionalidades

✔️ Permite ao usuário:
- Buscar **filmes e séries** pelo nome na OMDb API  
- Armazenar os resultados em uma lista  
- Exibir informações como título, ano e duração  
- Avaliar e recomendar títulos com base em regras simples  
- Calcular tempo total de visualização  
- Ordenar e salvar os dados em um arquivo `.json` estruturado

---

## 🧠 Técnicas e conceitos utilizados

✅ Consumo de APIs REST com `java.net.http.HttpClient`  
✅ Requisições HTTP GET com `HttpRequest` e `HttpResponse`  
✅ Desserialização e serialização de JSON com a biblioteca `Gson`  
✅ Escrita de arquivos JSON com `FileWriter`  
✅ Modelagem com `record` e classes  
✅ Princípios de orientação a objetos (herança, polimorfismo, encapsulamento)  
✅ Uso de interfaces e exceções personalizadas  
✅ Manipulação de listas e ordenações com `ArrayList` e `Collections.sort`

---

## 🚀 Tecnologias e ferramentas

- Java 17+
- IntelliJ IDEA
- Gson (Google JSON)
- Git e GitHub
- API pública [OMDb](https://www.omdbapi.com/)

---

## 📂 Organização do Projeto

```
src/
├── br/com/alura/screenmatch/
│ ├── calculos/
│ │ ├── CalculadoraDeTempo.java
│ │ ├── Classificavel.java
│ │ └── FiltroRecomendacao.java
│ ├── excecao/
│ │ └── ErroDeConversaoException.java
│ ├── modelos/
│ │ ├── Filme.java
│ │ ├── Serie.java
│ │ ├── Episodio.java
│ │ ├── Titulo.java
│ │ └── TituloOmdb.java
│ └── principal/
│ ├── Principal.java
│ ├── PrincipalComBusca.java
│ └── PrincipalComListas.java
```

---

## 📄 Exemplo de saída JSON

```json
{
  "titulo": "The Matrix",
  "anoDeLancamento": 1999,
  "duracaoEmMinutos": 136
}
```

---

## 📁 Arquivo gerado

Após a execução da aplicação, será criado um arquivo `filmes.json`, contendo os dados estruturados dos títulos buscados via OMDb.

---

✍️ **Autor**  
**Vinícius Alves Dias**

Projeto desenvolvido com fins educacionais, com base nas aulas da plataforma [Alura](https://www.alura.com.br/), como prática em consumo de APIs, orientação a objetos e manipulação de JSON com Java.

---
