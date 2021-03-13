package com.namget.stock.know.dividend.ext

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.widget.ImageView
import java.io.ByteArrayOutputStream

fun Drawable.toBitmap(): Bitmap {
    var bitmap: Bitmap? = null

    if (this is BitmapDrawable) {
        val bitmapDrawable = this
        if (bitmapDrawable.bitmap != null) {
            return bitmapDrawable.bitmap;
        }
    }
    bitmap = if (this.intrinsicWidth <= 0 || this.intrinsicHeight <= 0) {
        Bitmap.createBitmap(
            1,
            1,
            Bitmap.Config.ARGB_8888
        )
    } else {
        Bitmap.createBitmap(
            this.intrinsicWidth,
            this.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
    }
    val canvas = Canvas(bitmap);
    this.setBounds(0, 0, canvas.width, canvas.height);
    this.draw(canvas);
    return bitmap
}

fun Bitmap.toByteArray(): ByteArray {
    val stream = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.PNG, 100, stream)
    return stream.toByteArray()
}

fun ImageView.setImageFromFilePath(path : String) {
    // Get the dimensions of the View
    val targetW: Int = 148
    val targetH: Int = 148

    val bmOptions = BitmapFactory.Options().apply {
        // Get the dimensions of the bitmap
        inJustDecodeBounds = true

        val photoW: Int = outWidth
        val photoH: Int = outHeight

        // Determine how much to scale down the image
        val scaleFactor: Int = Math.min(photoW / targetW, photoH / targetH)

        // Decode the image file into a Bitmap sized to fill the View
        inJustDecodeBounds = false
        inSampleSize = scaleFactor
    }
    BitmapFactory.decodeFile(path, bmOptions)?.also { bitmap ->
        this.setImageBitmap(bitmap)
    }
}


fun ByteArray.toBitmap(): Bitmap? = BitmapFactory.decodeByteArray(this, 0, this.size)




