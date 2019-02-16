package jp.techacademy.oomoto.kazuya.human

import android.util.Log

class Human : Animal, Thikable{
    //プロパティ
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name:String, age:Int, hobby:String): super(name, age) {
        // 趣味を追加
        this.hobby=hobby
    }
    // Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")
    }

    override fun think(){
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}