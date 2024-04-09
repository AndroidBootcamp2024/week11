package com.kodeco.android.countryinfo.ui.screens.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kodeco.android.countryinfo.R

@Composable
fun SettingsScreen(
    localStorage: Boolean,
    favoriteFeature: Boolean,
    screenRotation: Boolean,
    onLocalStorageChange: () -> Unit,
    onFavoritesFeatureChange: () -> Unit,
    onScreenRotationChange: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Row {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = stringResource(id = R.string.settings),
                modifier= Modifier.size(32.dp)
            )
            Text(
                text = "Settings",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp, start = 16.dp)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.local_storage),
                modifier = Modifier.weight(1f)
            )
            Switch(
                checked = localStorage,
                onCheckedChange = { onLocalStorageChange() }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.favorites_feature),
                modifier = Modifier.weight(1f)
            )
            Switch(
                checked = favoriteFeature,
                onCheckedChange = { onFavoritesFeatureChange() }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.screen_rotation),
                modifier = Modifier.weight(1f)
            )
            Switch(
                checked = screenRotation,
                onCheckedChange = { onScreenRotationChange() }
            )
        }
    }
}

@Composable
@Preview
fun SettingsScreenPreview(
) {
    SettingsScreen(
        localStorage = true,
        favoriteFeature = true,
        screenRotation = false,
        onLocalStorageChange = {},
        onFavoritesFeatureChange = {},
        onScreenRotationChange = {})
}