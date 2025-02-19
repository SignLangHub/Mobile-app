package com.example.signlanghub.ui.common.icon.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.signlanghub.ui.common.icon.IconPack

val IconPack.PhotoLibrary: ImageVector
    get() {
        if (_photoLibrary != null) {
            return _photoLibrary!!
        }
        _photoLibrary = Builder(name =
                "PhotoLibrary24dpE8eaedFill0Wght400Grad0Opsz24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe8eaed)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 560.0f)
                horizontalLineToRelative(400.0f)
                lineTo(622.0f, 380.0f)
                lineToRelative(-92.0f, 120.0f)
                lineToRelative(-62.0f, -80.0f)
                lineToRelative(-108.0f, 140.0f)
                close()
                moveTo(320.0f, 720.0f)
                quadToRelative(-33.0f, 0.0f, -56.5f, -23.5f)
                reflectiveQuadTo(240.0f, 640.0f)
                verticalLineToRelative(-480.0f)
                quadToRelative(0.0f, -33.0f, 23.5f, -56.5f)
                reflectiveQuadTo(320.0f, 80.0f)
                horizontalLineToRelative(480.0f)
                quadToRelative(33.0f, 0.0f, 56.5f, 23.5f)
                reflectiveQuadTo(880.0f, 160.0f)
                verticalLineToRelative(480.0f)
                quadToRelative(0.0f, 33.0f, -23.5f, 56.5f)
                reflectiveQuadTo(800.0f, 720.0f)
                lineTo(320.0f, 720.0f)
                close()
                moveTo(320.0f, 640.0f)
                horizontalLineToRelative(480.0f)
                verticalLineToRelative(-480.0f)
                lineTo(320.0f, 160.0f)
                verticalLineToRelative(480.0f)
                close()
                moveTo(160.0f, 880.0f)
                quadToRelative(-33.0f, 0.0f, -56.5f, -23.5f)
                reflectiveQuadTo(80.0f, 800.0f)
                verticalLineToRelative(-560.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(560.0f)
                horizontalLineToRelative(560.0f)
                verticalLineToRelative(80.0f)
                lineTo(160.0f, 880.0f)
                close()
                moveTo(320.0f, 160.0f)
                verticalLineToRelative(480.0f)
                verticalLineToRelative(-480.0f)
                close()
            }
        }
        .build()
        return _photoLibrary!!
    }

private var _photoLibrary: ImageVector? = null
