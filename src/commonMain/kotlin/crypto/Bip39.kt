package cosmos.client.crypto.bip39


enum class MnemonicType {
    Words12,
    Words15,
    Words18,
    Words21,
    Words24,
}

enum class Language {
    English,
    ChineseSimplified,
    ChineseTraditional,
    French,
    Italian,
    Japanese,
    Korean,
    Spanish,
}


expect class Mnemonic constructor(type: MnemonicType, language: Language) {
    fun phrase(): String
}

expect fun fromEntropy(entropy: ByteArray, lang: Language): Mnemonic
expect fun fromPhrase(phrase: String, lang: Language): Mnemonic

