const express = require('express');
const bodyParser = require('body-parser');
const app = express();

app.use(bodyParser.urlencoded({extended:true}));

app.get('/', function(req, res) {
    res.sendFile(__dirname + "/index.html")
})

app.post('/', function(req, res) {
    let sum = Number(req.body.num1) + Number(req.body.num2)

    res.send('Seu resultado é igual a ' + sum)
})

app.listen(3000, function () {
    console.log("server started at port 3000")
})