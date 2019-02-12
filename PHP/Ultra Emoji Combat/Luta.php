<?php
require_once 'Lutador.php';
class Luta {
    //Atributos
    private $desafiado;
    private $desafiante;
    private $rounds;
    private $aprovada;
    //Métodos públicos
    public function marcarLuta($l1, $l2){
        if($l1->getCategoria() == $l2->getCategoria() && ($l1 != $l2)){
            $this->setAprovada(true);
            $this->setDesafiado($l1);
            $this->setDesafiante($l2);
        } else {
            $this->setAprovada(false);
            $this->setDesafiado(null);
            $this->setDesafiante(null);
        }
    }
    public function lutar(){
        if($this->getAprovada()){
            $this->desafiado->apresentar();
            $this->desafiante->apresentar();
            
            for($i=0; $i<5; $i++){
                echo "<h5> >>>> " . $this->desafiado->getMovimento( rand(0, 20) ) . "</h5>";
                echo "<h4>" . $this->desafiante->getMovimento( rand(0, 20) ) . " <<<<</h4>";
            }
            
            $chance1=5;
            $chance2=5;
            
            $this->desafiado->getVitorias() > $this->desafiante->getVitorias()? $chance1 += 2 : $chance2 += 2;
            $this->desafiado->getPeso() > $this->desafiante->getPeso()? $chance1 += 2 : $chance2 += 2;
            $this->desafiado->getAltura() > $this->desafiante->getAltura()? $chance1 += 2 : $chance2 += 2;      
            
            $chance1 = rand(0, $chance1);
            $chance2 = rand(0, $chance2);
            
            if ($chance1 > $chance2){
                echo "<p>" . $this->desafiado->getNome() . " venceu! =)</p>";
                $this->desafiado->ganharLuta();
                $this->desafiante->perderLuta();
            } else if ($chance1 < $chance2){
                echo "<p>" . $this->desafiante->getNome(). " venceu! =O</p>";
                $this->desafiado->perderLuta();
                $this->desafiante->ganharLuta();
            } else {
                echo "<p>Deu empate!!!</p>";
                $this->desafiado->empatarLuta();
                $this->desafiante->empatarLuta();
            }
        }else{
            echo '<p>Infelizmente, a luta não pode acontecer pois os lutadores pertencem a categorias diferentes ou<br>foi selecionado o mesmo lutador como "Desafiante" e "Desafiador" =( </P>';
        }
    }
    //Métodos especiais
    function getDesafiado() {
        return $this->desafiado;
    }
    function getDesafiante() {
        return $this->desafiante;
    }
    function getRounds() {
        return $this->rounds;
    }
    function getAprovada() {
        return $this->aprovada;
    }
    function setDesafiado($desafiado) {
        $this->desafiado = $desafiado;
    }
    function setDesafiante($desafiante) {
        $this->desafiante = $desafiante;
    }
    function setRounds($rounds) {
        $this->rounds = $rounds;
    }
    function setAprovada($aprovada) {
        $this->aprovada = $aprovada;
    }

}
