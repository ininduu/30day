package trpl.example.a30day.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import trpl.example.a30day.Model.Recipe
import trpl.example.components.RecipeCard

@Composable
fun RecipeListScreen(contentPadding: PaddingValues) {
    LazyColumn(
        contentPadding = contentPadding
    ) {
        items(Recipe.recipes) { recipe ->
            RecipeCard(recipe = recipe)
        }
    }
}