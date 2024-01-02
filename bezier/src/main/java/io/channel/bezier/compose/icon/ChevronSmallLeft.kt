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

val BezierIcon.ChevronSmallLeft: ImageVector
    get() {
        return _chevronSmallLeft ?: ImageVector.Builder(
                name = "ChevronSmallLeft",
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
                moveTo(14.2071f, 17.2071f)
                curveTo(13.8166f, 17.5976f, 13.1834f, 17.5976f, 12.7929f, 17.2071f)
                lineTo(8.2929f, 12.7071f)
                curveTo(7.9024f, 12.3166f, 7.9024f, 11.6834f, 8.2929f, 11.2929f)
                lineTo(12.7929f, 6.7929f)
                curveTo(13.1834f, 6.4024f, 13.8166f, 6.4024f, 14.2071f, 6.7929f)
                curveTo(14.5976f, 7.1834f, 14.5976f, 7.8166f, 14.2071f, 8.2071f)
                lineTo(10.4142f, 12.0f)
                lineTo(14.2071f, 15.7929f)
                curveTo(14.5976f, 16.1834f, 14.5976f, 16.8166f, 14.2071f, 17.2071f)
                close()
            }
        }.build().also {
            _chevronSmallLeft = it
        }
    }

private var _chevronSmallLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronSmallLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChevronSmallLeft,
            contentDescription = null,
    )
}
