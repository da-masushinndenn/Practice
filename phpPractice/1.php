<?php
include_once './2.php';

$suugaku = 83;
$eigo = 90;
$kokugo = 50;

$s = new testTest();
$s->test("数学", $suugaku);
$s->test("英語", $eigo);
$s->test("国語", $kokugo);

//エラー出力
error_reporting(E_ALL ^ E_NOTICE);

    function test($nedan){
        $nedan * 1.05;
        return $nedan;
    }
    echo test(100);

    phpinfo();
