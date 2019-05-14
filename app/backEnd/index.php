<?php

$username="id9086336_user";
$password="slaptas";//password
$host="localhost";
$database="id9086336_db";
$charset = 'utf8mb4';


$dsn = "mysql:host=$host;dbname=$database;charset=$charset";
$options = [
    PDO::ATTR_ERRMODE            => PDO::ERRMODE_EXCEPTION,
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
    PDO::ATTR_EMULATE_PREPARES   => false,
];
try {
     $pdo = new PDO($dsn, $username, $password, $options);
     echo "pavyko prisijungit prie db";
} catch (\PDOException $e) {
     throw new \PDOException($e->getMessage(), (int)$e->getCode());
}

if(isset($_POST['kurti']))
{
	$pavadinimas = $_POST['pavadinimas'];
	$dydis = $_POST['dydis'];
	$mesa = $_POST['mesa'];
	$padazas = $_POST['padazas'];
	$kaina = $_POST['kaina'];

	$sql = "INSERT INTO kebabai (pavadinimas,dydis,mesa,padazas,kaina) VALUES (:pavadinimas,:dydis,:mesa,:padazas,:kaina);";
	$stmt = $pdo->prepare($sql);

	$stmt->execute(array(':pavadinimas'=>$pavadinimas,':dydis'=>$dydis,':mesa'=>$mesa,':padazas'=>$padazas,':kaina'=>$kaina));
}


?>