package com.amaglovany.photographer

import java.io.File

interface Photographer {
    enum class Source { CAMERA, GALLERY; }

    /**
     * Choose photo asynchronously relative to provided [Source]
     *
     * @return an optional [File] with result.
     *         Null in case of cancellation
     */
    @Throws(Exception::class)
    suspend fun choose(source: Source): File?

    sealed class Exception(message: String?, cause: Throwable?) : Throwable(message, cause) {
        class ContextNotFound : Exception(null, null)
        class UnableCreateFile : Exception(null, null)
        class UnableLaunchCamera : Exception(null, null)
    }
}