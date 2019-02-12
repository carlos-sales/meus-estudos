<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
	<title>Ultra Emoji Combat</title>
	<link rel="stylesheet" text="text/css" href="_css/estilo.css">
    </head>
    <body>
        <?php 
            require_once 'Lutador.php';
            require_once 'Luta.php';

            $l[] = array();

            $l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
            $l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
            $l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
            $l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
            $l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
            $l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        ?>
        
	<header id="cabecalho">
		<h1>Ultra Emoji Combat</h1>
		<h2> >> A batalha mais inesperada de todos os tempos! << </h2>	
	</header>

	<section id="disputa">
            <form action="batalha.php" method="post">
                <p>
                <label for="cDesafiante">Desafiante </label>


                    <select name="tDesafiante" id="cDesafiante" >
                        <?php 
                            for($i=0;$i< count($l);$i++){

                                echo "<option value='" . $i . "'>" . $l[$i]->getNome() . "</option>";
                            }
                        ?>        

                    </select>

                <label> &nbsp &nbsp X &nbsp &nbsp </label>
                <select name="tDesafiado" id="cDesafiado">
                     <?php 
                        for($i=0;$i< count($l);$i++){

                            echo "<option value='" . $i . "'>" . $l[$i]->getNome() . "</option>";
                        }
                    ?>   
                </select>
                <label for="cDesafiado"> Desafiado</label>
                <br>
                <input type="submit" value="Começar Luta!">
                </p>
            </form>
            
       
	</section>
        
        <section id="corpo">
            <?php                 
                $i=0;
                while ($i < count($l) ){
            ?>
            <fieldset id="cartel">
                <legend>Lutador <?php echo ($i + 1)?> </legend>
                <p><label><strong>Nome: </strong> <?php echo $l[$i]->getNome() ?></label></p>
                <p><label><strong>Nacionalidade: </strong><?php echo $l[$i]->getNacionalidade() ?> </label></p>
                <p><label><strong>Idade: </strong></label> <?php echo $l[$i]->getIdade() . " anos" ?> </p>
                <p><label><strong>Altura: </strong></label> <?php echo $l[$i]->getAltura() . " M" ?> </p>
                <p><label><strong>Peso: </strong></label> <?php echo $l[$i]->getPeso() . " Kg" ?> </p>
                <p><label><strong>Categoria: </strong></label> <?php echo $l[$i]->getCategoria() ?> </p>
                <p><label><strong>Vitórias: </strong></label> <?php echo $l[$i]->getVitorias() ?> </p>
                <p><label><strong>Derrotas: </strong></label> <?php echo $l[$i]->getDerrotas() ?> </p>
                <p><label><strong>Empates: </strong></label> <?php echo $l[$i]->getEmpates() ?> </p>
            </fieldset>
            <?php $i++;           
                } ?>
        </section>
        
	<footer id="rodape">

            <p>Copyright &copy 2019 - by Carlos Alberto (baseado no exercício proposto por Gustavo Guanabara em "Curso em Vídeo")


        </footer>
   
    </body>
</html>
