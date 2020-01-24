package ca.hunkydory.calculator.Activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ca.hunkydory.calculator.R
import kotlinx.android.synthetic.main.activity_mortgage.*

class mortgage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        setContentView(R.layout.activity_mortgage)

        btnCalculate.setOnClickListener {
            if (etxtPrincipal.text.isNotEmpty() && etxtInterestRate.text.isNotEmpty()){
                var rate : Double = etxtInterestRate.text.toString().toDouble() ?: 1.0
                var P : Double = etxtPrincipal.text.toString().toDouble() ?: 1.0
                var T : Double  = spinTerm.selectedItem.toString().toDouble() ?: 1.0
                var N : Double = (T * 12)
                var payment : Double = P*((rate*rate++)*N) /((rate+1)*N+1)
                txtPayment.visibility = View.VISIBLE
               txtPayment.text = payment.toString()
            } else {
                Toast.makeText(this, "Please fill out every field", Toast.LENGTH_SHORT).show()

            }

            }

        }
    }


