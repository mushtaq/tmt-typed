package tmttyped.std.global

import org.scalajs.dom.experimental.ResponseInit
import org.scalajs.dom.experimental.ResponseType
import tmttyped.std.BodyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
class Response ()
  extends tmttyped.std.Response {
  def this(body: BodyInit) = this()
  def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /* CompleteClass */
  override def blob(): js.Promise[org.scalajs.dom.raw.Blob] = js.native
  
  /* CompleteClass */
  override val body: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  
  /* CompleteClass */
  override def formData(): js.Promise[org.scalajs.dom.raw.FormData] = js.native
  
  /* CompleteClass */
  override val headers: org.scalajs.dom.experimental.Headers = js.native
  
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  
  /* CompleteClass */
  override val status: Double = js.native
  
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
  
  /* CompleteClass */
  override val trailer: js.Promise[org.scalajs.dom.experimental.Headers] = js.native
  
  /* CompleteClass */
  override val `type`: ResponseType = js.native
  
  /* CompleteClass */
  override val url: java.lang.String = js.native
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def error(): org.scalajs.dom.experimental.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[org.scalajs.dom.experimental.Response]
  
  @scala.inline
  def redirect(url: java.lang.String): org.scalajs.dom.experimental.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.experimental.Response]
  @scala.inline
  def redirect(url: java.lang.String, status: Double): org.scalajs.dom.experimental.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.experimental.Response]
}
