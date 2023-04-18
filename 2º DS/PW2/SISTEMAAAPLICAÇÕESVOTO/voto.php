<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sistema de Votação</title>
    
  </head>
  <body>
    <h1>Batalha Harry Styles X Taylor Swift</h1>
    <?php
        $votos = array("Harry Styles" => 0, "Taylor Swift" => 0); // Array que armazena os votos
        if(isset($_POST['submit'])){
            $nome = $_POST['nome'];
            $voto = $_POST['cantor'];
            $votos[$voto]++; // Incrementa o voto para o cantor escolhido
            echo "<h3> Nós agradecemos seu voto, $nome! </h3>";
            $arquivo = fopen("dados.txt", "a");
            fwrite($arquivo, "Nome: $nome | Voto: $voto \n");
            fclose($arquivo);
        } 
    ?>
      <form name="dados_pessoas" method="POST" action="">
        <figure>
      <img src="img/pais.png" width="320" height="240">
    </figure>
            Nome: <input type="text" name="nome" id="nome"> <br>
            <h5>Qual é seu cantor favorito?</h5>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="cantor" id="harry" value="Harry Styles">
                <label class="form-check-label" for="harry">Harry Styles</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="cantor" id="taylor" value="Taylor Swift">
                <label class="form-check-label" for="taylor">Taylor Swift</label>
            </div>
            <input class="btn btn-primary" type="submit" name="submit" value="Votar">
      </form>
      
      <h5>Resultados:</h5>
      <?php
        foreach($votos as $cantor => $votos_recebidos){
            echo "$cantor: $votos_recebidos votos <br>";
        }
      ?>
  </body>
</html>
