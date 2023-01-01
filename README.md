# Java-Labs-2022
Лабораторные работы – Java
-------------------------------------------------------------------
1. Реализовать программу, которая выполняет проверку правильности 
расставленных скобок. Скобки считаются правильно расставленными 
если каждой открытой скобке соответствует закрытая скобка. Внутри 
скобок и между скобок могут находиться любые данные. На вход 
программе подается файл с конфигурациями, в котором можно указать 
символы, являющиеся открывающейся и закрывающейся скобкой, к 
примеру в формате json:
a. {“bracket”:[{“left”:”[”,”right”:”]”},{”left”:”{”,”right”:”}”}]}
и файл, который нужно проверить на правильность расставленных 
скобок.
b. [some(exe{1!|value|2?}jar)none] – скобки расставлены правильно,
если в конфигурации указаны скобки “[ ]”,”{ }”,”( )”, “| |”
[some(one{1!|value|2?}jar))none] – скобки расставлены правильно, 
если в конфигурации указаны скобки “[ ]”,”{ }”, “| |” и
неправильно, если указаны “[ ]”,”{ }”,”( )”, “| |”.
В случае успешного прохождения проверки программа должна 
написать текст об успешной проверке, иначе, программа должна 
указать в каком месте неверно указаны скобки (каким образом – на 
усмотрение разработчика).
Пользовательский интерфейс для программы необязателен.
------------------------------------------------------------------
2. Реализовать программу, которая выполняет размен монет. На вход 
программе подается сумма, которую нужно разменять, и номинал 
монет. Реализовать с помощью рекурсии. Пример: нужно разменять 10 
с доступными номиналами 4 и 1, в результате работы программы 
должно быть указано 10 -> 4[2], 1[2] – две монеты по 4 и две монеты по 
 Если размен невозможен – программа должна написать, что размен 
невозможен. Пользовательский интерфейс для программы 
необязателен.
----------------------------------------------------------------------
3. Поиск строки по ключевому слову. Реализуйте программу, которая 
выполняет поиск строки в файле по заданному ключевому слову и 
найденную строку записывает в результирующий файл. Должны быть 
найдены и записаны все соответствующие строки. Размер файла может 
быть любой (от нескольких байт, до десятков гигабайт). Должна быть 
реализована возможность указать количество строк до и после 
найденной строки для записи в результирующий файл. Для увеличения 
скорости поиска нужно воспользоваться возможностями 
многопоточности. Необходимо отображать прогресс работы 
программы во время ее работы (сколько работает, сколько осталось 
работать, сколько найдено совпадений). Пользовательский интерфейс 
для программы необязателен.
---------------------------------------------------------------------
4. Реализовать программу, которая выводит на экран размер (в байтах)
директории. Название директории передаётся через аргументы 
командной строки. Программа должна корректно обрабатывать ошибки 
без вывода Stack Trace и Exception. 
Пример запуска программы: java –jar SizeDirectory.jar /home/user/
Вывод: /home/user ---- 100000000 bytes / 100000 Mb / 100 Gb
--------------------------------------------------------------------
5. Найти GAP в логах приложения. Реализуйте программу, которая ищет 
пики отклоения по скорости выполнения запросов на основе логов 
приложения. Лог приложения имеет дату и время начала запроса, 
типовой текст начала выполнения запроса или окончание выполнения 
запроса. Программа должна выполнить анализ файла с логами, выявить 
среднее время выполнения запроса и выдать запросы, которые имеют 
отклонение на заданную величину. Запросы в логах могут быть 
асинхронные, пример:
a. 2019-09-01 00:05:00 – INFO – QUERY FOR ID = 1
b. 2019-09-01 00:05:01 – INFO – QUERY FOR ID = 2
c. 2019-09-01 00:05:03 – INFO – RESULT QUERY FOR ID = 1
d. 2019-09-01 00:05:10 – INFO – QUERY FOR ID = 4
e. 2019-09-01 00:05:12 – INFO – QUERY FOR ID = 3
f. 2019-09-01 00:05:13 – INFO – RESULT QUERY FOR ID = 3
g. 2019-09-01 00:05:13 – INFO – RESULT QUERY FOR ID = 4
h. 2019-09-01 00:05:30 – INFO – RESULT QUERY FOR ID = 2
Самый аномальный запрос – QUERY FOR ID 2, который выполнялся 
на порядок дольше, чем остальные запросы. На вход приложению 
подается файл с логами (от нескольких байт, до десятков гигабайт) и 
параметр отклонения, например, 3 seconds или 3 minutes. Если 
параметр не задан, то программа самостоятельно должна выявить 
аномальные запросы (разработчик сам определяет алгоритм).
Необходимо отображать прогресс работы (сколько обработано логов, 
сколько осталось обработать логов). Пользовательский интерфейс для 
программы необязателен.
-------------------------------------------------------------------
6. Движок БД. Реализуйте программу, которая обрабатывает данные из 
разных файлов по заданному принципу. На вход программе через 
аргументы командной строки подаётся 4 файла формата .csv с данными
(таблицы):
a. Ученики – содержит id, ФИО учеников
b. Группы – содержит id группы, название группы и id ученика
c. Предметы – содержит id учебного предмета и название учебного 
предмета
d. Оценки – содержит id учебного предмета, id ученика, оценка и 
дата сдачи учебного предмета.
Также в качестве аргументов командной строки подаются команды в 
формате:
SELECT=названия колонки в csv через запятую – обязательный 
параметр
FROM=названия файлов csv через запятую – обязательный параметр
WHERE=(название колонки=значение колонки AND или OR название 
колонки = значение колонки) – условий через AND и OR может быть 
много – необязательный параметр
GROUPBY=название колонки для группировки – необязательный 
параметр.
На экран должен быть выведен результат по заданному запросу через 
аргументы командной строки.
Результаты запросов должны быть помещены в кэш, т.е. если файлы с 
данными не менялись, то результат должен быть выдан сразу из кэша. 
Пользовательский интерфейс для программы необязателен.
----------------------------------------------------------------
7. “Веб-браузер”. Программа должна предоставлять возможность 
просмотра html-страниц online(через протокол HTTP). Хранить 
историю с указанием дат и временем проведенным на сайтах(хранить 
историю необходимо в файлах формата JSON или XML). Добавить 
возможность отключения истории для всех или определенных сайтов. 
Реализовать возможность сохранения страниц сайтов и их сжатие по 
механизму ZIP. Реализовать возможность просмотра и редактирования 
html-кода страницы в соседнем окне. Реализовать механизм вкладок и 
их параллельное выполнение. Реализовать возможность создания 
собственных html – страниц(минимальное редактирование и 
сохранение файлов html). Реализовать возможность добавлять сайты в 
папку “Избранное”. В браузере обязательно должны присутствовать 
кнопки “возврата по истории” и “вперед по истории”, а также кнопка 
обновить страницу. Должно присутствовать поле для ввода полного 
адреса сайта.
--------------------------------------------------------------------
8. “Морской бой” по сети. Реализовать механизм игры “Морской бой” 
через сеть, используя сокеты. 