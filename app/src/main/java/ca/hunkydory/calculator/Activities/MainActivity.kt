package ca.hunkydory.calculator.Activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ca.hunkydory.calculator.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        setContentView(R.layout.activity_main)

        btnMenuMortgage.setOnClickListener {
            val intent = Intent(this, mortgage::class.java)
            startActivity(intent)
        }
    }

}
