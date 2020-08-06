## Physis Core Web Layer


## Deployment

For front-end module development
```
docker run --name postgresql -e POSTGRES_PASSWORD=rootpass -v my_dbdata:/var/lib/postgresql/data -p 5432:5432 -d postgres:11
```

para inicializar la base de datos de solo mas maquinarias usar 
el archivo `BASE DE DATOS MAQUINAS E IMPORTADORES - TODAS.xlsx`
esto puede durar unos segundos ya que tiene casi 10 mil registros 

sobre el endpoint 

*post* `localhost:8080/maquinaria/excel/`

ejemplo con axion de como hacer el post 
```
var formdata = new FormData();
formdata.append("total", fileInput.files[0], "/C:/Users/skate/Desktop/BASE DE DATOS MAQUINAS E IMPORTADORES.xlsx");

var requestOptions = {
  method: 'POST',
  body: formdata,
  redirect: 'follow'
};

fetch("localhost:8080/maquinaria/excel/", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
```
para hacer el get en los request
```
var file = "<file contents here>";

var requestOptions = {
  method: 'GET',
  body: file,
  redirect: 'follow'
};

fetch("localhost:8080/maquinaria?fromdate=2018&todate=2021&tipomaquinaria=MINICARGADORA&codeventa=CIF,SOS,FCA,FOB", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
```

