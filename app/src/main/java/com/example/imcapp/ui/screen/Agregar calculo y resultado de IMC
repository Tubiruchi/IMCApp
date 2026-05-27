package com.example.imcapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imcapp.ui.theme.IMCAppTheme
import java.util.Locale

@Composable
fun BmiScreen() {
    var heightCm by rememberSaveable { mutableFloatStateOf(170f) }
    var weightKg by rememberSaveable { mutableFloatStateOf(70f) }
    val bmi = calculateBmi(weightKg, heightCm)
    val category = getBmiCategory(bmi)

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
            value = heightCm,
            valueRange = 120f..220f,
            unit = "cm",
            onValueChange = { heightCm = it }
        )

        Spacer(modifier = Modifier.height(32.dp))

        BmiBar(
            label = "Tu peso",
            value = weightKg,
            valueRange = 30f..200f,
            unit = "kg",
            onValueChange = { weightKg = it }
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Tu IMC es",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = String.format(Locale.US, "%.1f", bmi),
            color = Color(0xFFE91E3A),
            fontSize = 56.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Clasificacion: $category",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
private fun BmiBar(
    label: String,
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    unit: String,
    onValueChange: (Float) -> Unit
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
            Slider(
                value = value,
                onValueChange = onValueChange,
                valueRange = valueRange,
                colors = SliderDefaults.colors(
                    thumbColor = Color(0xFF536596),
                    activeTrackColor = Color(0xFF536596),
                    inactiveTrackColor = Color(0xFFDDE3F6)
                ),
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "${value.toInt()} $unit",
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xFF10223A),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

private fun calculateBmi(weightKg: Float, heightCm: Float): Float {
    val heightMeters = heightCm / 100f
    return weightKg / (heightMeters * heightMeters)
}

private fun getBmiCategory(bmi: Float): String {
    return when {
        bmi < 18.5f -> "Bajo peso"
        bmi < 25f -> "Peso normal"
        bmi < 30f -> "Sobrepeso"
        bmi < 35f -> "Obesidad grado I"
        bmi < 40f -> "Obesidad grado II"
        else -> "Obesidad grado III"
    }
}

@Preview(showBackground = true)
@Composable
fun BmiScreenPreview() {
    IMCAppTheme {
        BmiScreen()
    }
}
