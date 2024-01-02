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

val BezierIcon.FunnelRemove: ImageVector
    get() {
        return _funnelRemove ?: ImageVector.Builder(
                name = "FunnelRemove",
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
                moveTo(15.0f, 12.8284f)
                lineTo(15.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(13.4423f, 11.0f)
                lineTo(10.5577f, 11.0f)
                curveTo(10.3697f, 10.6342f, 10.1247f, 10.2962f, 9.8284f, 10.0f)
                lineTo(5.0f, 5.1716f)
                lineTo(5.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveTo(3.4477f, 2.0f, 3.0f, 2.4477f, 3.0f, 3.0f)
                lineTo(3.0f, 5.1716f)
                curveTo(3.0f, 5.702f, 3.2107f, 6.2107f, 3.5858f, 6.5858f)
                lineTo(8.4142f, 11.4142f)
                curveTo(8.7893f, 11.7893f, 9.0f, 12.298f, 9.0f, 12.8284f)
                lineTo(9.0f, 21.382f)
                curveTo(9.0f, 21.5372f, 9.0361f, 21.6903f, 9.1056f, 21.8292f)
                curveTo(9.3526f, 22.3232f, 9.9532f, 22.5234f, 10.4472f, 22.2764f)
                lineTo(14.4472f, 20.2764f)
                curveTo(14.786f, 20.107f, 15.0f, 19.7607f, 15.0f, 19.382f)
                lineTo(15.0f, 13.0f)
                lineTo(15.0f, 12.8284f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(13.0f, 18.763f)
                lineTo(11.0f, 19.763f)
                lineTo(11.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                close()
                moveTo(14.4628f, 3.8788f)
                lineTo(16.5841f, 6.0001f)
                lineTo(14.4628f, 8.1214f)
                lineTo(15.877f, 9.5357f)
                lineTo(17.9983f, 7.4143f)
                lineTo(20.1197f, 9.5357f)
                lineTo(21.5339f, 8.1214f)
                lineTo(19.4126f, 6.0001f)
                lineTo(21.5339f, 3.8788f)
                lineTo(20.1197f, 2.4646f)
                lineTo(17.9983f, 4.5859f)
                lineTo(15.877f, 2.4646f)
                lineTo(14.4628f, 3.8788f)
                close()
            }
        }.build().also {
            _funnelRemove = it
        }
    }

private var _funnelRemove: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FunnelRemoveIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.FunnelRemove,
            contentDescription = null,
    )
}
