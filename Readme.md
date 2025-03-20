<div id="top">

<!-- HEADER STYLE: CLASSIC -->
<div align="center">

<img src="https://assets.dio.me/n-qUDWOjfvxZrZ86D00DSUTwDe3LuQEdUL4y-5yGryA/f:webp/h:120/q:80/L3RyYWNrcy8xNTliNTRkMS1iYmY0LTRmNzItYTcxNy02OTM5OGE3YWE2ODMucG5n" width="30%" style="position: relative; top: 0; right: 0;" alt="Project Logo"/>

# API-UPGRADE

<em></em>

<!-- BADGES -->
<img src="https://img.shields.io/github/license/gsmereka/api-upgrade?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
<img src="https://img.shields.io/github/last-commit/gsmereka/api-upgrade?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/gsmereka/api-upgrade?style=default&color=0080ff" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/gsmereka/api-upgrade?style=default&color=0080ff" alt="repo-language-count">

<!-- default option, no dependency badges. -->


<!-- default option, no dependency badges. -->

</div>
<br>

---

## Table of Contents

- [Table of Contents](#table-of-contents)
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
    - [Project Index](#project-index)
- [Getting Started](#getting-started)
    - [Installation](#installation)
    - [Usage](#usage)
    - [Testing](#testing)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

---

## Overview

This project is part of the **Decola Tech 2025** bootcamp, a collaboration between [DIO](https://www.dio.me/), [Avanade](https://www.avanade.com/). The bootcamp aims to equip participants with essential skills in full-stack development using **Spring Boot** and **Angular**, as well as foundational knowledge in **Artificial Intelligence** and **Azure** for efficient deployment. Upon completion, participants have the opportunity to apply for paid internships at Avanade.

Throughout the bootcamp, I enhanced and experimented with the API developed using **Java Spring Boot**. As part of the learning process, I migrated the project from **Gradle** to **Maven** and added tests for the **User Repository**, along with implementing the **User Service** tests.

The original API repository learned during the course can be found here: [Santander Dev Week 2023 API](https://github.com/digitalinnovationone/santander-dev-week-2023-api).

---

# Features

- **Migration to Maven**: Transitioned the project build system from Gradle to Maven for improved dependency management and build consistency.
- **User Repository Tests**: Developed unit tests to ensure the reliability and correctness of the User Repository.
- **User Service Implementations**: Created service layer implementations to handle business logic related to user operations.

---

# Technologies Used

- **Java 17**: Utilized the latest LTS version of Java to leverage its robust features and performance improvements.
- **Spring Boot 3**: Employed the newest version of Spring Boot to maximize developer productivity through its powerful autoconfiguration capabilities.
- **Spring Data JPA**: Simplified data access layer by integrating with SQL databases using Spring Data JPA.
- **OpenAPI (Swagger)**: Implemented API documentation using OpenAPI (Swagger) for clear and interactive API specifications.

---

## Project Structure

```sh
└── api-upgrade/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```

### Project Index

<details open>
    <summary><b><code>API-UPGRADE/</code></b></summary>
    <!-- __root__ Submodule -->
    <details>
        <summary><b>__root__</b></summary>
        <blockquote>
            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                <code><b>⦿ __root__</b></code>
            <table style='width: 100%; border-collapse: collapse;'>
            <thead>
                <tr style='background-color: #f8f9fa;'>
                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                    <th style='text-align: left; padding: 8px;'>Summary</th>
                </tr>
            </thead>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/pom.xml'>pom.xml</a></b></td>
                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                </tr>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/mvnw'>mvnw</a></b></td>
                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                </tr>
                <tr style='border-bottom: 1px solid #eee;'>
                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/mvnw.cmd'>mvnw.cmd</a></b></td>
                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                </tr>
            </table>
        </blockquote>
    </details>
    <!-- src Submodule -->
    <details>
        <summary><b>src</b></summary>
        <blockquote>
            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                <code><b>⦿ src</b></code>
            <!-- test Submodule -->
            <details>
                <summary><b>test</b></summary>
                <blockquote>
                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                        <code><b>⦿ src.test</b></code>
                    <!-- java Submodule -->
                    <details>
                        <summary><b>java</b></summary>
                        <blockquote>
                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                <code><b>⦿ src.test.java</b></code>
                            <!-- gsmereka Submodule -->
                            <details>
                                <summary><b>gsmereka</b></summary>
                                <blockquote>
                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                        <code><b>⦿ src.test.java.gsmereka</b></code>
                                    <!-- example Submodule -->
                                    <details>
                                        <summary><b>example</b></summary>
                                        <blockquote>
                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                <code><b>⦿ src.test.java.gsmereka.example</b></code>
                                            <!-- api_upgrade Submodule -->
                                            <details>
                                                <summary><b>api_upgrade</b></summary>
                                                <blockquote>
                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                        <code><b>⦿ src.test.java.gsmereka.example.api_upgrade</b></code>
                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                    <thead>
                                                        <tr style='background-color: #f8f9fa;'>
                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                        </tr>
                                                    </thead>
                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/test/java/gsmereka/example/api_upgrade/ApiUpgradeApplicationTests.java'>ApiUpgradeApplicationTests.java</a></b></td>
                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                        </tr>
                                                    </table>
                                                    <!-- utils Submodule -->
                                                    <details>
                                                        <summary><b>utils</b></summary>
                                                        <blockquote>
                                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                <code><b>⦿ src.test.java.gsmereka.example.api_upgrade.utils</b></code>
                                                            <table style='width: 100%; border-collapse: collapse;'>
                                                            <thead>
                                                                <tr style='background-color: #f8f9fa;'>
                                                                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                    <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                </tr>
                                                            </thead>
                                                                <tr style='border-bottom: 1px solid #eee;'>
                                                                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/test/java/gsmereka/example/api_upgrade/utils/PredefinedUser.java'>PredefinedUser.java</a></b></td>
                                                                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                </tr>
                                                            </table>
                                                        </blockquote>
                                                    </details>
                                                    <!-- domain Submodule -->
                                                    <details>
                                                        <summary><b>domain</b></summary>
                                                        <blockquote>
                                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                <code><b>⦿ src.test.java.gsmereka.example.api_upgrade.domain</b></code>
                                                            <!-- repository Submodule -->
                                                            <details>
                                                                <summary><b>repository</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.test.java.gsmereka.example.api_upgrade.domain.repository</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/test/java/gsmereka/example/api_upgrade/domain/repository/UserRepositoryTest.java'>UserRepositoryTest.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                    <!-- service Submodule -->
                                                    <details>
                                                        <summary><b>service</b></summary>
                                                        <blockquote>
                                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                <code><b>⦿ src.test.java.gsmereka.example.api_upgrade.service</b></code>
                                                            <!-- impl Submodule -->
                                                            <details>
                                                                <summary><b>impl</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.test.java.gsmereka.example.api_upgrade.service.impl</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/test/java/gsmereka/example/api_upgrade/service/impl/UserServiceImplTest.java'>UserServiceImplTest.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                </blockquote>
                                            </details>
                                        </blockquote>
                                    </details>
                                </blockquote>
                            </details>
                        </blockquote>
                    </details>
                </blockquote>
            </details>
            <!-- main Submodule -->
            <details>
                <summary><b>main</b></summary>
                <blockquote>
                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                        <code><b>⦿ src.main</b></code>
                    <!-- java Submodule -->
                    <details>
                        <summary><b>java</b></summary>
                        <blockquote>
                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                <code><b>⦿ src.main.java</b></code>
                            <!-- gsmereka Submodule -->
                            <details>
                                <summary><b>gsmereka</b></summary>
                                <blockquote>
                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                        <code><b>⦿ src.main.java.gsmereka</b></code>
                                    <!-- example Submodule -->
                                    <details>
                                        <summary><b>example</b></summary>
                                        <blockquote>
                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                <code><b>⦿ src.main.java.gsmereka.example</b></code>
                                            <!-- api_upgrade Submodule -->
                                            <details>
                                                <summary><b>api_upgrade</b></summary>
                                                <blockquote>
                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                        <code><b>⦿ src.main.java.gsmereka.example.api_upgrade</b></code>
                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                    <thead>
                                                        <tr style='background-color: #f8f9fa;'>
                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                        </tr>
                                                    </thead>
                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/ApiUpgradeApplication.java'>ApiUpgradeApplication.java</a></b></td>
                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                        </tr>
                                                    </table>
                                                    <!-- domain Submodule -->
                                                    <details>
                                                        <summary><b>domain</b></summary>
                                                        <blockquote>
                                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.domain</b></code>
                                                            <!-- model Submodule -->
                                                            <details>
                                                                <summary><b>model</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.domain.model</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/domain/model/Account.java'>Account.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/domain/model/BaseItem.java'>BaseItem.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/domain/model/News.java'>News.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/domain/model/Feature.java'>Feature.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/domain/model/Card.java'>Card.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/domain/model/User.java'>User.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                            <!-- repository Submodule -->
                                                            <details>
                                                                <summary><b>repository</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.domain.repository</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/domain/repository/UserRepository.java'>UserRepository.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                    <!-- service Submodule -->
                                                    <details>
                                                        <summary><b>service</b></summary>
                                                        <blockquote>
                                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.service</b></code>
                                                            <table style='width: 100%; border-collapse: collapse;'>
                                                            <thead>
                                                                <tr style='background-color: #f8f9fa;'>
                                                                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                    <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                </tr>
                                                            </thead>
                                                                <tr style='border-bottom: 1px solid #eee;'>
                                                                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/service/UserService.java'>UserService.java</a></b></td>
                                                                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                </tr>
                                                                <tr style='border-bottom: 1px solid #eee;'>
                                                                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/service/CrudService.java'>CrudService.java</a></b></td>
                                                                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                </tr>
                                                            </table>
                                                            <!-- exception Submodule -->
                                                            <details>
                                                                <summary><b>exception</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.service.exception</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/service/exception/NotFoundException.java'>NotFoundException.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/service/exception/BusinessException.java'>BusinessException.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                            <!-- impl Submodule -->
                                                            <details>
                                                                <summary><b>impl</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.service.impl</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/service/impl/UserServiceImpl.java'>UserServiceImpl.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                    <!-- controller Submodule -->
                                                    <details>
                                                        <summary><b>controller</b></summary>
                                                        <blockquote>
                                                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.controller</b></code>
                                                            <table style='width: 100%; border-collapse: collapse;'>
                                                            <thead>
                                                                <tr style='background-color: #f8f9fa;'>
                                                                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                    <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                </tr>
                                                            </thead>
                                                                <tr style='border-bottom: 1px solid #eee;'>
                                                                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/controller/UserController.java'>UserController.java</a></b></td>
                                                                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                </tr>
                                                            </table>
                                                            <!-- exceptionHandler Submodule -->
                                                            <details>
                                                                <summary><b>exceptionHandler</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.controller.exceptionHandler</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/controller/exceptionHandler/GlobalExceptionHandler.java'>GlobalExceptionHandler.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                            <!-- dto Submodule -->
                                                            <details>
                                                                <summary><b>dto</b></summary>
                                                                <blockquote>
                                                                    <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                                                        <code><b>⦿ src.main.java.gsmereka.example.api_upgrade.controller.dto</b></code>
                                                                    <table style='width: 100%; border-collapse: collapse;'>
                                                                    <thead>
                                                                        <tr style='background-color: #f8f9fa;'>
                                                                            <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                                                            <th style='text-align: left; padding: 8px;'>Summary</th>
                                                                        </tr>
                                                                    </thead>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/controller/dto/UserDto.java'>UserDto.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/controller/dto/CardDto.java'>CardDto.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/controller/dto/FeatureDto.java'>FeatureDto.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/controller/dto/NewsDto.java'>NewsDto.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                        <tr style='border-bottom: 1px solid #eee;'>
                                                                            <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/java/gsmereka/example/api_upgrade/controller/dto/AccountDto.java'>AccountDto.java</a></b></td>
                                                                            <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                                                        </tr>
                                                                    </table>
                                                                </blockquote>
                                                            </details>
                                                        </blockquote>
                                                    </details>
                                                </blockquote>
                                            </details>
                                        </blockquote>
                                    </details>
                                </blockquote>
                            </details>
                        </blockquote>
                    </details>
                    <!-- resources Submodule -->
                    <details>
                        <summary><b>resources</b></summary>
                        <blockquote>
                            <div class='directory-path' style='padding: 8px 0; color: #666;'>
                                <code><b>⦿ src.main.resources</b></code>
                            <table style='width: 100%; border-collapse: collapse;'>
                            <thead>
                                <tr style='background-color: #f8f9fa;'>
                                    <th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
                                    <th style='text-align: left; padding: 8px;'>Summary</th>
                                </tr>
                            </thead>
                                <tr style='border-bottom: 1px solid #eee;'>
                                    <td style='padding: 8px;'><b><a href='https://github.com/gsmereka/api-upgrade/blob/master/src/main/resources/application-dev.yml'>application-dev.yml</a></b></td>
                                    <td style='padding: 8px;'>Code>❯ REPLACE-ME</code></td>
                                </tr>
                            </table>
                        </blockquote>
                    </details>
                </blockquote>
            </details>
        </blockquote>
    </details>
</details>

---

## Getting Started


### Installation

1. **Clone the repository:**

    ```sh
    ❯ git clone https://github.com/gsmereka/api-upgrade
    ```

2. **Navigate to the project directory:**

    ```sh
    ❯ cd api-upgrade
    ```

### Usage

Run the project with:

**Using [maven](https://maven.apache.org/):**
```sh
mvn exec:java
```

### Testing

Api-upgrade uses the {__test_framework__} test framework. Run the test suite with:

**Using [maven](https://maven.apache.org/):**
```sh
mvn test
```

---

## Roadmap

- [X] **`Task 1`**: <strike>Move from Gradle to Maven</strike>
- [X] **`Task 2`**: <strike>Add JPA repository Tests</strike>
- [X] **`Task 3`**: <strike>Add user service Tests</strike>
- [ ] **`Task 4`**: Add Sequential user service Tests.

---

## Contributing

- **💬 [Join the Discussions](https://github.com/gsmereka/api-upgrade/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/gsmereka/api-upgrade/issues)**: Submit bugs found or log feature requests for the `api-upgrade` project.
- **💡 [Submit Pull Requests](https://github.com/gsmereka/api-upgrade/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/gsmereka/api-upgrade
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/gsmereka/api-upgrade/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=gsmereka/api-upgrade">
   </a>
</p>
</details>

---

## License

Api-upgrade is protected under the [LICENSE](https://choosealicense.com/licenses) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---

## Acknowledgments

- Credit `contributors`, `inspiration`, `references`, etc.

<div align="right">

[![][back-to-top]](#top)

</div>


[back-to-top]: https://img.shields.io/badge/-BACK_TO_TOP-151515?style=flat-square


---
