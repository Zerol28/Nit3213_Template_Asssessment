package com.vu.androidbasicapp
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ArchitectureDetailsActivity : AppCompatActivity() {

    private lateinit var ArchitectureName: TextView
    private lateinit var ArchitectureArchitect: TextView
    private lateinit var ArchitectureLocation: TextView
    private lateinit var ArchitectureYearCompleted: TextView
    private lateinit var ArchitectureStyle: TextView
    private lateinit var ArchitectureHeight: TextView
    private lateinit var ArchitectureDescription: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_architecture_details)

        // Initialize views
        ArchitectureName = findViewById(R.id.ArchitectureName)
        ArchitectureArchitect = findViewById(R.id.ArchitectureArchitect)
        ArchitectureLocation = findViewById(R.id.ArchitectureLocation)
        ArchitectureYearCompleted = findViewById(R.id.ArchitectureYearCompleted)
        ArchitectureStyle = findViewById(R.id.ArchitectureStyle)
        ArchitectureHeight = findViewById(R.id.ArchitectureHeight)
        ArchitectureDescription = findViewById(R.id.ArchitectureDescription)


        // Retrieve the data from the intent
        val IV_ArchitectureName = intent.getStringExtra("ArchitectureName") ?: "Architecture"
        val IV_ArchitectureArchitect = intent.getStringExtra("ArchitectureArchitect") ?: "Unknown"
        val IV_ArchitectureLocation = intent.getStringExtra("ArchitectureLocation") ?: "Unknown"
        val IV_ArchitectureYearCompleted = intent.getIntExtra("ArchitectureYearCompleted", 0)
        val IV_ArchitectureStyle = intent.getStringExtra("ArchitectureStyle") ?: "Unknown"
        val IV_ArchitectureHeight = intent.getIntExtra("ArchitectureHeight", 0)
        val IV_ArchitectureDescription = intent.getStringExtra("ArchitectureDescription") ?: "No description available"

        // Set the data to the TextViews
        ArchitectureName.text = "Architecture Name: $IV_ArchitectureName"
        ArchitectureArchitect.text = "Architect: $IV_ArchitectureArchitect"
        ArchitectureLocation.text = "Architecture Location: $IV_ArchitectureLocation"
        ArchitectureYearCompleted.text = "Year Completed: $IV_ArchitectureYearCompleted"
        ArchitectureStyle.text = "Architecture Stlye: $IV_ArchitectureStyle"
        ArchitectureHeight.text = "Architecture Height: $IV_ArchitectureHeight"
        ArchitectureDescription.text = "Architecture Description: $IV_ArchitectureDescription"


    }



    fun goBackToDashboard(view: View) {
        finish()
    }
}