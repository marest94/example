# bank-app-case-study

Bank-app-case-study is a web application developed using [Angular](https://angular.io/) for frontend and [Java Spring framework](http://spring.io/) 
for backend that uses soap request/response for soap-service and soap-service-consumer communication and then send the data in JSON to frontend.

## Getting Started

These instructions will get you a copy of the application up and running on your local machine. This version was tested on Windows 10.

### Prerequisites

1. **Node.js with NPM (Node Package Manager)**

To check whether or not you have Node.js installed, visit your console / command line and type:
```sh
node -v
```
If this command goes unrecognized, you need to install Node.js.
Visit the [Node.js download page](https://nodejs.org/en/download/) and choose either the Windows or Mac installer based on your OS.
Accept the agreement, choose an installation folder, and hit Next on the Custom Setup page. By default, it will install the npm package manager which we will need.
After it's installed, close your console / command line and reload it. You can now run the 
```sh
node -v
```
command and it will provide you with the current version number.

2. **Angular-CLI (Command Line Interface)**

Next, we need to install the Angular-CLI. This tool allows you to create Angular projects as well as help you with various development tasks.
At the console, type:
```sh
> npm install -g @angular/cli
```

### Run the application

1. **Install [STS](https://spring.io/tools/sts) in eclipse using eclipse marketplace**

2. **Import soap-web-service and spring-web-service-consumer from backend folder and do the maven -> update project on soap-web-service**

3. **Run soap-web-service as jetty server (port 8080)**

4. **Maven -> update project on soap-web-service-consumer**

5. **Run spring-web-service-cosnumer as jetty server (port 9999)**

6. **Using terminal go to the frontend/bank-app-front and run:**
```sh
> npm install
```
and 
```sh
> ng serve
```
7. **Open your app in browser**

## Built using
* [Angular](https://angular.io/) - Angular
* [Spring](http://spring.io/) - Spring

## Notes

FirstAproach folder is a folder that contains the first version of soap service/consumer communication that didn't work because of an error that wasn't directly connected to that part of the code. So basicaly it actualy works, but instead we went for the different aproach.

## Authors

* **Natasa Ljubisavljevic** - [natljub](https://github.com/natljub)

* **David Mojicevic** - [BearingSea](https://github.com/BearingSea)

* **Petar Stojanovic** -  [giepetto](https://github.com/giepetto)

* **Marko Stojanovic** -  [marest94](https://github.com/marest94)

* **Nikola Mojas** -  [Moki994](https://github.com/Moki994)

* **Mile Ignjatovic** -  [BurekLord](https://github.com/BurekLord)

* **Slobodan Obradovic** -  [slobodanobradovic1995](https://github.com/slobodanobradovic1995)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

 
