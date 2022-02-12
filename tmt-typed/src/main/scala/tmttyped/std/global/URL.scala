package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URL")
@js.native
class URL protected ()
  extends StObject
     with tmttyped.std.URL {
  /* standard DOM */
  def this(url: java.lang.String) = this()
  def this(url: org.scalajs.dom.URL) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: org.scalajs.dom.URL) = this()
  def this(url: org.scalajs.dom.URL, base: java.lang.String) = this()
  def this(url: org.scalajs.dom.URL, base: org.scalajs.dom.URL) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override var hash: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var host: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var hostname: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var href: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var password: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var pathname: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var port: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var protocol: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var search: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val searchParams: tmttyped.std.URLSearchParams = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override var username: java.lang.String = js.native
}
object URL {
  
  @JSGlobal("URL")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  @scala.inline
  def createObjectURL(obj: org.scalajs.dom.Blob): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def createObjectURL(obj: tmttyped.std.MediaSource): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /* standard DOM */
  @scala.inline
  def revokeObjectURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
