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

val BezierIcon.ShoppingFilled: ImageVector
    get() {
        return _shoppingFilled ?: ImageVector.Builder(
                name = "ShoppingFilled",
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
                moveTo(12.0f, 1.0f)
                curveTo(14.2091f, 1.0f, 16.0f, 2.7909f, 16.0f, 5.0f)
                lineTo(16.0f, 7.0f)
                lineTo(19.5f, 7.0f)
                curveTo(20.3284f, 7.0f, 21.0f, 7.6716f, 21.0f, 8.5f)
                lineTo(21.0f, 16.5f)
                curveTo(21.0f, 18.9853f, 18.9853f, 21.0f, 16.5f, 21.0f)
                lineTo(7.5f, 21.0f)
                curveTo(5.0147f, 21.0f, 3.0f, 18.9853f, 3.0f, 16.5f)
                lineTo(3.0f, 8.5f)
                curveTo(3.0f, 7.6716f, 3.6716f, 7.0f, 4.5f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 5.0f)
                curveTo(8.0f, 2.7909f, 9.7909f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                lineTo(14.0f, 5.0f)
                curveTo(14.0f, 3.9456f, 13.1841f, 3.0818f, 12.1493f, 3.0055f)
                lineTo(12.0f, 3.0f)
                curveTo(10.9456f, 3.0f, 10.0818f, 3.8159f, 10.0055f, 4.8507f)
                lineTo(10.0f, 5.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.5523f, 12.0f, 10.0f, 11.5523f, 10.0f, 11.0f)
                curveTo(10.0f, 10.4477f, 9.5523f, 10.0f, 9.0f, 10.0f)
                curveTo(8.4477f, 10.0f, 8.0f, 10.4477f, 8.0f, 11.0f)
                curveTo(8.0f, 11.5523f, 8.4477f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(15.5523f, 12.0f, 16.0f, 11.5523f, 16.0f, 11.0f)
                curveTo(16.0f, 10.4477f, 15.5523f, 10.0f, 15.0f, 10.0f)
                curveTo(14.4477f, 10.0f, 14.0f, 10.4477f, 14.0f, 11.0f)
                curveTo(14.0f, 11.5523f, 14.4477f, 12.0f, 15.0f, 12.0f)
                close()
            }
        }.build().also {
            _shoppingFilled = it
        }
    }

private var _shoppingFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShoppingFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ShoppingFilled,
            contentDescription = null,
    )
}
