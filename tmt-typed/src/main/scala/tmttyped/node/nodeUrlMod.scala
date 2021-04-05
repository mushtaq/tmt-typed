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
  
  @JSImport("node:url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def domainToASCII(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def domainToUnicode(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  @scala.inline
  def fileURLToPath(url: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def fileURLToPath(url: URL_): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def format(URL: URL_): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def format(URL: URL_, options: URLFormatOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(urlObject: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def format(urlObject: UrlObject): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def parse(urlStr: java.lang.String): UrlWithStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any]).asInstanceOf[UrlWithStringQuery]
  @scala.inline
  def parse(urlStr: java.lang.String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def parse(urlStr: java.lang.String, parseQueryString: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[Url]
  @scala.inline
  def parse(urlStr: java.lang.String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url]
  
  @scala.inline
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  @scala.inline
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  @scala.inline
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  @scala.inline
  def pathToFileURL(url: java.lang.String): URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToFileURL")(url.asInstanceOf[js.Any]).asInstanceOf[URL_]
  
  /** @deprecated since v11.0.0 - Use the WHATWG URL API. */
  @scala.inline
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
