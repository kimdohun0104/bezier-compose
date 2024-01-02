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

val BezierIcon.ArrowHookLeftUp: ImageVector
    get() {
        return _arrowHookLeftUp ?: ImageVector.Builder(
                name = "ArrowHookLeftUp",
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
                moveTo(14.5002f, 8.0001f)
                lineTo(5.2072f, 8.0001f)
                lineTo(8.4733f, 4.7332f)
                curveTo(8.8638f, 4.3427f, 8.8637f, 3.7096f, 8.4733f, 3.3192f)
                curveTo(8.0828f, 2.9287f, 7.4496f, 2.9287f, 7.0592f, 3.3192f)
                lineTo(2.4392f, 7.9391f)
                curveTo(1.8542f, 8.5241f, 1.8542f, 9.4761f, 2.4392f, 10.0611f)
                lineTo(7.0592f, 14.6802f)
                curveTo(7.4497f, 15.0706f, 8.0827f, 15.0706f, 8.4732f, 14.6802f)
                curveTo(8.8637f, 14.2897f, 8.8637f, 13.6566f, 8.4732f, 13.2661f)
                lineTo(5.2072f, 10.0001f)
                lineTo(14.5002f, 10.0001f)
                curveTo(16.9812f, 10.0001f, 19.0002f, 12.0191f, 19.0002f, 14.5001f)
                curveTo(19.0002f, 16.9811f, 16.9812f, 19.0001f, 14.5002f, 19.0001f)
                lineTo(11.0002f, 19.0001f)
                curveTo(10.4479f, 19.0001f, 10.0002f, 19.4478f, 10.0002f, 20.0001f)
                curveTo(10.0002f, 20.5524f, 10.4479f, 21.0001f, 11.0002f, 21.0001f)
                lineTo(14.5002f, 21.0001f)
                curveTo(18.0842f, 21.0001f, 21.0002f, 18.0841f, 21.0002f, 14.5001f)
                curveTo(21.0002f, 10.9161f, 18.0842f, 8.0001f, 14.5002f, 8.0001f)
                close()
            }
        }.build().also {
            _arrowHookLeftUp = it
        }
    }

private var _arrowHookLeftUp: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowHookLeftUpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ArrowHookLeftUp,
            contentDescription = null,
    )
}
