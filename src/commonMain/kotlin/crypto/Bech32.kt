package cosmos.client.crypto.bech32

import cosmos.client.Either

class Bech32(val hrp: String, val data: ByteArray)

data class Error(val type: Type): Exception(type.name) {
    enum class Type {
        MissingSeparator,
        InvalidChecksum,
        InvalidLength,
        InvalidChar,
        InvalidData,
        MixedCase,
    }

}

expect fun encode(bch: Bech32): Either<Error, String>

expect fun decode(bch: String): Either<Error, Bech32>

