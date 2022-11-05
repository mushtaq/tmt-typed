package tmttyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes.
  * @deprecated
  */
@js.native
trait MimeTypeArray
  extends StObject
     with /* standard DOM */
/* index */ NumberDictionary[MimeType] {
  
  /** @deprecated */
  /* standard DOM */
  def item(index: Double): MimeType | Null = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  
  /** @deprecated */
  /* standard DOM */
  val length: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}
