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

val BezierIcon.HeartFilled: ImageVector
    get() {
        return _heartFilled ?: ImageVector.Builder(
                name = "HeartFilled",
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
                moveTo(20.3351f, 4.9667f)
                curveTo(19.9291f, 4.5606f, 19.3961f, 4.2357f, 18.8191f, 3.9746f)
                curveTo(16.4261f, 2.8926f, 13.2961f, 3.6806f, 12.0001f, 6.1326f)
                curveTo(10.7031f, 3.6806f, 7.5731f, 2.8926f, 5.1811f, 3.9746f)
                curveTo(4.6041f, 4.2357f, 4.0711f, 4.5606f, 3.6651f, 4.9667f)
                curveTo(1.5121f, 7.1196f, 1.4601f, 10.3947f, 3.4321f, 12.7647f)
                curveTo(5.5551f, 15.3157f, 9.1511f, 18.6707f, 11.3351f, 20.6427f)
                curveTo(11.7151f, 20.9867f, 12.2841f, 20.9867f, 12.6651f, 20.6427f)
                curveTo(14.8491f, 18.6707f, 18.4451f, 15.3157f, 20.5681f, 12.7647f)
                curveTo(22.5391f, 10.3947f, 22.4881f, 7.1196f, 20.3351f, 4.9667f)
                close()
            }
        }.build().also {
            _heartFilled = it
        }
    }

private var _heartFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HeartFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.HeartFilled,
            contentDescription = null,
    )
}
