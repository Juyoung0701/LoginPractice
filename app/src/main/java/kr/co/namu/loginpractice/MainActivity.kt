package kr.co.namu.loginpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        로그인 버튼이 눌리면 => 실행해줄 내용을 { } 안에 작성하자.
        loginBtn.setOnClickListener {
//            코드에 남기는 메모
//            주석
            Toast.makeText(this, "로그인 버튼이 눌림", Toast.LENGTH_SHORT).show()
        }



    }
}