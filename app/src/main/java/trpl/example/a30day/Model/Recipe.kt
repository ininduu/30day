package trpl.example.a30day.Model

import trpl.example.a30day.R
import trpl.example.a30day.data.RecipeData

object Recipe {
    val recipes = listOf(
        RecipeData(
            dateRes = R.string.date1,
            titleRes = R.string.title1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.allister
        ),
        RecipeData(
            dateRes = R.string.date2,
            titleRes = R.string.title2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.idzes
        ),
        RecipeData(
            dateRes = R.string.date3,
            titleRes = R.string.title3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.merino
        ),
        RecipeData(
            dateRes = R.string.date4,
            titleRes = R.string.title4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.ronaldo
        )
    )
}