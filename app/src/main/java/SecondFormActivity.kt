import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.R


class SecondFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_form)


        val etSecondName = findViewById<EditText>(R.id.etSecondName)
        val etSecondEmail = findViewById<EditText>(R.id.etSecondEmail)
        val btnSecondSubmit = findViewById<Button>(R.id.btnSecondSubmit)


        btnSecondSubmit.setOnClickListener {
            val secondName = etSecondName.text.toString()
            val secondEmail = etSecondEmail.text.toString()

            if (secondName.isNotEmpty() && secondEmail.isNotEmpty()) {

                Toast.makeText(this, "Datos enviados: $secondName, $secondEmail", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
