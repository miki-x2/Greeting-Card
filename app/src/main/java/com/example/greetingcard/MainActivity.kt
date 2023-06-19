package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    // onCreate() function is the entry point to this app
    // and calls other functions to build the user interface
    // In Kotlin programs, the main() function is the entry point/starting point of execution
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContent() function is used to define your layout through composable functions
        // All functions marked with @Composable annotation can be called from setContent() or
        // from other Composable functions
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

// Composable function
// Takes some input and generates what's shown on the screen
// @Composable function names are capitalized and can't return anything
//
// Modifier is used to augment or decorate a composable
// One modifier you can use is the padding modifier
// which adds space around the element
// This is accomplished by using the Modifier.padding() function
// Every composable should have an optional parameter of the type Modifier
// This should be the first optional parameter
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // To set a different background color, surround text with Surface
    // Surface is a container that represents a section of UI where you can alter the appearance
    // such as background color or border
    // To surround text with a Surface, highlight the line of text and do Option + Enter
    // and select Surround with widget > Surround with Container
    // Default container is Box, but can change to another container type
    Surface(color = Color.Magenta) {
        Text(
            text = "Hi, my name is $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

// GreetingPreview() lets you see what your composable looks like without
// having to build entire app
// To enable a preview of a composable, annotate with @Composable and @Preview
// @Preview takes in a parameter called showBackground
// If showBackground is set to true, it will add a background to your composable preview
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Miki")
    }
}