/**
 * JSON parse sample using Kotlin.
 * @author hayato ki <kai.21banana@gmail.com>
 */

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

fun main(args: Array<String>) {
    // パースするJSON
    val json = "{ \"color\": \"green\", \"kana\": \"みどり\", \"code\": { \"rgba\": [0,255,0,1], \"hex\": \"#0F0\" } }"

    // mapperオブジェクトを作成
    val mapper = jacksonObjectMapper()

    // jsonをdeserialize
    // 下の場合はjsonがColor型のオブジェクトにマッピングされる
    val color = mapper.readValue<Color>(json)

    println(color)
    println("色(かな)：${color.kana}")
    println("RGBAコードのG値：${color.code.rgba[1]}")
}