package com.example.flowlayoutdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flowlayoutdemo.ui.theme.FlowLayoutDemoTheme
import com.google.accompanist.flowlayout.FlowColumn
import com.google.accompanist.flowlayout.FlowRow


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowLayoutDemoTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp),

                    ) {
                        Text("----- Flow Row -----")
                        FlowRowExample(
                            listOf(
                                "Deep into the ocean",
                                "Wrong Turn",
                                "Army of dead",
                                "Now you see me",
                                "Avengers",
                                "Iron Man",
                                "Deep water",
                                "Captain america: and the winter soldier",
                                "Journey to the center of the earth",
                                "Rampage"
                            )
                        )

                        Text("----- Flow Column -----")
                        FlowColumnExample(
                            listOf(
                                "Spider-man",
                                "Middle of the east",
                                "Bodyguard",
                                "Saw",
                                "Sonic",
                                "Last day on earth",
                                "Rise and Shine",
                                "On and off",
                                "Moon fall",
                                "Interstellar",
                                "Superman",
                                "Dawn",
                                "Don't say no",
                                "Keep Quite",
                                "harry Porter",
                                "Sniper",
                                "Solar eclipse",
                                "Spectre",
                                "Twilight"
                            )
                        )
                    }
                }
            }
        }
    }
}

/**
 * FLOW ROW EXAMPLE
 * */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FlowRowExample(list: List<String>) {
    FlowRow {
        for (albumName in list) {
            Chip(modifier = Modifier.padding(end = 4.dp), onClick = {}) {
                Text(albumName)
            }
        }
    }
}

/**
 * FLOW COLUMN EXAMPLE
 * */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FlowColumnExample(list: List<String>) {
    FlowColumn {
        for (albumName in list) {
            Chip(modifier = Modifier.padding(end = 4.dp), onClick = {}) {
                Text(albumName)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FlowLayoutDemoTheme {
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("----- Flow Row -----")
            FlowRowExample(
                listOf(
                    "Rise and Shine",
                    "Winter of the South",
                    "Kind of",
                    "I dunno what to say",
                    "Hell on earth",
                    "Rise and Shine",
                    "Winter of the South",
                    "Kind of",
                    "I dunno what to say",
                    "Hell on earth"
                )
            )

            Text("----- Flow Column -----")
            FlowColumnExample(
                listOf(
                    "Rise and Shine",
                    "Winter of the South",
                    "Kind of",
                    "I dunno what to say",
                    "Hell on earth",
                    "Rise and Shine",
                    "Winter of the South",
                    "Kind of",
                    "I dunno what to say",
                    "Hell on earth", "Rise and Shine",
                    "Winter of the South",
                    "Kind of",
                    "I dunno what to say",
                    "Hell on earth",
                    "Rise and Shine",
                    "Winter of the South",
                    "Kind of",
                    "I dunno what to say",
                    "Hell on earth"
                )
            )
        }
    }
}