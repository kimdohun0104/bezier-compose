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

val BezierIcon.CommentFilled: ImageVector
    get() {
        return _commentFilled ?: ImageVector.Builder(
                name = "CommentFilled",
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
                moveTo(7.0f, 3.0f)
                curveTo(4.7909f, 3.0f, 3.0f, 4.7909f, 3.0f, 7.0f)
                lineTo(3.0f, 20.9597f)
                curveTo(3.0f, 22.2174f, 4.4549f, 22.9167f, 5.437f, 22.131f)
                lineTo(8.8029f, 19.4383f)
                curveTo(9.1576f, 19.1546f, 9.5982f, 19.0f, 10.0523f, 19.0f)
                lineTo(17.0f, 19.0f)
                curveTo(19.2091f, 19.0f, 21.0f, 17.2091f, 21.0f, 15.0f)
                lineTo(21.0f, 7.0f)
                curveTo(21.0f, 4.7909f, 19.2091f, 3.0f, 17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                close()
                moveTo(7.0f, 9.0f)
                curveTo(7.0f, 8.4477f, 7.4477f, 8.0f, 8.0f, 8.0f)
                lineTo(16.0f, 8.0f)
                curveTo(16.5523f, 8.0f, 17.0f, 8.4477f, 17.0f, 9.0f)
                curveTo(17.0f, 9.5523f, 16.5523f, 10.0f, 16.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                curveTo(7.4477f, 10.0f, 7.0f, 9.5523f, 7.0f, 9.0f)
                close()
                moveTo(7.0f, 13.0f)
                curveTo(7.0f, 12.4477f, 7.4477f, 12.0f, 8.0f, 12.0f)
                lineTo(16.0f, 12.0f)
                curveTo(16.5523f, 12.0f, 17.0f, 12.4477f, 17.0f, 13.0f)
                curveTo(17.0f, 13.5523f, 16.5523f, 14.0f, 16.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                curveTo(7.4477f, 14.0f, 7.0f, 13.5523f, 7.0f, 13.0f)
                close()
            }
        }.build().also {
            _commentFilled = it
        }
    }

private var _commentFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CommentFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CommentFilled,
            contentDescription = null,
    )
}
