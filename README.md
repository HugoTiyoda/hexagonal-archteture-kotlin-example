# Sobre
O projeto havia sido feito em 2022 mas sinceramente havia esquecido de subir em um repo.
O projeto é um exemplo e tentativa de aprendizado de clean archteture utilizando kotlin, gradle e springBoot.

## Para rodar o projeto
gradle build para buildar o projeto. No pacote main do projeto, ao rodar a classe HexaKotlinApplication.kt, voce podera utilizar um client web para realizar um CRUD 
simples.
O controller está anotado como "/student" 

## Implementações futuras
Clean code.
Adicionar uma transparencia a estrutura do projeto. Na epoca nao sabia fazer direito
Quem sabe um MER e outras classes para fazer o relacionamento com a classe Student.

### Consideracoes sobre o projeto
A utilizacao de uma arquitetura hexagonal se torna extremamente util principalmente em microservicos isolados por conta do encapsulamento das regras de negocio por conta
da facilidade de manter testes e implementar novos adapters para quem sabe a troca de um DB ou adicao de filas e GRPC.


![image](https://user-images.githubusercontent.com/83270290/227178771-3a2732bb-0843-400f-b680-1cb79e4eaef5.png)
