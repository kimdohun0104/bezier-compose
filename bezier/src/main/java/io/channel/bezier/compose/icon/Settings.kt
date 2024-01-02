@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Settings: ImageVector
    get() {
        return _settings ?: ImageVector.Builder(
                name = "Settings",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.0002f, 12.0001f)
                curveTo(7.0002f, 9.2393f, 9.2385f, 7.0001f, 12.0002f, 7.0001f)
                curveTo(14.761f, 7.0001f, 17.0002f, 9.2393f, 17.0002f, 12.0001f)
                curveTo(17.0002f, 14.7609f, 14.761f, 17.0001f, 12.0002f, 17.0001f)
                curveTo(9.2385f, 17.0001f, 7.0002f, 14.7609f, 7.0002f, 12.0001f)
                close()
                moveTo(22.0002f, 13.5001f)
                lineTo(22.0002f, 10.5001f)
                lineTo(19.7702f, 10.1281f)
                curveTo(19.5712f, 9.3061f, 19.2472f, 8.5341f, 18.8152f, 7.8321f)
                lineTo(20.1312f, 5.9891f)
                lineTo(18.0102f, 3.8681f)
                lineTo(16.1672f, 5.1851f)
                curveTo(15.4652f, 4.7531f, 14.6942f, 4.4291f, 13.8722f, 4.2301f)
                lineTo(13.5002f, 2.0001f)
                lineTo(10.5002f, 2.0001f)
                lineTo(10.1282f, 4.2301f)
                curveTo(9.3062f, 4.4291f, 8.5342f, 4.7531f, 7.8322f, 5.1851f)
                lineTo(5.9892f, 3.8681f)
                lineTo(3.8682f, 5.9891f)
                lineTo(5.1842f, 7.8321f)
                curveTo(4.7532f, 8.5341f, 4.4282f, 9.3061f, 4.2302f, 10.1281f)
                lineTo(2.0002f, 10.5001f)
                lineTo(2.0002f, 13.5001f)
                lineTo(4.2302f, 13.8721f)
                curveTo(4.4282f, 14.6941f, 4.7532f, 15.4661f, 5.1842f, 16.1681f)
                lineTo(3.8682f, 18.0111f)
                lineTo(5.9892f, 20.1321f)
                lineTo(7.8322f, 18.8151f)
                curveTo(8.5342f, 19.2461f, 9.3062f, 19.5711f, 10.1282f, 19.7701f)
                lineTo(10.5002f, 22.0001f)
                lineTo(13.5002f, 22.0001f)
                lineTo(13.8722f, 19.7701f)
                curveTo(14.6942f, 19.5711f, 15.4652f, 19.2461f, 16.1672f, 18.8151f)
                lineTo(18.0102f, 20.1321f)
                lineTo(20.1312f, 18.0111f)
                lineTo(18.8152f, 16.1681f)
                curveTo(19.2472f, 15.4661f, 19.5712f, 14.6941f, 19.7702f, 13.8721f)
                lineTo(22.0002f, 13.5001f)
                close()
            }
        }.build().also {
            _settings = it
        }
    }

private var _settings: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SettingsIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Settings,
            contentDescription = null,
    )
}
