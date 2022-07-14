##  Eureka Server
http://localhost:8761/ — домашняя страница пользовательским интерфейсом

## Cloud Config Server

http://localhost:8888/currency-conversion-service/default — стандартный конфиг сервиса [Currency Conversion](#currency-conversion)
http://localhost:8888/currency-conversion-service/default — стандартный конфиг сервиса [Currency Exchange](#currency-exchange)

## Currency Conversion
http://localhost:8765/currency-conversion/currency-conversion-feign/convert?from={from}&to={to}&qtn={qtn} , где from, to и qtn (quantity):
Параметр | Тип 	   | Допустимые знач.
---------	   |----------| ------------------------
from  	 	   | String    | USD; KZT; RUB
to 	       	   | String    | KGS
qtn			   | Double | Любой

## Currency Exchange
http://localhost:8000/currency-exchange/exchange?from={from}&to={to} , где from и to:

Параметр | Тип 	   | Допустимые знач.
---------	   |----------| ------------------------
from  	 	   | String    | USD; KZT; RUB
to 	       	   | String    | KGS

http://localhost:8000/test — страница, где "испытывали" [Resilience4J](https://resilience4j.readme.io/docs)

http://localhost:8000/h2-console — консоль с графическим интерфейсом для просмотра содержимого базы данных и выполнения SQL запросов

JDBC URL: jdbc:h2:mem:test

## API Gateway
Исходные: 

http://localhost:8765/currency-conversion/currency-conversion-feign/convert?from={from}&to={to}&qtn={qtn}

http://localhost:8765/currency-exchange/currency-exchange/exchange?from={from}&to={to}

Кастомные:

http://localhost:8765/get

