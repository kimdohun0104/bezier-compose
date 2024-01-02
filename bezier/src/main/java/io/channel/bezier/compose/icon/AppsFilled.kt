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

val BezierIcon.AppsFilled: ImageVector
    get() {
        return _appsFilled ?: ImageVector.Builder(
                name = "AppsFilled",
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
                moveTo(4.0002f, 3.0001f)
                lineTo(10.0002f, 3.0001f)
                curveTo(10.5522f, 3.0001f, 11.0002f, 3.4471f, 11.0002f, 4.0001f)
                lineTo(11.0002f, 10.0001f)
                curveTo(11.0002f, 10.5521f, 10.5522f, 11.0001f, 10.0002f, 11.0001f)
                lineTo(4.0002f, 11.0001f)
                curveTo(3.4482f, 11.0001f, 3.0002f, 10.5521f, 3.0002f, 10.0001f)
                lineTo(3.0002f, 4.0001f)
                curveTo(3.0002f, 3.4471f, 3.4482f, 3.0001f, 4.0002f, 3.0001f)
                close()
                moveTo(14.0002f, 3.0001f)
                lineTo(20.0002f, 3.0001f)
                curveTo(20.5522f, 3.0001f, 21.0002f, 3.4471f, 21.0002f, 4.0001f)
                lineTo(21.0002f, 10.0001f)
                curveTo(21.0002f, 10.5521f, 20.5522f, 11.0001f, 20.0002f, 11.0001f)
                lineTo(14.0002f, 11.0001f)
                curveTo(13.4482f, 11.0001f, 13.0002f, 10.5521f, 13.0002f, 10.0001f)
                lineTo(13.0002f, 4.0001f)
                curveTo(13.0002f, 3.4471f, 13.4482f, 3.0001f, 14.0002f, 3.0001f)
                close()
                moveTo(10.0002f, 13.0001f)
                lineTo(4.0002f, 13.0001f)
                curveTo(3.4482f, 13.0001f, 3.0002f, 13.4471f, 3.0002f, 14.0001f)
                lineTo(3.0002f, 20.0001f)
                curveTo(3.0002f, 20.5521f, 3.4482f, 21.0001f, 4.0002f, 21.0001f)
                lineTo(10.0002f, 21.0001f)
                curveTo(10.5522f, 21.0001f, 11.0002f, 20.5521f, 11.0002f, 20.0001f)
                lineTo(11.0002f, 14.0001f)
                curveTo(11.0002f, 13.4471f, 10.5522f, 13.0001f, 10.0002f, 13.0001f)
                close()
                moveTo(14.0002f, 13.0001f)
                lineTo(20.0002f, 13.0001f)
                curveTo(20.5522f, 13.0001f, 21.0002f, 13.4471f, 21.0002f, 14.0001f)
                lineTo(21.0002f, 20.0001f)
                curveTo(21.0002f, 20.5521f, 20.5522f, 21.0001f, 20.0002f, 21.0001f)
                lineTo(14.0002f, 21.0001f)
                curveTo(13.4482f, 21.0001f, 13.0002f, 20.5521f, 13.0002f, 20.0001f)
                lineTo(13.0002f, 14.0001f)
                curveTo(13.0002f, 13.4471f, 13.4482f, 13.0001f, 14.0002f, 13.0001f)
                close()
            }
        }.build().also {
            _appsFilled = it
        }
    }

private var _appsFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AppsFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.AppsFilled,
            contentDescription = null,
    )
}
