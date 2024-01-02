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

val BezierIcon.Out: ImageVector
    get() {
        return _out ?: ImageVector.Builder(
                name = "Out",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(18.7929f, 13.0f)
                lineTo(16.379f, 15.4139f)
                curveTo(15.9885f, 15.8044f, 15.9885f, 16.4376f, 16.379f, 16.8281f)
                curveTo(16.7695f, 17.2186f, 17.4027f, 17.2186f, 17.7932f, 16.8281f)
                lineTo(21.5611f, 13.0602f)
                curveTo(22.1467f, 12.4747f, 22.1467f, 11.5245f, 21.5611f, 10.939f)
                lineTo(17.7932f, 7.1711f)
                curveTo(17.4027f, 6.7806f, 16.7695f, 6.7806f, 16.379f, 7.1711f)
                curveTo(15.9885f, 7.5616f, 15.9885f, 8.1948f, 16.379f, 8.5853f)
                lineTo(18.7937f, 11.0f)
                lineTo(9.0001f, 11.0f)
                curveTo(8.4478f, 11.0f, 8.0001f, 11.4477f, 8.0001f, 12.0f)
                curveTo(8.0001f, 12.5523f, 8.4478f, 13.0f, 9.0001f, 13.0f)
                lineTo(18.7929f, 13.0f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 3.7909f, 3.7909f, 2.0f, 6.0f, 2.0f)
                lineTo(11.0f, 2.0f)
                curveTo(11.5523f, 2.0f, 12.0f, 2.4477f, 12.0f, 3.0f)
                curveTo(12.0f, 3.5523f, 11.5523f, 4.0f, 11.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                curveTo(4.8955f, 4.0f, 4.0f, 4.8954f, 4.0f, 6.0f)
                lineTo(4.0f, 18.0f)
                curveTo(4.0f, 19.1046f, 4.8955f, 20.0f, 6.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                curveTo(11.5523f, 20.0f, 12.0f, 20.4477f, 12.0f, 21.0f)
                curveTo(12.0f, 21.5523f, 11.5523f, 22.0f, 11.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                curveTo(3.7909f, 22.0f, 2.0f, 20.2091f, 2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                close()
            }
        }.build().also {
            _out = it
        }
    }

private var _out: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun OutIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Out,
            contentDescription = null,
    )
}
