package com.example.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.LoboroRoyalBlue
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow

/**
 * Reusable scalable LOBORO circular emblem with bold capital letter "L".
 * Uses Royal Blue (#102A8F / #0B1F6E), Bright Golden Yellow (#FFD700), and White (#FFFFFF).
 */
@Composable
fun LoboroLogoEmblem(
    modifier: Modifier = Modifier,
    size: Dp = 44.dp,
    contentDescriptionText: String? = "LOBORO Emblem"
) {
    Spacer(
        modifier = modifier
            .size(size)
            .semantics {
                if (contentDescriptionText != null) {
                    contentDescription = contentDescriptionText
                }
            }
            .drawWithCache {
                val w = this.size.width
                val h = this.size.height
                val radius = minOf(w, h) / 2f
                val center = Offset(w / 2f, h / 2f)
                val innerRadius = radius * 0.78f
                val ringStrokeWidth = (radius * 0.14f).coerceAtLeast(2f)
                val ringRadius = radius - ringStrokeWidth * 0.9f
                val ringStroke = Stroke(width = ringStrokeWidth)

                val leftX = w * 0.34f
                val topY = h * 0.25f
                val bottomY = h * 0.74f
                val stemWidth = w * 0.15f
                val footRightX = w * 0.69f
                val footHeight = h * 0.14f

                val lPath = Path().apply {
                    moveTo(leftX, topY)
                    lineTo(leftX + stemWidth, topY)
                    lineTo(leftX + stemWidth, bottomY - footHeight)
                    lineTo(footRightX, bottomY - footHeight)
                    lineTo(footRightX - w * 0.04f, bottomY)
                    lineTo(leftX, bottomY)
                    close()
                }
                val highlightStart = Offset(leftX + stemWidth * 0.78f, topY + h * 0.04f)
                val highlightEnd = Offset(leftX + stemWidth * 0.78f, bottomY - footHeight * 1.15f)
                val highlightStrokeWidth = (w * 0.04f).coerceAtLeast(1.2f)
                val footRectTopLeft = Offset(leftX + stemWidth * 0.9f, bottomY - footHeight * 0.35f)
                val footRectSize = Size((footRightX - leftX) * 0.45f, (h * 0.035f).coerceAtLeast(1.2f))

                onDrawBehind {
                    // Royal Blue circular medallion base
                    drawCircle(
                        color = LoboroRoyalBlue,
                        radius = radius,
                        center = center
                    )
                    drawCircle(
                        color = LoboroRoyalDeep,
                        radius = innerRadius,
                        center = center
                    )

                    // Crisp yellow outer emblem ring
                    drawCircle(
                        color = LoboroYellow,
                        radius = ringRadius,
                        center = center,
                        style = ringStroke
                    )

                    // Bold geometric capital "L" (yellow primary + white accent)
                    drawPath(path = lPath, color = LoboroYellow)

                    // Subtle crisp white inner highlight line along the "L" for high contrast at any scale
                    drawLine(
                        color = LoboroWhite,
                        start = highlightStart,
                        end = highlightEnd,
                        strokeWidth = highlightStrokeWidth,
                        cap = StrokeCap.Round
                    )
                    drawRect(
                        color = LoboroWhite,
                        topLeft = footRectTopLeft,
                        size = footRectSize
                    )
                }
            }
    )
}

@Composable
fun LoboroBrandLockup(
    tagline: String,
    modifier: Modifier = Modifier,
    textColor: Color = LoboroWhite,
    emblemSize: Dp = 38.dp,
    onEmblemTap: (() -> Unit)? = null,
    onWordmarkClick: (() -> Unit)? = null
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        val emblemModifier = if (onEmblemTap != null) {
            Modifier
                .testTag("loboro_logo_emblem")
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = onEmblemTap
                )
        } else {
            Modifier.testTag("loboro_logo_emblem")
        }
        LoboroLogoEmblem(
            modifier = emblemModifier,
            size = emblemSize
        )
        val wordmarkModifier = if (onWordmarkClick != null) {
            Modifier
                .testTag("top_home_logo_button")
                .clickable(onClick = onWordmarkClick)
        } else {
            Modifier
        }
        Column(modifier = wordmarkModifier) {
            Text(
                text = "LOBORO",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.ExtraBold,
                    letterSpacing = 1.2.sp
                ),
                color = textColor
            )
            Text(
                text = tagline,
                style = MaterialTheme.typography.labelSmall,
                color = LoboroYellow,
                maxLines = 1
            )
        }
    }
}
