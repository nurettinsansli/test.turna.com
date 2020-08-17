[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/nurettinsansli/test.turna.com">
    <img src="https://res.cloudinary.com/turna/image/upload/v1581430290/Images/General/Logo/turna-red-logo-v2.svg" alt="Logo" width="200" height="80">
  </a>

  <h3 align="center">TEST TURNA</h3>

  <p align="center">
    An awesome selenium project to jumpstart your projects!
    <br />
    <a href="https://github.com/nurettinsansli/test.turna.com"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/nurettinsansli/test.turna.com">View Demo</a>
    ·
    <a href="https://github.com/nurettinsansli/test.turna.com/issues">Report Bug</a>
    ·
    <a href="https://github.com/nurettinsansli/test.turna.com/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

I'm using Selenium web automation framework. This project supported java1.8,maven,junit5 and log4j. I obeyed to OOP and POM rules.

Scenario:
* Open to https://www.turna.com/
* Select to round trip.
* Enter to the departure airport code/name
* Enter to the arrival airport code/name
* Enter to the departure date.
* Enter to the arrival data.
* Click to search button.
* Choose a one-way ticket to the Pegasus plane.
* Choose a return ticket to the any plane corporation.
* Enter to user information.
* Click to gotopay button.

### Built With
If you get error test case.You must goes to the project path. You can write this command. Then project will be built. 
```sh
mvn clean install
```
* [Chocolatey](https://chocolatey.org/docs/installation#install-using-powershell-from-cmdexe)
* [IntellijIdea IDE](https://www.jetbrains.com/idea/download/#section=windows)
* [Java8](https://www.oracle.com/java/technologies/javase-downloads.html)
* [Maven](https://maven.apache.org/)
* [MavenRepository](https://mvnrepository.com/)
* [SearchMavenRepository](https://search.maven.org/)


<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

We can install chocolatey by running the following code in 'cmd.exe' run as administrator.
* Chocolatey
```sh
@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command
"[System.Net.ServicePointManager]::SecurityProtocol = 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
```
If there is an error in loading from cmd.exe, alternative steps available on the link can be applied.
https://chocolatey.org/docs/installation#install-using-powershell-from-cmdexe

### Installation

1. Java version should be 1.8.(JDK8)
2. To install with Chocolatey, we can run the ‘choco install jdk8 'command in cmd.exe.
```sh
choco install jdk8
```
Version control
```sh
java --version
```

3. Install MAVEN
```sh
choco install maven
```
Version control
```sh
mvn --version
```

4. Install Gauge
```sh
choco install gauge
```
Version control
```sh
gauge --version
```
5. Java Gauge Plugins
```sh
gauge install java
```
Some Plugins install
```sh
gauge install html-report
gauge install xml-report
gauge install json-report
gauge install spectacle
gauge install screenshot
```
Version control
```sh
gauge --version
```
6. INTELLIJ IDEA
Community Edition can be downloaded for free if a membership is not available.
https://www.jetbrains.com/idea/download/#section=windows

After installition restart PC :smile:

<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_Selenium Api Java [Documentation](https://www.selenium.dev/selenium/docs/api/java/index.html)_

_Selenium Grid  [Documentation](https://www.selenium.dev/documentation/en/grid)_

_HTML Attributes Reference  [Documentation](https://www.w3schools.com/tags/ref_attributes.asp)_

_Locator strategies Xpath cheatsheet  [Documentation](https://devhints.io/xpath)_

_Locator strategies Css cheatsheet  [Documentation](https://devhints.io/css)_

_List of Chromium Command Line Switches  [Documentation](https://peter.sh/experiments/chromium-command-line-switches/)_

_Junit5  [Documentation](https://www.tutorialspoint.com/junit/index.htm)_

_Featured Page Object Model in Selenium  [Documentation](https://chercher.tech/java/featured-page-object-model-selenium-webdriver)_

<!-- Tasks -->
## Tasks
Develop a locator strategies without clicking index.



<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License
Everything is open source project. That's why it's all free.:smile:



<!-- CONTACT -->
## Contact

Nurettin ŞANSLI - [@nurettinsansli](https://twitter.com/nurettinsansli) - nurettinsanslii@gmail.com

My personel website -[@cv](https://nurettinsansli.github.io/cv/)

Project Link: [https://github.com/nurettinsansli/test.turna.com](https://github.com/nurettinsansli/test.turna.com)



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=flat-square
[contributors-url]: https://github.com/nurettinsansli/test.turna.com/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=flat-square
[forks-url]: https://github.com/nurettinsansli/test.turna.com/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=flat-square
[stars-url]: https://github.com/nurettinsansli/test.turna.com/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=flat-square
[issues-url]: https://github.com/nurettinsansli/test.turna.com/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=flat-square
[license-url]: https://github.com/nurettinsansli/test.turna.com/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/nurettinsansli
[product-screenshot]: images/screenshot.png

