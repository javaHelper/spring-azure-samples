# Use Spring Data JDBC with Azure Database for PostgreSQL

- HTTP POST

```sh
curl --location --request POST 'http://127.0.0.1:8080' \
--header 'Content-Type: application/json' \
--data-raw '{
    "description" : "Development",
    "details": "Spring Batch Development",
    "done" : true
}'
```

- HTTP GET 

```sh
http://127.0.0.1:8080
```

Response

```
[
    {
        "id": 1,
        "description": "configuration",
        "details": "congratulations, you have set up JDBC correctly!",
        "done": true
    },
    {
        "id": 2,
        "description": "Development",
        "details": "Spring Batch Development",
        "done": true
    }
]
```

![image](https://user-images.githubusercontent.com/54174687/147319343-015320af-a1dd-49dc-beac-5ca8a6e3bfd2.png)

