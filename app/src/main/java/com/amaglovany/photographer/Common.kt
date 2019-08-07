package com.amaglovany.photographer

import androidx.fragment.app.Fragment
import com.amaglovany.photographer.internal.PhotographerImpl

fun Fragment.photographer(authority: String): Photographer = PhotographerImpl(this, authority)
fun Photographer.toResultHandler(): ResultHandler = this as ResultHandler