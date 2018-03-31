package com.visionrunner.firebase001

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
<<<<<<< HEAD
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    // Write a message to the database
    val database = FirebaseDatabase.getInstance()
    val myRef = database.getReference("message")
=======



class MainActivity : AppCompatActivity() {
>>>>>>> c6498624af36fa681f0a396679a0372634132b82

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creates reference to the TextView in the resXML file
        val textView2 = findViewById<TextView>(R.id.textView2)
        textView2.text = "Hello World!"

        // Sets variable for the reference to the TextView in the XML file
        val editText = findViewById<EditText>(R.id.editText2)
        editText.setText("Hi")

        val button = findViewById<Button>(R.id.button)
        button.setText("Submit")
        button.setOnClickListener {
<<<<<<< HEAD
//            textView2.setText(editText.text)
            println("You pressed the button")
            val inputString: String = editText.text.toString()
            saveToFirebase(inputString)
        }

        // Read from the database
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                println(value)
                textView2.setText(value)
//                Log.d(FragmentActivity.TAG, "Value is: " + value!!)
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
//                Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
                println("cancelled")
            }
        })
    }

    fun saveToFirebase(inputString: String) {
        myRef.setValue(inputString)
    }

    fun readFromFirebase() {

=======
            textView2.setText(editText.text)
            println("You pressed the button")
            saveToFirebase()
        }
    }

    fun saveToFirebase() {

        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")
>>>>>>> c6498624af36fa681f0a396679a0372634132b82
    }
}
