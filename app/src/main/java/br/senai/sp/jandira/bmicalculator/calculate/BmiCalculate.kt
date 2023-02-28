package br.senai.sp.jandira.bmicalculator.calculate

import android.content.Context
import androidx.compose.runtime.MutableState
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.bmicalculator.R
import kotlin.math.pow

fun calculate(weight: Double, height: Double) = weight / (height / 100).pow(2)

fun getBmiClassification(bmi: Double, context: Context) : String {
    return if(bmi < 18.5){
        context.getString(R.string.underweight)
    } else if(bmi >= 18.5 && bmi < 25.0){
        context.getString(R.string.normal_weight)
    } else if(bmi >= 25.0 && bmi < 30.0){
        context.getString(R.string.over_weight)
    }else if(bmi >= 30.0 && bmi < 40.0){
        context.getString(R.string.obesity)
    }
    else{
        context.getString(R.string.morbid_obesity)
    }
}

//String text = String.format(res.getString(R.string.nome)



//fun calculate (weight: Double height: Double) : Double {
  //  return weight / height.pow(2)
//}