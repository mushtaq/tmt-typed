package tmttyped.std.global

import org.scalajs.dom.ResponseInit
import org.scalajs.dom.ResponseType
import tmttyped.std.BodyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
/* standard DOM */
class Response ()
  extends StObject
     with tmttyped.std.Response {
  def this(body: BodyInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def blob(): js.Promise[org.scalajs.dom.Blob] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val body: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def formData(): js.Promise[org.scalajs.dom.FormData] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val headers: org.scalajs.dom.Headers = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def json(): js.Promise[Any] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val status: Double = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  @scala.inline
  def error(): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[org.scalajs.dom.Response]
  
  /* standard DOM */
  @scala.inline
  def redirect(url: java.lang.String): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
  @scala.inline
  def redirect(url: java.lang.String, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
  @scala.inline
  def redirect(url: org.scalajs.dom.URL): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
  @scala.inline
  def redirect(url: org.scalajs.dom.URL, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
}
