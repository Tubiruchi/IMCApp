package com.example.imcapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imcapp.ui.theme.IMCAppTheme

@Composable
fun BmiScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Calculadora de IMC",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(36.dp))

        BmiBar(
            label = "Tu altura",
            valueText = "170 cm",
            progress = 0.55f
        )

        Spacer(modifier = Modifier.height(32.dp))

        BmiBar(
            label = "Tu peso",
            valueText = "70 kg",
            progress = 0.30f
        )
    }
}

@Composable
private fun BmiBar(
    label: String,
    valueText: String,
    progress: Float
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = label,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(18.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(18.dp)
                        .background(
                            color = Color(0xFFDDE3F6),
                            shape = RoundedCornerShape(12.dp)
                        )
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth(progress)
                        .height(18.dp)
                        .background(
                            color = Color(0xFF536596),
                            shape = RoundedCornerShape(12.dp)
                        )
                )

                Box(
                    modifier = Modifier
                        .padding(start = 96.dp)
                        .width(4.dp)
                        .height(48.dp)
                        .background(Color(0xFF536596))
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .size(10.dp)
                        .background(Color(0xFF536596), CircleShape)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = valueText,
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xFF10223A),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BmiScreenPreview() {
    IMCAppTheme {
        BmiScreen()
    }
}
