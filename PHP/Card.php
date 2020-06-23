<?php

    require_once('Payment.php');

    class Card extends Payment{
        public $cvv;
        public $number;
        public $date;
        public $name;
        
        public function __construct($id, $name, $cvv, $date, $number){
            parent::__construct($id);
            this->cvv = cvv;
            this->name = name;
            this->number = number;
            this->date = date;
        }
    }
?>