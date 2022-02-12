package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultController[R] extends StObject {
  
  /* standard DOM */
  def close(): Unit = js.native
  
  /* standard DOM */
  val desiredSize: Double | Null = js.native
  
  /* standard DOM */
  def enqueue(): Unit = js.native
  def enqueue(chunk: R): Unit = js.native
  
  /* standard DOM */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}
