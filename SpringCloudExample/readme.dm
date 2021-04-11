1. Создаем репозиторий из которого будет браться конфиг (пример в spring-cloud-config-git-repo-example)

2. Запускаем сервер (не забываем поправить application.properties).
Должно открываться http://localhost:8888/spring-cloud-hello-service.properties

3. Запускаем клиент. Клиент будет брать данные из ссылки на репозиторий из конфига
http://localhost:7777/showConfig