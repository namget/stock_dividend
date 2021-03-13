package com.namget.stock.know.dividend.ext

import android.view.View
import androidx.annotation.IdRes
import androidx.constraintlayout.widget.ConstraintSet
import com.namget.stock.know.dividend.util.OnSingleListener

fun View.setOnSingleClickListener(onSingleClick: (View) -> Unit) {
    val singleClickListener = OnSingleListener {
        onSingleClick(it)
    }
    setOnClickListener(singleClickListener)
}

fun ConstraintSet.setTopConnect(@IdRes resId : Int , targetId : Int , margin : Int = 20){
    this.connect(
        resId,
        ConstraintSet.RIGHT,
        targetId,
        ConstraintSet.RIGHT,
        0
    )

    this.connect(
        resId,
        ConstraintSet.LEFT,
        targetId,
        ConstraintSet.LEFT,
        0
    )

    this.connect(
        resId,
        ConstraintSet.TOP,
        targetId,
        ConstraintSet.TOP,
        margin
    )
}


fun ConstraintSet.setBottomConnect(@IdRes resId : Int , targetId : Int , margin : Int = 20){
    this.connect(
        resId,
        ConstraintSet.RIGHT,
        targetId,
        ConstraintSet.RIGHT,
        0
    )

    this.connect(
        resId,
        ConstraintSet.LEFT,
        targetId,
        ConstraintSet.LEFT,
        0
    )

    this.connect(
        resId,
        ConstraintSet.BOTTOM,
        targetId,
        ConstraintSet.BOTTOM,
        margin
    )
}
