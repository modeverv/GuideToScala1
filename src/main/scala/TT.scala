package sample.app

object TT {
  def main(args:Array[String]):Unit = {
    println("aaaaaa")
    // var と val
    var num:Int = 10
    num = 20
    var n1,n2,n3 = 1
    val msg = "日本語でOK"
    // valは再代入を許さない
    // 基本的にvalを使っていくべし
    //配列
    val a1 = new Array[Int](10)
    a1(1) = 2
  }
}