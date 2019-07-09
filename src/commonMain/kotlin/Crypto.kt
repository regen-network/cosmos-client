package cosmos.client

import kotlin.Result

interface Hash {
    fun update(bytes: ByteArray)
    fun hash(): ByteArray
}

expect class Sha256(): Hash{ }

expect class RipeMD160(): Hash {

}


