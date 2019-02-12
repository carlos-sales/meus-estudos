<?php
class Lutador {
    
    private $nome;
    private $nacionalidade;
    private $idade;
    private $altura;
    private $peso;
    private $categoria;
    private $vitorias;
    private $derrotas;
    private $empates;
    private $movimento;
    
    function __construct($nome, $nacionalidade, $idade, $altura, $peso, $vitorias, $derrotas, $empates) {
        $this->setNome($nome);
        $this->setNacionalidade($nacionalidade);
        $this->setIdade($idade);
        $this->setAltura($altura);
        $this->setPeso($peso);
        $this->setVitorias($vitorias);
        $this->setDerrotas($derrotas);
        $this->setEmpates($empates);
        $this->setMovimento();
    }

        function getNome() {
        return $this->nome;
    }

    function getNacionalidade() {
        return $this->nacionalidade;
    }

    function getIdade() {
        return $this->idade;
    }

    function getAltura() {
        return $this->altura;
    }

    function getPeso() {
        return $this->peso;
    }

    function getCategoria() {
        return $this->categoria;
    }

    function getVitorias() {
        return $this->vitorias;
    }

    function getDerrotas() {
        return $this->derrotas;
    }

    function getEmpates() {
        return $this->empates;
    }

    function getMovimento($i) {
        return $this->movimento[$i];
    }
    
    function setNome($nome) {
        $this->nome = $nome;
    }

    function setNacionalidade($nacionalidade) {
        $this->nacionalidade = $nacionalidade;
    }

    function setIdade($idade) {
        $this->idade = $idade;
    }

    function setAltura($altura) {
        $this->altura = $altura;
    }

    function setPeso($peso) {
        $this->peso = $peso;
        $this->setCategoria();
    }

    private function setCategoria() {
        if ($this->getPeso()<52.2){
            $this->categoria = "Inválido";
        } else if ($this->getPeso()<=70.3){
            $this->categoria = "Leve";
        } else if ($this->getPeso()<=83.9){
            $this->categoria = "Médio";
        } else if ($this->getPeso()<=120.2){
            $this->categoria = "Pesado";
        } else {
            $this->categoria = "Inválido";
        }
        
    }

    function setVitorias($vitorias) {
        $this->vitorias = $vitorias;
    }

    function setDerrotas($derrotas) {
        $this->derrotas = $derrotas;
    }

    function setEmpates($empates) {
        $this->empates = $empates;
    }
    
    function setMovimento(){
        $this->movimento[0] = "INCRÍVEL! " . $this->nome . " ataca seu oponente com um Kame Hame Ha!";
        $this->movimento[1] = $this->nome . " ataca usando golpes de capoeira";
        $this->movimento[2] = "QUE ISSO, JOVEM?! " . $this->nome . " começa a praticar a capoeira do gaúcho e assusta público, adversário e este narrador!";
        $this->movimento[3] = "Katon! Goukakyuu no Jutsu! " . $this->nome . " queima seu adversário!";
        $this->movimento[4] = $this->nome . " saca sua Glock e atira contra seu oponente =O";
        $this->movimento[5] = $this->nome . " tenta nocautear o adversário na base da chinelada!";
        $this->movimento[6] = "GET OVER HERE! Scorpion, quer dizer, " . $this->nome . " aplica um golpe mortal em seu adversário";
        $this->movimento[7] = $this->nome . " tenta ganhar o controle da luta usando suas técnicas de boxe";
        $this->movimento[8] = $this->nome . " aplica uma voadora";
        $this->movimento[9] = "Usando sua especialidade, " . $this->nome . " aplica uma sequencia de chutes no oponente";
        $this->movimento[10] = $this->nome . " invoca uma raposa de 9 caudas e parte pra cima do oponente!";
        $this->movimento[11] = "ESSA DOEU EM MIM! " . $this->nome . " arremesa um guarda roupa em seu oponente! Ele desvia tranquilamente, mas ao tentar contra-atacar, bate o mindinho do pé na quina do móvel!";
        $this->movimento[12] = "HADOUKEN! " . $this->nome . " usa a consagrada técnica de Ryu e Ken!";
        $this->movimento[13] = $this->nome . " dá uma cotovelada no adversário!";
        $this->movimento[14] = $this->nome . " dá uma de Zidane e aplica uma cabeçada no oponente. Será que o futebol dele é parecido também?";
        $this->movimento[15] = "MEUA MIGO!" . $this->nome . " aplica uma voadora, uma tesoura, uma gravata, uma joelhada, um beijo, ops... =P";
        $this->movimento[16] = "TOASTY! " . $this->nome . " aplica uma sequencia de ganchos!";
        $this->movimento[17] = $this->nome . " dá um carrinho no oponente!";
        $this->movimento[18] = "RITMO RAGATANGA! " . $this->nome . " aplica uma sequencia de golpes que mais parece uma dança! Aserehê! Rá! DÊ RÊ!!!";
        $this->movimento[19] = $this->nome . " joga uma panela com água fervendo no adversário";
        $this->movimento[20] = "AIAIAI! " . $this->nome . " parte pra cima do oponente aplicando vassouradas!!!";
    }
    
    public function apresentar(){
        echo "<p>-----------------------------------UEC---------------------------------</p>" . 
             "<p>IT'S TIIIIIIIME! " . $this->getNome() . 
             " é um peso " . $this->categoria . 
             ". Esse cabra da peste possui " . $this->getVitorias() . 
             " vitória(s), " . $this->getEmpates() . 
             " empate(s) e " . $this->getDerrotas() . 
             " derrota(s)</p>" . 
             "<p>---------------------------------------------------------------------------</p>";
    }
    
    public function status(){
        echo "<p>----------------------------------</p>" .
             "<p>Lutador: " . $this->getNome() . "<br>" .
             "Origem: " . $this->getNacionalidade() . "<br>" .
             "Idade: " . $this->getIdade() . " anos<br>" .
             "Altura: " . $this->getAltura() . " m<br>" .
             "Peso: " . $this->getPeso() . " Kg<br>" .
             "Vitórias: " . $this->getVitorias() . "<br>" .
             "Empates: " . $this->getEmpates() . "<br>" .
             "Derrotas: " . $this->getDerrotas() . "</p>" .
             "<p>----------------------------------</p>";
    }
    
    public function ganharLuta(){
        $this->setVitorias($this->getVitorias() + 1);
    }
    
    public function perderLuta(){
        $this->setDerrotas($this->getDerrotas() + 1);
    }
    
    public function empatarLuta(){
        $this->setEmpates($this->getEmpates() + 1);
    }

}
