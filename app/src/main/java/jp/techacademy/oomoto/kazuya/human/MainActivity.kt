package jp.techacademy.oomoto.kazuya.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Trump = Human("トランプ", 72, "アメリカ")
        var Putin = Human("プーチン", 66, "ロシア")
        Trump.say()
        Trump.think()
        Putin.say()
        Putin.think()
    }
}
