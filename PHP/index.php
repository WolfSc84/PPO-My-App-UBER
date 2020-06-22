<?php

require_once "Account.php";
require_once "Car.php";
require_once "UberX.php";
require_once "UberVan.php";
require_once "UberBlack.php";
require_once "UberPool.php";

print 'Hola mundo';
$car = new Car("QWY234", new Account("Andres Jaramillo" , "NPI1234"));
$car->printDataCar();
$car2 = new Car("TRE987", new Account("Miguel Cabrera" , "NPI5674"));
$car2->printDataCar();

$uberX = new UberX("CBV123", new Account("Miguel Panocho", "NPI4567"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("ZWX897", new Account("Alejandro Melembe" , "NPI1234"), "Dodge", "Aptitud");
$uberPool->printDataCar();

?>
