package br.senai.sp.jandira.bmicalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmicalculator.ui.theme.BMICalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMICalculatorTheme {
                Column(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Hello, world!",
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Black)
                            .padding(32.dp),
                        color = Color(red = 3, green = 169, blue = 244, alpha = 255),
                        fontSize = 32.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold


                    )
                    Text(
                        text = "Vinicius Nunes",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color(red = 3, green = 169, blue = 244, alpha = 255),
                        textAlign = TextAlign.Center,
                        fontSize = 28.sp,
                    )
                    TextField(
                        value = "", 
                        onValueChange = {},
                    label = {
                        Text(text = "Qual o seu nome?"),

                    })
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Qual o seu CPF?")
                        },
                        shape = RoundedCornerShape(20.dp)
                    )
                    Row(
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(top = 16.dp),
                       horizontalArrangement = Arrangement.SpaceAround
                   ) {
                       for(i in 1..3){

                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Volta $i",
                               fontSize = 18.sp)
                       }
                   }
                }

            }
        }
    }
}}