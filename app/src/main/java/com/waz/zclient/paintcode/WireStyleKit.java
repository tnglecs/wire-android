/**
 * Wire
 * Copyright (C) 2018 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.paintcode;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;



/**
 * Created by Wire Design Team on 15. Jan 2018.
 * Copyright © 2018 Wire Swiss GmbH. All rights reserved.
 *
 * Generated by PaintCode
 * http://www.paintcodeapp.com
 *
 * @author Wire Design Team
 */
public class WireStyleKit {


    // Resizing Behavior
    public enum ResizingBehavior {
        AspectFit, //!< The content is proportionally resized to fit into the target rectangle.
        AspectFill, //!< The content is proportionally resized to completely fill the target rectangle.
        Stretch, //!< The content is stretched to match the entire target rectangle.
        Center, //!< The content is centered in the target rectangle, but it is NOT resized.
    }

    // Canvas Drawings
    // Tab

    private static class CacheForAvailableIcon {
        private static Paint paint = new Paint();
        private static RectF originalFrame = new RectF(0f, 0f, 64f, 64f);
        private static RectF resizedFrame = new RectF();
        private static RectF availableRect = new RectF();
        private static Path availablePath = new Path();
    }

    public static void drawAvailableIcon(Canvas canvas, int color3) {
        WireStyleKit.drawAvailableIcon(canvas, new RectF(0f, 0f, 64f, 64f), ResizingBehavior.AspectFit, color3);
    }

    public static void drawAvailableIcon(Canvas canvas, RectF targetFrame, ResizingBehavior resizing, int color3) {
        // General Declarations
        Paint paint = CacheForAvailableIcon.paint;

        // Resize to Target Frame
        canvas.save();
        RectF resizedFrame = CacheForAvailableIcon.resizedFrame;
        WireStyleKit.resizingBehaviorApply(resizing, CacheForAvailableIcon.originalFrame, targetFrame, resizedFrame);
        canvas.translate(resizedFrame.left, resizedFrame.top);
        canvas.scale(resizedFrame.width() / 64f, resizedFrame.height() / 64f);

        // Available
        RectF availableRect = CacheForAvailableIcon.availableRect;
        availableRect.set(0f, 0f, 64f, 64f);
        Path availablePath = CacheForAvailableIcon.availablePath;
        availablePath.reset();
        availablePath.moveTo(32f, 64f);
        availablePath.cubicTo(49.67f, 64f, 64f, 49.67f, 64f, 32f);
        availablePath.cubicTo(64f, 14.33f, 49.67f, 0f, 32f, 0f);
        availablePath.cubicTo(14.33f, 0f, 0f, 14.33f, 0f, 32f);
        availablePath.cubicTo(0f, 49.67f, 14.33f, 64f, 32f, 64f);
        availablePath.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        availablePath.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color3);
        canvas.drawPath(availablePath, paint);

        canvas.restore();
    }

    private static class CacheForAwayIcon {
        private static Paint paint = new Paint();
        private static RectF originalFrame = new RectF(0f, 0f, 64f, 64f);
        private static RectF resizedFrame = new RectF();
        private static RectF awayRect = new RectF();
        private static Path awayPath = new Path();
    }

    public static void drawAwayIcon(Canvas canvas, int color2) {
        WireStyleKit.drawAwayIcon(canvas, new RectF(0f, 0f, 64f, 64f), ResizingBehavior.AspectFit, color2);
    }

    public static void drawAwayIcon(Canvas canvas, RectF targetFrame, ResizingBehavior resizing, int color2) {
        // General Declarations
        Paint paint = CacheForAwayIcon.paint;

        // Resize to Target Frame
        canvas.save();
        RectF resizedFrame = CacheForAwayIcon.resizedFrame;
        WireStyleKit.resizingBehaviorApply(resizing, CacheForAwayIcon.originalFrame, targetFrame, resizedFrame);
        canvas.translate(resizedFrame.left, resizedFrame.top);
        canvas.scale(resizedFrame.width() / 64f, resizedFrame.height() / 64f);

        // Away
        RectF awayRect = CacheForAwayIcon.awayRect;
        awayRect.set(0f, 0f, 64f, 64f);
        Path awayPath = CacheForAwayIcon.awayPath;
        awayPath.reset();
        awayPath.moveTo(32f, 64f);
        awayPath.cubicTo(14.33f, 64f, 0f, 49.67f, 0f, 32f);
        awayPath.cubicTo(0f, 14.33f, 14.33f, 0f, 32f, 0f);
        awayPath.cubicTo(49.67f, 0f, 64f, 14.33f, 64f, 32f);
        awayPath.cubicTo(64f, 49.67f, 49.67f, 64f, 32f, 64f);
        awayPath.close();
        awayPath.moveTo(32f, 51.2f);
        awayPath.cubicTo(42.6f, 51.2f, 51.2f, 42.6f, 51.2f, 32f);
        awayPath.cubicTo(51.2f, 21.4f, 42.6f, 12.8f, 32f, 12.8f);
        awayPath.cubicTo(21.4f, 12.8f, 12.8f, 21.4f, 12.8f, 32f);
        awayPath.cubicTo(12.8f, 42.6f, 21.4f, 51.2f, 32f, 51.2f);
        awayPath.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        awayPath.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color2);
        canvas.drawPath(awayPath, paint);

        canvas.restore();
    }

    private static class CacheForBusyIcon {
        private static Paint paint = new Paint();
        private static RectF originalFrame = new RectF(0f, 0f, 64f, 64f);
        private static RectF resizedFrame = new RectF();
        private static RectF busyRect = new RectF();
        private static Path busyPath = new Path();
    }

    public static void drawBusyIcon(Canvas canvas, int color) {
        WireStyleKit.drawBusyIcon(canvas, new RectF(0f, 0f, 64f, 64f), ResizingBehavior.AspectFit, color);
    }

    public static void drawBusyIcon(Canvas canvas, RectF targetFrame, ResizingBehavior resizing, int color) {
        // General Declarations
        Paint paint = CacheForBusyIcon.paint;

        // Resize to Target Frame
        canvas.save();
        RectF resizedFrame = CacheForBusyIcon.resizedFrame;
        WireStyleKit.resizingBehaviorApply(resizing, CacheForBusyIcon.originalFrame, targetFrame, resizedFrame);
        canvas.translate(resizedFrame.left, resizedFrame.top);
        canvas.scale(resizedFrame.width() / 64f, resizedFrame.height() / 64f);

        // Busy
        RectF busyRect = CacheForBusyIcon.busyRect;
        busyRect.set(0f, 0f, 64f, 64f);
        Path busyPath = CacheForBusyIcon.busyPath;
        busyPath.reset();
        busyPath.moveTo(32f, 64f);
        busyPath.cubicTo(14.33f, 64f, 0f, 49.67f, 0f, 32f);
        busyPath.cubicTo(0f, 14.33f, 14.33f, 0f, 32f, 0f);
        busyPath.cubicTo(49.67f, 0f, 64f, 14.33f, 64f, 32f);
        busyPath.cubicTo(64f, 49.67f, 49.67f, 64f, 32f, 64f);
        busyPath.close();
        busyPath.moveTo(12.8f, 25.6f);
        busyPath.lineTo(12.8f, 38.4f);
        busyPath.lineTo(51.2f, 38.4f);
        busyPath.lineTo(51.2f, 25.6f);
        busyPath.lineTo(12.8f, 25.6f);
        busyPath.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        busyPath.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(busyPath, paint);

        canvas.restore();
    }

    private static class CacheForDownArrow {
        private static Paint paint = new Paint();
        private static RectF originalFrame = new RectF(0f, 0f, 64f, 64f);
        private static RectF resizedFrame = new RectF();
        private static RectF downArrowRect = new RectF();
        private static Path downArrowPath = new Path();
    }

    public static void drawDownArrow(Canvas canvas, int color) {
        WireStyleKit.drawDownArrow(canvas, new RectF(0f, 0f, 64f, 64f), ResizingBehavior.AspectFit, color);
    }

    public static void drawDownArrow(Canvas canvas, RectF targetFrame, ResizingBehavior resizing, int color) {
        // General Declarations
        Paint paint = CacheForDownArrow.paint;

        // Resize to Target Frame
        canvas.save();
        RectF resizedFrame = CacheForDownArrow.resizedFrame;
        WireStyleKit.resizingBehaviorApply(resizing, CacheForDownArrow.originalFrame, targetFrame, resizedFrame);
        canvas.translate(resizedFrame.left, resizedFrame.top);
        canvas.scale(resizedFrame.width() / 64f, resizedFrame.height() / 64f);

        // DownArrow
        RectF downArrowRect = CacheForDownArrow.downArrowRect;
        downArrowRect.set(23f, 0f, 42f, 63f);
        Path downArrowPath = CacheForDownArrow.downArrowPath;
        downArrowPath.reset();
        downArrowPath.moveTo(40.25f, 52.03f);
        downArrowPath.lineTo(42f, 53.74f);
        downArrowPath.lineTo(32.5f, 63f);
        downArrowPath.lineTo(23f, 53.74f);
        downArrowPath.lineTo(24.75f, 52.03f);
        downArrowPath.lineTo(31.26f, 58.36f);
        downArrowPath.lineTo(31.26f, 0f);
        downArrowPath.lineTo(33.74f, 0f);
        downArrowPath.lineTo(33.74f, 58.37f);
        downArrowPath.lineTo(40.25f, 52.03f);
        downArrowPath.close();

        paint.reset();
        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
        downArrowPath.setFillType(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        canvas.drawPath(downArrowPath, paint);

        canvas.restore();
    }


    // Canvas Images
    // Tab

    public static Bitmap imageOfAvailableIcon(int color3) {
        Bitmap imageOfAvailableIcon = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfAvailableIcon);
        WireStyleKit.drawAvailableIcon(canvas, color3);

        return imageOfAvailableIcon;
    }

    public static Bitmap imageOfAwayIcon(int color2) {
        Bitmap imageOfAwayIcon = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfAwayIcon);
        WireStyleKit.drawAwayIcon(canvas, color2);

        return imageOfAwayIcon;
    }

    public static Bitmap imageOfBusyIcon(int color) {
        Bitmap imageOfBusyIcon = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfBusyIcon);
        WireStyleKit.drawBusyIcon(canvas, color);

        return imageOfBusyIcon;
    }

    public static Bitmap imageOfDownArrow(int color) {
        Bitmap imageOfDownArrow = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(imageOfDownArrow);
        WireStyleKit.drawDownArrow(canvas, color);

        return imageOfDownArrow;
    }


    // Resizing Behavior
    public static void resizingBehaviorApply(ResizingBehavior behavior, RectF rect, RectF target, RectF result) {
        if (rect.equals(target) || target == null) {
            result.set(rect);
            return;
        }

        if (behavior == ResizingBehavior.Stretch) {
            result.set(target);
            return;
        }

        float xRatio = Math.abs(target.width() / rect.width());
        float yRatio = Math.abs(target.height() / rect.height());
        float scale = 0f;

        switch (behavior) {
            case AspectFit: {
                scale = Math.min(xRatio, yRatio);
                break;
            }
            case AspectFill: {
                scale = Math.max(xRatio, yRatio);
                break;
            }
            case Center: {
                scale = 1f;
                break;
            }
        }

        float newWidth = Math.abs(rect.width() * scale);
        float newHeight = Math.abs(rect.height() * scale);
        result.set(target.centerX() - newWidth / 2,
            target.centerY() - newHeight / 2,
            target.centerX() + newWidth / 2,
            target.centerY() + newHeight / 2);
    }


}
