#

- HTTP GET

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
curl --location --request GET 'http://127.0.0.1:8080'
```
