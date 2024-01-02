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

val BezierIcon.CallPushOnFilled: ImageVector
    get() {
        return _callPushOnFilled ?: ImageVector.Builder(
                name = "CallPushOnFilled",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(4.2f, 4.9549f)
                curveTo(2.5859f, 6.569f, 2.5859f, 11.0883f, 7.7509f, 16.2532f)
                curveTo(12.9158f, 21.4182f, 17.4352f, 21.4182f, 19.0492f, 19.8042f)
                curveTo(20.0176f, 18.8357f, 20.2804f, 17.4199f, 19.6948f, 16.5761f)
                curveTo(19.1783f, 15.8013f, 17.7207f, 14.6392f, 16.4667f, 14.6392f)
                curveTo(15.1755f, 14.6392f, 14.1931f, 16.2658f, 13.5615f, 16.2532f)
                curveTo(12.9298f, 16.2407f, 11.2864f, 15.5461f, 9.8722f, 14.1319f)
                curveTo(8.458f, 12.7177f, 7.7634f, 11.0743f, 7.7509f, 10.4427f)
                curveTo(7.7384f, 9.811f, 9.3649f, 8.8286f, 9.3649f, 7.5374f)
                curveTo(9.3649f, 6.2835f, 8.2028f, 4.8258f, 7.4281f, 4.3093f)
                curveTo(6.5842f, 3.7237f, 5.1684f, 3.9865f, 4.2f, 4.9549f)
                close()
                moveTo(21.0f, 6.5f)
                curveTo(21.0f, 8.433f, 19.433f, 10.0f, 17.5f, 10.0f)
                curveTo(15.567f, 10.0f, 14.0f, 8.433f, 14.0f, 6.5f)
                curveTo(14.0f, 4.567f, 15.567f, 3.0f, 17.5f, 3.0f)
                curveTo(19.433f, 3.0f, 21.0f, 4.567f, 21.0f, 6.5f)
                close()
            }
        }.build().also {
            _callPushOnFilled = it
        }
    }

private var _callPushOnFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallPushOnFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CallPushOnFilled,
            contentDescription = null,
    )
}
