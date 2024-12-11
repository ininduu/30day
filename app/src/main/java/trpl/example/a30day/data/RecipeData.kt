package trpl.example.a30day.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RecipeData(
    @StringRes val dateRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
