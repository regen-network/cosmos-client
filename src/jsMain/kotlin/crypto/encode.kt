package cosmos.client.crypto.bech32

import cosmos.client.Either

actual fun encode(bch: Bech32): Either<Error, String> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

actual fun decode(bch: String): Either<Error, Bech32> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}


@JsModule("bech32")
@JsName("decode")
external fun bech32Decode(bch: String): dynamic

external interface Bech32Result {
    val prefix: String
    val words: Array<Int>
}

@JsModule("bech32")
@JsName("encode")
external fun bech32Encode(bch: String): dynamic
