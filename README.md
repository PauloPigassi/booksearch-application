# booksearch-application

I created two services using Netflix eureka simulating “/books” as an external application would be better.

All of the services (Eureka Server, Search Application, Books Service, and MongoDB) are on a docker-compose,
as you know, you just need to run the "docker compose up" command, in the project folder.

Books service GET localhost:8081/books

Search application GET localhost:8080/search?q=

I changed slightly the ID of the book entity just to follow the mongo pattern.
