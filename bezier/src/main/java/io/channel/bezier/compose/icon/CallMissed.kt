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

val BezierIcon.CallMissed: ImageVector
    get() {
        return _callMissed ?: ImageVector.Builder(
                name = "CallMissed",
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
                moveTo(21.2071f, 9.7071f)
                curveTo(20.8166f, 10.0976f, 20.1834f, 10.0976f, 19.7929f, 9.7071f)
                lineTo(17.75f, 7.6642f)
                lineTo(15.7071f, 9.7071f)
                curveTo(15.3166f, 10.0976f, 14.6834f, 10.0976f, 14.2929f, 9.7071f)
                curveTo(13.9024f, 9.3166f, 13.9024f, 8.6834f, 14.2929f, 8.2929f)
                lineTo(16.3358f, 6.25f)
                lineTo(14.2929f, 4.2071f)
                curveTo(13.9024f, 3.8166f, 13.9024f, 3.1834f, 14.2929f, 2.7929f)
                curveTo(14.6834f, 2.4024f, 15.3166f, 2.4024f, 15.7071f, 2.7929f)
                lineTo(17.75f, 4.8358f)
                lineTo(19.7929f, 2.7929f)
                curveTo(20.1834f, 2.4024f, 20.8166f, 2.4024f, 21.2071f, 2.7929f)
                curveTo(21.5976f, 3.1834f, 21.5976f, 3.8166f, 21.2071f, 4.2071f)
                lineTo(19.1642f, 6.25f)
                lineTo(21.2071f, 8.2929f)
                curveTo(21.5976f, 8.6834f, 21.5976f, 9.3166f, 21.2071f, 9.7071f)
                close()
                moveTo(7.7509f, 16.2532f)
                curveTo(2.5859f, 11.0883f, 2.5859f, 6.569f, 4.2f, 4.9549f)
                curveTo(5.1684f, 3.9865f, 6.5842f, 3.7237f, 7.4281f, 4.3093f)
                curveTo(8.2028f, 4.8258f, 9.3649f, 6.2835f, 9.3649f, 7.5374f)
                curveTo(9.3649f, 8.2936f, 8.807f, 8.9439f, 8.3472f, 9.4799f)
                curveTo(8.0219f, 9.859f, 7.7457f, 10.181f, 7.7509f, 10.4427f)
                curveTo(7.7634f, 11.0743f, 8.458f, 12.7177f, 9.8722f, 14.1319f)
                curveTo(11.2864f, 15.5461f, 12.9298f, 16.2407f, 13.5615f, 16.2532f)
                curveTo(13.8232f, 16.2584f, 14.1451f, 15.9822f, 14.5243f, 15.6569f)
                curveTo(15.0602f, 15.1971f, 15.7105f, 14.6392f, 16.4667f, 14.6392f)
                curveTo(17.7207f, 14.6392f, 19.1783f, 15.8013f, 19.6948f, 16.5761f)
                curveTo(20.2804f, 17.4199f, 20.0176f, 18.8357f, 19.0492f, 19.8042f)
                curveTo(17.4352f, 21.4182f, 12.9158f, 21.4182f, 7.7509f, 16.2532f)
                close()
            }
        }.build().also {
            _callMissed = it
        }
    }

private var _callMissed: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallMissedIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CallMissed,
            contentDescription = null,
    )
}
