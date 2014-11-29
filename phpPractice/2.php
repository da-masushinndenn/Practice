<?php
//エラー出力
error_reporting(E_ALL ^ E_NOTICE);
class testTest{
   function test($kamoku, $tensuu){
        echo $kamoku . "の結果:";
        if ($tensuu > 75) {
            echo "合格です</br>";
        }else{
            echo "不合格です</br>";
        }
    }
}
        $suugaku = 84;
        $eigo = 62;
        $kokugo = 78;
        
        test("数学", $suugaku);
        test("英語", $eigo);
        test("国語", $kokugo);

