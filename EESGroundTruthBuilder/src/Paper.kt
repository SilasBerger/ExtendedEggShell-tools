/**
 * Created by Silas on 23.05.2017.
 */
data class Paper(val filename: String,
                 val title: String,
                 val year: Int,
                 val contributor1: String,
                 val contributor2: String = "",
                 val contributor3: String = "",
                 val contributor4: String = "",
                 val contributor5: String = "",
                 val contributor6: String = "",
                 val contributor7: String = "",
                 val contributor8: String = "",
                 val contributor9: String = "",
                 val contributor10: String = "",
                 val type: String = "Paper",
                 var id: Int = 0){

    override fun toString(): String{
        val builder = StringBuilder()
        builder.append(quote(id.toString()))
        appendComma(builder)
        builder.append(quote(filename))
        appendComma(builder)
        builder.append(quote(type))
        appendComma(builder)
        builder.append(quote(title))
        appendComma(builder)
        builder.append(quote(contributor1))
        appendComma(builder)
        builder.append(quote(contributor2))
        appendComma(builder)
        builder.append(quote(contributor3))
        appendComma(builder)
        builder.append(quote(contributor4))
        appendComma(builder)
        builder.append(quote(contributor5))
        appendComma(builder)
        builder.append(quote(contributor6))
        appendComma(builder)
        builder.append(quote(contributor7))
        appendComma(builder)
        builder.append(quote(contributor8))
        appendComma(builder)
        builder.append(quote(contributor9))
        appendComma(builder)
        builder.append(quote(contributor10))
        appendComma(builder)
        builder.append(quote(year.toString()))
        return builder.toString()
    }

    private fun appendComma(builder: StringBuilder){
        builder.append(",")
    }

    private fun quote(string: String) = if(string.isEmpty()) string else ("\"" + string + "\"")


}