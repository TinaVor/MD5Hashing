﻿#ВВЕДЕНИЕ

В  настоящее  время  безопасность  данных  стала  одним  из  ключевых вопросов в информационных технологиях. Все больше компаний и частных лиц осознают,  что  необходимо  принимать  меры  для  защиты  своих  данных  от несанкционированного  доступа  и  изменения.  Одним  из  основных  способов обеспечения безопасности данных является шифрование. 

Шифрование  данных  является  неотъемлемой  частью  современной информационной  безопасности.  Одним  из  распространенных  методов хеширования,  применяемых  для  обеспечения  целостности  данных,  является MD5 (Message Digest Algorithm 5). MD5 создан для быстрого и эффективного вычисления хеш-суммы, которая уникально представляет входные данные. 

MD5 используется в различных областях, таких как проверка целостности файлов, хранение паролей и генерация контрольных сумм. Однако, хотя MD5 является широко применяемым алгоритмом, он становится все более уязвимым из-за  возрастающей  вычислительной  мощности  современных  компьютеров. Возможность подбора и подделки хеш-суммы стала более реальной, что делает MD5  небезопасным  для  некоторых  критически  важных  задач,  таких  как аутентификация и цифровая подпись. 

В  настоящее  время  существуют  более  безопасные  алгоритмы хеширования,  такие  как  SHA-256  (Secure  Hash  Algorithm  256-bit),  которые обладают более высоким уровнем защиты и устойчивостью к атакам. Однако, изучение алгоритма MD5 все еще является важным для понимания основных принципов работы шифрования и защиты данных. 

Целью данного проекта  является разработка мобильного приложения, на основе  алгоритма  MD5,  который  позволит  пользователям  быстро  и  легко шифровать  свои  данные,  обеспечивая  им  дополнительный  уровень безопасности.  Пользователи  смогут  зашифровать  свои  личные  файлы  или сообщения  перед  их  передачей  или  сохранением,  а  также  проверить целостность полученных файлов или сообщений через проверку хеш-суммы.  

Для достижения поставленной цели необходимо выполнить следующие задачи: 

- Изучить  все  аспекты  предметной  области  разрабатываемого 

продукта. 

- Ознакомиться,  и  выявить  плюсы  и  недостатки  аналогов 

разрабатываемого продукта в соответствующей предметной области. 

- Составить  перечень  необходимых  минимальных 

функциональных  требований  к  продукту  на  основе  выявленных характеристик  у  аналогов  и  действительных  потребностей предполагаемого пользователя. 

- Ознакомиться  с  необходимыми  программными  средствами 

разработки, которые буду задействованы при создании проекта. 

- Разработать  алгоритм  хеширования.  Провести   анализ  и 

разработку алгоритма хеширования MD5. 

- Создать интерфейс пользователя. Спроектировать удобный и 

интуитивно понятного пользовательский интерфейс для ввода функций и параметров интегрирования. 

- Протестировать  и  проверить  правильность  вычислений. 

Осуществить  тщательное  тестирования  приложения  для  обеспечения точности и надежности результатов интегрирования. 

- Составить  руководство  пользователя,  включающее  в  себя 

инструкцию  по  установке,  пояснение  к  имеющемуся  функционалу  и перечень действий пользователя при сбое программы. 

Разработка  мобильного  приложения  на  основе  данного  алгоритма позволит  пользователям  обеспечить  безопасность  своих  данных  и  улучшить уровень защиты информации. Разработка данного приложения пройдет через ряд этапов и проверок  для обеспечения его  быстроты и функциональности.


#1  ОПИСАНИЕ ПРЕДМЕТНОЙ ОБЛАСТИ

Современный мир насыщен разнообразными цифровыми технологиями, и защита  данных  становится  приоритетом  в  сфере  информационной безопасности. Одним из ключевых аспектов обеспечения безопасности является применение  криптографии,  основанной  на  принципах  шифрования. Шифрование представляет собой процесс преобразования текста или данных в форму, непонятную без использования специального ключа. 

В  наше  время,  когда  цифровые  технологии  становятся  неотъемлемой частью повседневной жизни, актуальность темы шифрования велика. Защита конфиденциальной  информации  становится  критически  важной,  особенно  в контексте  мобильных  приложений,  которые  используются  для  передачи  и хранения личных данных. 

В данной работе используется алгоритм MD5 шифрования как однин из наиболее  распространенных  алгоритмов  хэширования.  MD5  шифрование широко  применяется  в  информационной  безопасности  для  хеширования паролей,  подписи  данных  и  создания  контрольных  сумм.  Этот  алгоритм представляет  собой  надежный  инструмент  для  обеспечения  целостности данных и контроля доступа. 

С развитием мобильных технологий мобильные приложения становятся неотъемлемой частью нашей повседневной жизни. В контексте безопасности данных  на  мобильных  устройствах,  приложения,  использующие  MD5 шифрование,  играют  важную  роль.  Такие  приложения  могут  служить надежным инструментом для обеспечения безопасности данных, передаваемых и хранимых на мобильных устройствах. 

Пользователи мобильных приложений, использующих MD5 шифрование, охватывают  различные  категории  людей  и  организаций.  Это  могут  быть  IT- специалисты,  разработчики  программного  обеспечения,  администраторы  IT- систем,  а  также  обычные  пользователи,  желающие  обеспечить  безопасность своих персональных данных. Такое разнообразие пользователей подчеркивает универсальность и востребованность MD5 шифрования в различных сферах. 

Мобильные  приложения,  использующие  MD5  шифрование,  находят применение в различных областях, таких как безопасность данных, цифровые подписи  и  обеспечение  конфиденциальности  пользовательских  учетных данных. Разработка такого приложения требует учета современных стандартов безопасности  и  адаптации  к  ограничениям,  существующим  в  рамках использования MD5 алгоритма. 

Область  применения  мобильного  приложения  для  MD5  шифрования включает  в  себя  безопасность  данных,  цифровые  подписи  и  обеспечение конфиденциальности  пользовательских  учетных  данных.  Разработка  такого приложения требует внимания к современным стандартам безопасности и учету ограничений MD5 

Итак,  рассмотрение  темы  защиты  данных,  основанной  на  MD5 шифровании, подчеркивает актуальность этой темы в современном цифровом мире.  Мобильные  приложения,  использующие  этот  алгоритм,  не  только обеспечивают  безопасность  данных,  но  также  предоставляют  надежные инструменты  для  защиты  конфиденциальной  информации.  Разнообразие пользователей  и  широкий  спектр  применения  делают  MD5  шифрование важным элементом в обеспечении информационной безопасности. 


#2  ПОСТАНОВКА ЗАДАЧИ** 

Необходимо  разработать  структуру  будущего  программного  средства  с основными функциональными требованиями, удовлетворяющими потребность пользователей  и  на  которые  будет  разработчик  приложения.  Этими функциональными  требованиями  является  приведённое  далее  описание основных  частей  приложения.  В  ходе  разработки  должны  быть  реализованы главные  экран  приложения,  который  позволяет  зашифровать  данные.  Его подробное рассмотрение также представлено ниже. 

1. **Главный экран приложения** 

При  запуске  приложения  перед  пользователем  должен  появляться главный  экран.  В  верхней  части  этого  экрана  будет  показываться  название приложения  «MD5-Hashing».  Ниже  должна  быть  расположен  заголовок «Введите данные» и текст бокс «Message», позволяющий пользователю вводить сообщение  для  шифрования.  Под  ним  необходимо  расположить  кнопку  с фразой  «Зашифровать»,  которая  при  нажатии  в  пустой  лейбл  «Result»,  находящийся ниже выведет результат шифрования. При нажатии кнопки если текст бокс пуст пользователю будет выведено сообщение об ошибке. 

2. **Дизайн приложения** 

Приложение  следует  разрабатывать  в  спокойных,  не  ярких,  холодных тонах. За основной цвет рекомендуется взять черный, а акцентным фиолетовый. 

3. **Пользователи** 

Пользователями  разрабатываемого  продукта  будут  являться  IT- специалисты,  разработчики  программного  обеспечения,  администраторы  IT- систем, и все, желающие обеспечить безопасность своих персональных данных. 


#3  ПЛАН РАЗРАБОТКИ ПРОЕКТА

Для  полноценной  работы  над  созданием  проекта  необходимо  чёткое определение  всех  этапов  разработки.  В  таблице  1  представлены  этапы составления  требований  для  проекта  и  планирования  составляющих приложения, проектирования приложения, реализации проектного решения и внедрения готового продукта. 

На  первом  этапе  разработки  определяются  общие  требования, анализируется предметная область и планируются составляющие программы. На втором этапе проектируются варианты дизайна и подбираются  технологии, исходя из чего выбираются наиболее подходящие решения. На третьем этапе разработчик   приступает  к  написанию  кода,  тестирует  получившееся приложение  и  исправляет  ошибки.  На  четвёртом,  заключительном  этапе, продукт вводится в эксплуатацию, 


#4  ХАРАКТЕРИСТИКА ВЫБРАННЫХ ПРОГРАММНЫХ СРЕД И СРЕДСТВ

**Android Studio** 

Android  Studio  является  интегрированной  средой  разработки  (IDE)  для создания  приложений  под  операционную  систему  Android.  Эта  среда предоставляет  всю  необходимую  функциональность  для  разработки,  от создания проекта и написания кода до отладки и сборки приложения. 

Основные особенности Android Studio: 

- Поддержка языка программирования Java.  
- Интеграция  с  Android  SDK  (Software  Development  Kit).  SDK предоставляет  набор  инструментов  для  разработки  Android- приложений,  включая  компилятор,  отладчик,  эмулятор,  а  также различные  API  и  библиотеки  для  работы  с  функциональностью устройства.  
- Мощный редактор кода. Android Studio предлагает удобный редактор кода с функцией автодополнения, проверкой синтаксиса, подсветкой синтаксиса  и  другими  полезными  возможностями,  которые значительно упрощают процесс программирования.  
- Визуальный редактор макетов. С помощью встроенного визуального редактора  макетов  можно  создавать  пользовательский  интерфейс приложения с помощью простой перетаскивания элементов на экране.  
- Инструменты  для  отладки.  Android  Studio  предоставляет  различные инструменты  для  отладки  приложения,  включая  возможность установки точек останова, просмотра значений переменных, а также отслеживания выполнения кода.  
- Инструменты для сборки и упаковки приложения. С помощью Android Studio можно собрать и упаковать приложение в APK-файл, который можно установить на устройство пользователя. 


#5  РУКОВОДСТВО ПОЛЬЗОВАТЕЛЯ

1. **Установка приложения** 

Приложение MD5-Hashing можно найти на таких маркетплейсах, как Play Market  и  AppStore.  Для  этого  потребуется  открыть  магазин  приложений  и, воспользовавшись  строкой  поиска,  ввести  «MD5-Hashing».  В  появившемся списке  приложений  выбрать  приложение  «MD5-Hashing»  и  нажать  кнопку «Установить». 

Обновление мобильного приложения  выполняется средствами магазина приложений.  Для  корректной  работы  приложения  необходимо  устройство  с такими  минимальными  требованиями,  как:  не  менее  256  МБ  оперативной памяти и сенсорный экран. 

2. **Руководство по использованию** 

При  открытии  «MD5-Hashing»  пользователя  встречает  главный  экран приложения с заголовком «Введите данные», текст боксом «Message» и кнопка «Зашифровать»,  которая  при  нажатии  в  пустой   лейбл  «Result»,   выведет результат шифрования.  

3. **Алгоритм действий пользователя в случае сбоя ПС** 

Если  приложение  зависло  и  не  отвечает,  следует  закрыть  его  и перезапустить. 

