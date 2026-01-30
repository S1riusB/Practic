package block12_DSL

/*
    Q31: Build a small DSL for building HTML.
    Create classes HTML, Body, and Paragraph,
    and implement a function that constructs an HTML structure using a Kotlin DSL style.
 */

class Paragraph {
    var text: String = ""

    override fun toString(): String {
        return "\t\t<p>$text</p>"
    }
}

class Body {
    private val tags = mutableListOf<Paragraph>()

    fun p(init: Paragraph.() -> Unit) {
        val paragraph = Paragraph()
        paragraph.init()
        tags.add(paragraph)
    }

    override fun toString(): String {
        val content = tags.joinToString("\n") { it.toString() }
        return "\t<body>\n$content\n\t</body>"
    }

}

class HTML {
    private var body: Body? = null

    fun body(init: Body.() -> Unit) {
        val b = Body()
        b.init()
        body = b
    }

    override fun toString(): String {
        return "<html>\n$body\n</html>"
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html

}


fun main() {
    val page = html {
        body {
            p {
                text = "Hello World!"
            }
        }
    }

    println(page)
}