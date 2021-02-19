package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.fsMod._PathLike
import tmttyped.node.nodeBooleans.`false`
import tmttyped.node.nodeBooleans.`true`
import tmttyped.node.urlMod.URLFormatOptions
import tmttyped.node.urlMod.URL_
import tmttyped.node.urlMod.Url
import tmttyped.node.urlMod.UrlObject
import tmttyped.node.urlMod.UrlWithParsedQuery
import tmttyped.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUrlMod {
  
  @JSImport("node:url", "URL")
  @js.native
  class URL protected ()
    extends URL_
       with _PathLike {
    def this(input: java.lang.String) = this()
    def this(input: java.lang.String, base: java.lang.String) = this()
    def this(input: java.lang.String, base: URL_) = this()
  }
  
  @JSImport("node:url", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends tmttyped.node.urlMod.URLSearchParams {
    def this(init: java.lang.String) = this()
    def this(init: js.Array[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    def this(init: js.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    def this(init: Dict[java.lang.String | js.Array[java.lang.String]]) = this()
    def this(init: tmttyped.node.urlMod.URLSearchParams) = this()
  }
  
  @JSImport("node:url", "domainToASCII")
  @js.native
  def domainToASCII(domain: java.lang.String): java.lang.String = js.native
  
  @JSImport("node:url", "domainToUnicode")
  @js.native
  def domainToUnicode(domain: java.lang.String): java.lang.String = js.native
  
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  @JSImport("node:url", "fileURLToPath")
  @js.native
  def fileURLToPath(url: java.lang.String): java.lang.String = js.native
  @JSImport("node:url", "fileURLToPath")
  @js.native
  def fileURLToPath(url: URL_): java.lang.String = js.native
  
  @JSImport("node:url", "format")
  @js.native
  def format(URL: URL_): java.lang.String = js.native
  @JSImport("node:url", "format")
  @js.native
  def format(URL: URL_, options: URLFormatOptions): java.lang.String = js.native
  @JSImport("node:url", "format")
  @js.native
  def format(urlObject: java.lang.String): java.lang.String = js.native
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @JSImport("node:url", "format")
  @js.native
  def format(urlObject: UrlObject): java.lang.String = js.native
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @JSImport("node:url", "parse")
  @js.native
  def parse(urlStr: java.lang.String): UrlWithStringQuery = js.native
  @JSImport("node:url", "parse")
  @js.native
  def parse(urlStr: java.lang.String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @JSImport("node:url", "parse")
  @js.native
  def parse(urlStr: java.lang.String, parseQueryString: Boolean): Url = js.native
  @JSImport("node:url", "parse")
  @js.native
  def parse(urlStr: java.lang.String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
  @JSImport("node:url", "parse")
  @js.native
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`): UrlWithStringQuery = js.native
  @JSImport("node:url", "parse")
  @js.native
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @JSImport("node:url", "parse")
  @js.native
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`): UrlWithParsedQuery = js.native
  @JSImport("node:url", "parse")
  @js.native
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
  
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  @JSImport("node:url", "pathToFileURL")
  @js.native
  def pathToFileURL(url: java.lang.String): URL_ = js.native
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @JSImport("node:url", "resolve")
  @js.native
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
}
