package otus.homework.flowcats

sealed class Result<T> {
    data class Success<T>(
        val result: T
    ) : Result<T>()

    data class Error<T>(
        val message: String?
    ) : Result<T>()
}
