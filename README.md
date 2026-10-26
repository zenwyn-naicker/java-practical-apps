# Java Practical Apps

Two Java console applications: a student records manager and a simulated cryptocurrency wallet and exchange. Together they cover collections, input validation, inheritance with abstract classes, and unit testing with JUnit.

Built for PROG6112 at Emeris Durban North (2024).

## Applications

### Student Records

A menu-driven app for capturing and managing student details.

- Capture students with ID, name, age, email and course, with validation (age 16 or older, email must contain `@`).
- Search for a student by ID, delete a student after confirmation, and print a report of all students.
- Records are held in `ArrayList`s for the session.

### Crypto Wallet

A simulated exchange for Bitcoin and Ethereum wallets.

- Create Bitcoin and Ethereum wallets, then deposit, withdraw, check balances and print transaction statements.
- `Wallet` is an abstract base class, with `BitcoinWallet` and `EthereumWallet` implementing its deposit, withdraw and balance operations.
- The `Exchange` class stores wallets and looks them up by wallet address.

This is an educational simulation and does not connect to any real network.

## Tech stack

| Area | Technologies |
| --- | --- |
| Language | Java 21 |
| Testing | JUnit 5 |
| IDE | Apache NetBeans (Ant projects) |

## Getting started

### Prerequisites

- JDK 21

### Run locally

From the repository root:

```bash
mkdir -p build/student-records build/crypto-wallet
javac -d build/student-records student-records/src/studentrecords/*.java
javac -d build/crypto-wallet crypto-wallet/src/cryptowallet/*.java
```

```bash
java -cp build/student-records studentrecords.StudentRecordsApp
```

```bash
java -cp build/crypto-wallet cryptowallet.CryptoWalletApp
```

Each folder can also be opened as a project in Apache NetBeans.

## Testing

```bash
javac -cp lib/junit-platform-console-standalone-1.6.0.jar:build/student-records -d build/student-records student-records/test/studentrecords/*.java
java -jar lib/junit-platform-console-standalone-1.6.0.jar --class-path build/student-records --scan-class-path
```

Use the same commands with `crypto-wallet` and `cryptowallet` for the wallet tests. There are 5 tests for Student Records and 14 for Crypto Wallet. On Windows, use `;` instead of `:` between classpath entries.

## Project structure

```text
student-records/   Student Records app and tests (NetBeans project)
crypto-wallet/     Crypto Wallet app and tests (NetBeans project)
lib/               JUnit console launcher shared by both projects
```

## Acknowledgements

Tutorials and documentation used in these apps are credited in comments in the source files.
