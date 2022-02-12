package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system. */
@js.native
trait Blob extends StObject {
  
  /* standard DOM */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard DOM */
  val size: Double = js.native
  
  /* standard DOM */
  def slice(): org.scalajs.dom.Blob = js.native
  def slice(start: Double): org.scalajs.dom.Blob = js.native
  def slice(start: Double, end: Double): org.scalajs.dom.Blob = js.native
  def slice(start: Double, end: Double, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  def slice(start: Double, end: Unit, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  def slice(start: Unit, end: Double): org.scalajs.dom.Blob = js.native
  def slice(start: Unit, end: Double, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  def slice(start: Unit, end: Unit, contentType: java.lang.String): org.scalajs.dom.Blob = js.native
  
  /* standard DOM */
  def stream(): org.scalajs.dom.ReadableStream[Any] = js.native
  
  /* standard DOM */
  def text(): js.Promise[java.lang.String] = js.native
  
  /* standard DOM */
  val `type`: java.lang.String = js.native
}
