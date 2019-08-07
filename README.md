# Photographer
An example of usage Kotlin Coroutines to take a photo

Taking photos becomes as simple as

```kotlin
private val photographer by lazy { photographer("com.amaglovany.files") }

override fun onClick(v: View) = launch(Dispatchers.Main + exceptionHandler) {
  val file: File? = photographer.choose(Photographer.Source.CAMERA)
  // do something with file
}

```
