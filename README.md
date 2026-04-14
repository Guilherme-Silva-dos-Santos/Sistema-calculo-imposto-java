# 💰 Sistema de Cálculo de Impostos em Java

Aplicação desenvolvida em Java para cálculo de impostos como **PIS** e **IPI**, utilizando conceitos de **Programação Orientada a Objetos (POO)** como interfaces, encapsulamento e polimorfismo.

---

## 🚀 Funcionalidades

* Cadastro de múltiplos impostos
* Suporte aos impostos:

  * PIS
  * IPI
* Cálculo automático dos valores
* Listagem final com descrição e valor de cada imposto
* Estrutura preparada para expansão (novos impostos)

---

## 🧠 Conceitos aplicados

* Interface (contrato comum entre impostos)
* Polimorfismo (lista de diferentes tipos de impostos)
* Encapsulamento (uso de getters/setters)
* Organização em pacotes (boas práticas)

---

## 📂 Estrutura do projeto

```
src/
 └── br.com.impostos
      ├── main
      │     └── Main.java
      ├── model
      │     ├── Imposto.java
      │     ├── PIS.java
      │     ├── IPI.java
      │     └── Pagamentos.java
```

---

## ▶️ Como executar

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/sistema-calculo-impostos-java.git
```

2. Abra o projeto no NetBeans (ou outra IDE Java)

3. Execute a classe `Main`

---

## 🖥️ Exemplo de uso

```
Nome da empresa: Empresa X

Digite o tipo de imposto (PIS/IPI) ou 'pare':
PIS
Débito: 30000
Crédito: 16000

Digite o tipo de imposto (PIS/IPI) ou 'pare':
IPI
Valor produto: 90
Frete: 10
Seguro: 5
Outras despesas: 5
Alíquota (%): 5

Digite o tipo de imposto (PIS/IPI) ou 'pare':
pare
```

---

## 📈 Melhorias futuras

* Adição de novos impostos (ICMS, ISS, etc.)
* Interface gráfica (GUI)
* Persistência em banco de dados
* Menu interativo mais robusto

---

## 👨‍💻 Autor

Desenvolvido por **Guilherme Silva dos Santos**

