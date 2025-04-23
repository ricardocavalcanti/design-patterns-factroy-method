# 💡 Design Pattern: Factory Method (Java)

Este repositório demonstra a aplicação do padrão de projeto Factory Method com um exemplo de sistema de notificações utilizando Java puro.

---

## 🎯 Objetivo

O Factory Method define uma interface para criação de objetos, mas permite que as subclasses decidam qual classe instanciar. Ele promove:
- Baixo acoplamento entre classes;
- Maior extensibilidade (Open/Closed Principle);
- Substituição do uso de `new` por fábricas especializadas.

---

## 📁 Estrutura do Projeto

```
design-patterns-factory/
├── src/
│   └── br/
│       └── com/
│           └── pattern/
│               ├── factory/               <- Interface Notification, classes concretas e fábricas
│               ├── service/               <- Serviço que usa a factory
│               └── Main.java              <- Classe com o exemplo funcional
├── .gitignore
├── README.md
```
---

## ⚙️ Tecnologias

- Java 17
- Maven

---

## ▶️ Como executar
### Compile
- mvn compile

### Execute
- mvn exec:java -Dexec.mainClass="br.com.pattern.factory.Main"

---

## 🧪 Exemplo de saída
Enviando notificação por E-MAIL
Enviando notificação por SMS

---

## 📚 Conceitos aplicados

- Programação Orientada a Objetos

- Encapsulamento de comportamentos

- Interface como contrato

- Inversão de dependência

- Factory Pattern

- OCP (Open/Closed Principle)

---







