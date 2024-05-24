package io.channel.bezier.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R

@Composable
fun SectionLabel(
        text: String,
        modifier: Modifier = Modifier,
        painter: Painter? = null,
        textColor: Color = BezierTheme.colors.txtBlackDark,
        leftContents: (@Composable RowScope.() -> Unit)? = null,
        nonButtonContents: (@Composable RowScope.() -> Unit)? = null,
        buttonContents: (@Composable RowScope.() -> Unit)? = null,
) {
    Row(
            modifier = modifier
                    .sizeIn(minHeight = 32.dp),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
                modifier = Modifier
                        .padding(
                                start = 6.dp,
                                top = 4.dp,
                                end = 12.dp,
                                bottom = 4.dp,
                        )
                        .sizeIn(minHeight = 24.dp)
                        .weight(1F),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            if (painter != null) {
                Icon(
                        modifier = Modifier
                                .padding(end = 12.dp)
                                .size(24.dp),
                        painter = painter,
                        tint = BezierTheme.colors.txtBlackDark,
                        contentDescription = null,
                )
            }

            Row(
                    verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                        modifier = Modifier.weight(1F, false),
                        text = text,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = textColor,
                )

                if (leftContents != null) {
                    leftContents()
                }
            }
        }

        CompositionLocalProvider(LocalContentColor provides BezierTheme.colors.txtBlackDark) {
            if (nonButtonContents != null) {
                Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    nonButtonContents()
                }
                Spacer(modifier = Modifier.width(6.dp))
            }

            if (buttonContents != null) {
                Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    buttonContents()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SectionLabelTextPreview() {
    Column {
        SectionLabel(
                text = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.",
        )
        SectionLabel(
                text = "It is a txtBlackDarkest color text",
                textColor = BezierTheme.colors.txtBlackDarkest,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun SectionLabelTextAndPainterPreview() {
    SectionLabel(
            painter = painterResource(R.drawable.icon_person),
            text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
    )
}

@Preview(showBackground = true)
@Composable
fun SectionLabelWithRightContentsPreview() {
    SectionLabel(
            painter = painterResource(R.drawable.icon_person),
            text = "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
            nonButtonContents = {
                Icon(
                        modifier = Modifier
                                .padding(end = 10.dp)
                                .size(20.dp),
                        painter = painterResource(R.drawable.icon_lock),
                        tint = BezierTheme.colors.txtBlackDark,
                        contentDescription = null,
                )
            },
            buttonContents = {
                Icon(
                        modifier = Modifier
                                .padding(end = 10.dp)
                                .size(20.dp),
                        painter = painterResource(R.drawable.icon_hyphen_bold),
                        tint = BezierTheme.colors.txtBlackDark,
                        contentDescription = null,
                )

                Icon(
                        modifier = Modifier
                                .padding(end = 5.dp)
                                .size(20.dp),
                        painter = painterResource(R.drawable.icon_cancel),
                        tint = BezierTheme.colors.txtBlackDark,
                        contentDescription = null,
                )
            },
    )
}

@Preview(showBackground = true)
@Composable
fun SectionLabelWithLeftContentsPreview() {
    SectionLabel(
            text = "Chat tags",
            leftContents = {
                Badge(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "Service Plan",
                        color = Badge.Color.Purple,
                        size = Badge.Size.S,
                )
            },
    )
}

@Composable
@Preview(showBackground = true)
private fun SectionLabelWithAllContentsPreview() {
    SectionLabel(
            painter = painterResource(R.drawable.icon_person),
            text = "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.",
            leftContents = {
                Badge(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "Service Plan",
                        color = Badge.Color.Purple,
                        size = Badge.Size.S,
                )
            },
            nonButtonContents = {
                Icon(
                        modifier = Modifier
                                .padding(5.dp)
                                .size(20.dp),
                        painter = painterResource(R.drawable.icon_lock),
                        tint = BezierTheme.colors.txtBlackDark,
                        contentDescription = null,
                )
            },
            buttonContents = {
                Icon(
                        modifier = Modifier
                                .padding(5.dp)
                                .size(20.dp),
                        painter = painterResource(R.drawable.icon_cancel),
                        tint = BezierTheme.colors.txtBlackDark,
                        contentDescription = null,
                )
            },
    )
}
