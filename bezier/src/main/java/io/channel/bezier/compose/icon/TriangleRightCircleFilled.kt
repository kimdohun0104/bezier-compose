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

val BezierIcon.TriangleRightCircleFilled: ImageVector
    get() {
        return _triangleRightCircleFilled ?: ImageVector.Builder(
                name = "TriangleRightCircleFilled",
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
                moveTo(10.2658f, 16.6666f)
                curveTo(10.2508f, 16.6666f, 10.2378f, 16.6606f, 10.2228f, 16.6586f)
                curveTo(10.1688f, 16.6526f, 10.1188f, 16.6326f, 10.0758f, 16.6006f)
                curveTo(10.0608f, 16.5896f, 10.0468f, 16.5786f, 10.0348f, 16.5656f)
                curveTo(9.9878f, 16.5146f, 9.9518f, 16.4506f, 9.9518f, 16.3706f)
                lineTo(9.9518f, 7.6516f)
                curveTo(9.9518f, 7.5716f, 9.9878f, 7.5076f, 10.0348f, 7.4566f)
                curveTo(10.0468f, 7.4426f, 10.0608f, 7.4326f, 10.0758f, 7.4216f)
                curveTo(10.1188f, 7.3896f, 10.1688f, 7.3696f, 10.2228f, 7.3626f)
                curveTo(10.2378f, 7.3616f, 10.2508f, 7.3546f, 10.2658f, 7.3556f)
                curveTo(10.3278f, 7.3586f, 10.3898f, 7.3756f, 10.4438f, 7.4206f)
                lineTo(15.6748f, 11.7806f)
                curveTo(15.8188f, 11.9006f, 15.8188f, 12.1216f, 15.6748f, 12.2416f)
                lineTo(10.4438f, 16.6016f)
                curveTo(10.3898f, 16.6456f, 10.3278f, 16.6636f, 10.2658f, 16.6666f)
                close()
                moveTo(11.9998f, 1.9996f)
                curveTo(6.4768f, 1.9996f, 1.9998f, 6.4776f, 1.9998f, 11.9996f)
                curveTo(1.9998f, 17.5226f, 6.4768f, 21.9996f, 11.9998f, 21.9996f)
                curveTo(17.5228f, 21.9996f, 21.9998f, 17.5226f, 21.9998f, 11.9996f)
                curveTo(21.9998f, 6.4776f, 17.5228f, 1.9996f, 11.9998f, 1.9996f)
                close()
            }
        }.build().also {
            _triangleRightCircleFilled = it
        }
    }

private var _triangleRightCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleRightCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.TriangleRightCircleFilled,
            contentDescription = null,
    )
}
