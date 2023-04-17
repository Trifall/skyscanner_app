import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set flight information for departure card
        departureFlightNumber.text = "Flight Number: ABC123"
        departureAirportCode.text = "Departure Airport: XYZ"
        departureTime.text = "Departure Time: 9:00 AM"

        // Set flight information for arrival card
        arrivalAirportCode.text = "Arrival Airport: XYZ"
        arrivalTime.text = "Arrival Time: 11:00 AM"
    }
}
