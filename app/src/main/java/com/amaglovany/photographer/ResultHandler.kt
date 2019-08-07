package com.amaglovany.photographer

import android.content.Intent

/** An abstraction for [Intent]'s transfer to internal implementation */
interface ResultHandler {
    fun handle(requestCode: Int, resultCode: Int, data: Intent?): Boolean
}