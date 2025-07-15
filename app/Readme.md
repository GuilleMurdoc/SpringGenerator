## Swagger Codegen

```bash
java --add-opens java.base/java.util=ALL-UNNAMED -jar swagger-codegen-cli.jar generate -i http://localhost:8080/api-docs -l dart -o ./dart_client`
```