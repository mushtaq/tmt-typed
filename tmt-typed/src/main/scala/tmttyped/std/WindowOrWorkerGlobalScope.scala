package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  /* standard DOM */
  def atob(data: java.lang.String): java.lang.String = js.native
  
  /* standard DOM */
  def btoa(data: java.lang.String): java.lang.String = js.native
  
  /** Available only in secure contexts. */
  /* standard DOM */
  val caches: org.scalajs.dom.CacheStorage = js.native
  
  /* standard DOM */
  def clearInterval(): Unit = js.native
  def clearInterval(handle: Double): Unit = js.native
  
  /* standard DOM */
  def clearTimeout(): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  
  /* standard DOM */
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
  /* standard DOM */
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
    image: ImageBitmapSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): js.Promise[ImageBitmap] = js.native
  
  /* standard DOM */
  val crossOriginIsolated: scala.Boolean = js.native
  
  /* standard DOM */
  val crypto: org.scalajs.dom.Crypto = js.native
  
  /* standard DOM */
  def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: RequestInfo, init: org.scalajs.dom.RequestInit): js.Promise[org.scalajs.dom.Response] = js.native
  
  /* standard DOM */
  val indexedDB: org.scalajs.dom.IDBFactory = js.native
  
  /* standard DOM */
  val isSecureContext: scala.Boolean = js.native
  
  /* standard DOM */
  val origin: java.lang.String = js.native
  
  /* standard DOM */
  val performance: org.scalajs.dom.Performance = js.native
  
  /* standard DOM */
  def queueMicrotask(callback: VoidFunction): Unit = js.native
  
  /* standard DOM */
  def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  /* standard DOM */
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
}
