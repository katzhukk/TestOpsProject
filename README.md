# Тесты для сайта [Газпромбанка](https://www.gazprombank.ru/)
<p align="center">  
<a href="https://www.gazprombank.ru/"> <img src="images/gazprom_bank.jpg" width="600">
</p>  

---
## Содержание

* [Технологии и инструменты](#Технологии-и-инструменты)
* [Список проверок](#Список-проверок)
* [Сборка в Jenkins](#Сборка-в-Jenkins)
* [Allure Report](#Allure-report)
* [Уведомление в Telegram о результатах тестов](#Уведомление-в-Telegram-о-результатах-тестов)
* [Видео прохождение тестов](#Видео-прохождение-тестов)

---
## <a name="Технологии-и-инструменты:">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/GitHub.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>  
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="https://web.telegram.org/k/"><img src="images/Telegram.svg" width="50" height="50"  alt="Selenoid"/></a>  
</p>

---
<a id="tests"></a>
## <a name="Список-проверок">**Список проверок**</a>

* Проверка на выбор города на главной странице Газпромбанка  
* Проверка результата поиска по запросу Вклад
* Проверка на клибакельность кнопки Стать клиентом
* Проверка на открытие карты с офисами Газпромбанка
* Проверка на открытие карты с банкоматами Газпромбанка

---

<a id="tools"></a>
## <a name="Сборка-в-Jenkins">**Сборка в Jenkins**</a>

Тесты запускаются через [Jenkins](https://jenkins.autotests.cloud/job/001_katzhukk_SimpleGazpromBankTests/)

<img src="images/Jenkins.PNG" width="850">

Для запуска тестов необходимо нажать на кнопку "Build with Parameters". Появится прогресс бар с номером сборки тестов.

---
## Команды для запуска из терминала

Удалённый запуск через Jenkins:
```bash 
clean 
SimpleGazpromBankTests
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DurlHost=${WDHOST}
```
---

<a id="allure"></a>
## <a name="Allure-report">**Allure Report**</a>

После окончания прогона тестов формируется отчет [Allure](https://jenkins.autotests.cloud/job/001_katzhukk_SimpleGazpromBankTests/15/allure/)


## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="images/allure_report.PNG" width="850">  
</p> 

---
## Тест-кейсы

Содержат подробное описание шагов со скриншотами, видео и Page Source по каждому тесту  

При нажатии на определенный тест, раскрываются шаги теста с приложенными вложениями
<p align="center">  
<img title="Allure Tests" src="images/allure_report_test_case.PNG" width="850">  
</p>

---

## <a name="Уведомление-в-Telegram-о-результатах-тестов">**Уведомление в Telegram о результатах тестов**</a>

Telegram бот уведомляет о результатах тестах для быстрой визуализации отчетности
<p align="center">  
<img title="Allure Tests" src="images/allert_bot.PNG" width="650">  
</p> 

____

## <a name="Видео-прохождения-тестов">**Видео прохождения тестов**</a>

<p align="center">
<img title="Selenoid Video" src="images/SimpleGazpromBankTests.gif" width="600" height="400"  alt="video">   
</p>
