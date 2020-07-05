## Physis Core Web Layer


## Deployment

For front-end module development
```
docker run --name postgresql -e POSTGRES_PASSWORD=rootpass -v my_dbdata:/var/lib/postgresql/data -p 5432:5432 -d postgres:11
```
