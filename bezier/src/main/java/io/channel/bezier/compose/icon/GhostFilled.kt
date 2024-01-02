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

val BezierIcon.GhostFilled: ImageVector
    get() {
        return _ghostFilled ?: ImageVector.Builder(
                name = "GhostFilled",
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
                moveTo(15.1192f, 11.468f)
                curveTo(14.2988f, 11.468f, 13.9558f, 10.886f, 13.9558f, 9.46f)
                curveTo(13.9558f, 8.035f, 14.2988f, 7.452f, 15.1192f, 7.452f)
                curveTo(15.9396f, 7.452f, 16.2826f, 8.035f, 16.2826f, 9.46f)
                curveTo(16.2826f, 10.886f, 15.9396f, 11.468f, 15.1192f, 11.468f)
                close()
                moveTo(8.8808f, 11.468f)
                curveTo(8.0604f, 11.468f, 7.7184f, 10.886f, 7.7184f, 9.46f)
                curveTo(7.7184f, 8.035f, 8.0604f, 7.452f, 8.8808f, 7.452f)
                curveTo(9.7012f, 7.452f, 10.0442f, 8.035f, 10.0442f, 9.46f)
                curveTo(10.0442f, 10.886f, 9.7012f, 11.468f, 8.8808f, 11.468f)
                close()
                moveTo(12.0005f, 2.0f)
                curveTo(7.8752f, 2.0f, 4.5f, 5.316f, 4.5f, 9.368f)
                lineTo(4.5f, 19.266f)
                curveTo(4.5f, 20.627f, 6.2548f, 21.215f, 7.1006f, 20.138f)
                lineTo(7.1006f, 20.137f)
                curveTo(7.6818f, 19.398f, 8.8177f, 19.398f, 9.3989f, 20.137f)
                lineTo(10.1674f, 21.115f)
                curveTo(11.0946f, 22.295f, 12.9054f, 22.295f, 13.8326f, 21.115f)
                lineTo(14.6011f, 20.137f)
                curveTo(15.1823f, 19.398f, 16.3182f, 19.398f, 16.8994f, 20.137f)
                lineTo(16.8994f, 20.138f)
                curveTo(17.7452f, 21.215f, 19.5f, 20.627f, 19.5f, 19.266f)
                lineTo(19.5f, 9.368f)
                curveTo(19.5f, 5.316f, 16.1248f, 2.0f, 12.0005f, 2.0f)
                close()
            }
        }.build().also {
            _ghostFilled = it
        }
    }

private var _ghostFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GhostFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.GhostFilled,
            contentDescription = null,
    )
}
