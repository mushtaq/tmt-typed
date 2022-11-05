package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way to easily construct a set of key/value pairs representing form fields and their values, which can then be easily sent using the XMLHttpRequest.send() method. It uses the same format a form would use if the encoding type were set to "multipart/form-data". */
@js.native
trait FormData extends StObject {
  
  /* standard DOM */
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  def append(name: java.lang.String, value: java.lang.String, fileName: java.lang.String): Unit = js.native
  def append(name: java.lang.String, value: org.scalajs.dom.Blob): Unit = js.native
  def append(name: java.lang.String, value: org.scalajs.dom.Blob, fileName: java.lang.String): Unit = js.native
  
  /* standard DOM */
  def delete(name: java.lang.String): Unit = js.native
  
  /** Returns an array of key, value pairs for every entry in the list. */
  /* standard DOM.Iterable */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, FormDataEntryValue]] = js.native
  
  /* standard DOM */
  def forEach(
    callbackfn: js.Function3[
      /* value */ FormDataEntryValue, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      Unit
    ]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ FormDataEntryValue, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      Unit
    ],
    thisArg: Any
  ): Unit = js.native
  
  /* standard DOM */
  def get(name: java.lang.String): FormDataEntryValue | Null = js.native
  
  /* standard DOM */
  def getAll(name: java.lang.String): js.Array[FormDataEntryValue] = js.native
  
  /* standard DOM */
  def has(name: java.lang.String): scala.Boolean = js.native
  
  /* standard DOM.Iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, FormDataEntryValue]]] = js.native
  
  /** Returns a list of keys in the list. */
  /* standard DOM.Iterable */
  def keys(): IterableIterator[java.lang.String] = js.native
  
  /* standard DOM */
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  def set(name: java.lang.String, value: java.lang.String, fileName: java.lang.String): Unit = js.native
  def set(name: java.lang.String, value: org.scalajs.dom.Blob): Unit = js.native
  def set(name: java.lang.String, value: org.scalajs.dom.Blob, fileName: java.lang.String): Unit = js.native
  
  /** Returns a list of values in the list. */
  /* standard DOM.Iterable */
  def values(): IterableIterator[FormDataEntryValue] = js.native
}
