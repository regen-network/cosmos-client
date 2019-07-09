package cosmos.client

sealed class Either<out E: Throwable, out V> {
    data class Success<out V>(val value: V): Either<Nothing, V>()
    data class Failure<out E: Throwable>(val error: E): Either<E, Nothing>()
}