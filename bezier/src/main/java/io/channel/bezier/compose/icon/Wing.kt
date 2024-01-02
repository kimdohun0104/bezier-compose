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

val BezierIcon.Wing: ImageVector
    get() {
        return _wing ?: ImageVector.Builder(
                name = "Wing",
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
                moveTo(18.2197f, 8.0f)
                lineTo(12.2197f, 8.0f)
                lineTo(11.2197f, 8.0f)
                lineTo(11.2197f, 10.0f)
                lineTo(12.2197f, 10.0f)
                lineTo(18.2197f, 10.0f)
                curveTo(18.2197f, 11.103f, 17.3227f, 12.0f, 16.2197f, 12.0f)
                lineTo(10.2197f, 12.0f)
                lineTo(9.2197f, 12.0f)
                lineTo(9.2197f, 14.0f)
                lineTo(10.2197f, 14.0f)
                lineTo(15.2197f, 14.0f)
                curveTo(15.2197f, 15.103f, 14.3227f, 16.0f, 13.2197f, 16.0f)
                lineTo(9.1277f, 16.0f)
                curveTo(8.3357f, 16.0f, 7.5677f, 16.232f, 6.9087f, 16.672f)
                lineTo(5.4207f, 17.664f)
                curveTo(5.1267f, 17.86f, 4.7907f, 17.974f, 4.4407f, 17.996f)
                lineTo(4.6457f, 16.969f)
                curveTo(4.8777f, 15.809f, 5.0347f, 14.633f, 5.1877f, 13.496f)
                lineTo(5.3207f, 12.521f)
                curveTo(5.8737f, 8.56f, 8.5817f, 6.0f, 12.2197f, 6.0f)
                lineTo(20.2197f, 6.0f)
                curveTo(20.2197f, 7.103f, 19.3227f, 8.0f, 18.2197f, 8.0f)
                close()
                moveTo(12.2197f, 4.0f)
                curveTo(7.5247f, 4.0f, 4.0387f, 7.236f, 3.3397f, 12.244f)
                lineTo(3.2057f, 13.23f)
                curveTo(3.0567f, 14.336f, 2.9037f, 15.479f, 2.6847f, 16.577f)
                lineTo(1.9997f, 20.0f)
                lineTo(4.3107f, 20.0f)
                curveTo(5.1037f, 20.0f, 5.8707f, 19.768f, 6.5297f, 19.328f)
                lineTo(8.0187f, 18.336f)
                curveTo(8.3477f, 18.116f, 8.7317f, 18.0f, 9.1277f, 18.0f)
                lineTo(13.2197f, 18.0f)
                curveTo(15.4257f, 18.0f, 17.2197f, 16.206f, 17.2197f, 14.0f)
                lineTo(17.2197f, 13.858f)
                curveTo(18.9397f, 13.411f, 20.2197f, 11.858f, 20.2197f, 10.0f)
                lineTo(20.2197f, 9.443f)
                curveTo(21.4097f, 8.75f, 22.2197f, 7.474f, 22.2197f, 6.0f)
                lineTo(22.2197f, 4.0f)
                lineTo(12.2197f, 4.0f)
                close()
            }
        }.build().also {
            _wing = it
        }
    }

private var _wing: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WingIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Wing,
            contentDescription = null,
    )
}
