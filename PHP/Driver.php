<?php

require_once("Account.php");

class Driver extends Account{

    public $license;

    public function __construct($id, $name, $document, $email, $password, $license){
        parent::__construct($id, $name, $document, $email, $password);
        $this->license = license;
    }
}

?>