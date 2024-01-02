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

val BezierIcon.Devices: ImageVector
    get() {
        return _devices ?: ImageVector.Builder(
                name = "Devices",
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
                moveTo(3.5001f, 5.0001f)
                lineTo(20.5f, 5.0001f)
                curveTo(21.327f, 5.0001f, 22.0f, 5.6731f, 22.0f, 6.5001f)
                lineTo(22.0f, 9.0001f)
                lineTo(20.0f, 9.0001f)
                lineTo(20.0f, 7.0001f)
                lineTo(4.0001f, 7.0001f)
                lineTo(4.0001f, 16.9999f)
                lineTo(14.0f, 16.9999f)
                lineTo(13.9999f, 18.9999f)
                lineTo(1.0f, 19.0f)
                curveTo(0.4477f, 19.0f, -0.0001f, 18.5522f, 0.0f, 17.9999f)
                curveTo(0.0001f, 17.4477f, 0.4477f, 17.0f, 0.9999f, 17.0f)
                lineTo(2.0001f, 16.9999f)
                lineTo(2.0001f, 6.5001f)
                curveTo(2.0001f, 5.6731f, 2.6731f, 5.0001f, 3.5001f, 5.0001f)
                close()
                moveTo(20.006f, 19.9999f)
                lineTo(17.006f, 19.9999f)
                lineTo(17.006f, 12.0f)
                lineTo(20.006f, 12.0f)
                lineTo(20.006f, 19.9999f)
                close()
                moveTo(15.506f, 10.0f)
                lineTo(21.506f, 10.0f)
                curveTo(21.782f, 10.0f, 22.006f, 10.224f, 22.006f, 10.5f)
                lineTo(22.006f, 21.4999f)
                curveTo(22.006f, 21.7759f, 21.782f, 21.9999f, 21.506f, 21.9999f)
                lineTo(15.506f, 21.9999f)
                curveTo(15.229f, 21.9999f, 15.006f, 21.7759f, 15.006f, 21.4999f)
                lineTo(15.006f, 10.5f)
                curveTo(15.006f, 10.224f, 15.229f, 10.0f, 15.506f, 10.0f)
                close()
            }
        }.build().also {
            _devices = it
        }
    }

private var _devices: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun DevicesIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Devices,
            contentDescription = null,
    )
}
