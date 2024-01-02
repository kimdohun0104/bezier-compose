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

val BezierIcon.ZoomOut: ImageVector
    get() {
        return _zoomOut ?: ImageVector.Builder(
                name = "ZoomOut",
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
                moveTo(4.0003f, 10.0001f)
                curveTo(4.0003f, 13.3091f, 6.6913f, 16.0001f, 10.0003f, 16.0001f)
                curveTo(13.3093f, 16.0001f, 16.0003f, 13.3091f, 16.0003f, 10.0001f)
                curveTo(16.0003f, 6.6911f, 13.3093f, 4.0001f, 10.0003f, 4.0001f)
                curveTo(6.6913f, 4.0001f, 4.0003f, 6.6911f, 4.0003f, 10.0001f)
                close()
                moveTo(21.7073f, 20.293f)
                curveTo(22.0977f, 20.6835f, 22.0977f, 21.3166f, 21.7072f, 21.7071f)
                curveTo(21.3168f, 22.0976f, 20.6837f, 22.0976f, 20.2932f, 21.7071f)
                lineTo(14.8972f, 16.3121f)
                curveTo(13.5422f, 17.3661f, 11.8462f, 18.0001f, 10.0002f, 18.0001f)
                curveTo(5.5892f, 18.0001f, 2.0002f, 14.4111f, 2.0002f, 10.0001f)
                curveTo(2.0002f, 5.5891f, 5.5892f, 2.0001f, 10.0002f, 2.0001f)
                curveTo(14.4112f, 2.0001f, 18.0002f, 5.5891f, 18.0002f, 10.0001f)
                curveTo(18.0002f, 11.8461f, 17.3662f, 13.5421f, 16.3122f, 14.8971f)
                lineTo(21.7073f, 20.293f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                lineTo(14.0f, 11.0f)
                close()
            }
        }.build().also {
            _zoomOut = it
        }
    }

private var _zoomOut: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ZoomOutIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ZoomOut,
            contentDescription = null,
    )
}
