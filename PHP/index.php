<?php
require_once "Account.php";
require_once "Car.php";

print 'Holas mundo';
$car = new Car("QWY234", new Account("Andres Jaramillo","NPI1234"));
$car->printDataCar();
$car2 = new Car("TRE987", new Account("Miguel Cabrera","NPI5674"));
$car2->printDataCar();

?>
