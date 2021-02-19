package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("webkitURL")
@js.native
class webkitURL protected ()
  extends tmttyped.std.URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: org.scalajs.dom.experimental.URL) = this()
  
  /* CompleteClass */
  override var hash: java.lang.String = js.native
  
  /* CompleteClass */
  override var host: java.lang.String = js.native
  
  /* CompleteClass */
  override var hostname: java.lang.String = js.native
  
  /* CompleteClass */
  override var href: java.lang.String = js.native
  
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* CompleteClass */
  override var password: java.lang.String = js.native
  
  /* CompleteClass */
  override var pathname: java.lang.String = js.native
  
  /* CompleteClass */
  override var port: java.lang.String = js.native
  
  /* CompleteClass */
  override var protocol: java.lang.String = js.native
  
  /* CompleteClass */
  override var search: java.lang.String = js.native
  
  /* CompleteClass */
  override val searchParams: tmttyped.std.URLSearchParams = js.native
  
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  
  /* CompleteClass */
  override var username: java.lang.String = js.native
}
/* was `typeof URL` */
object webkitURL {
  
  @JSGlobal("webkitURL.createObjectURL")
  @js.native
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  
  @JSGlobal("webkitURL.revokeObjectURL")
  @js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}
